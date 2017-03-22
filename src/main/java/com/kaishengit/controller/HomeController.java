package com.kaishengit.controller;


import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class HomeController {

    @Value("${user.salt}")
    private String passwordSalt;

    /**
     * 登录页面    *
     * @return
     */
    @Test
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String login(String username, String password, RedirectAttributes redirectAttributes) {
        // 获取登录页name属性的username

        //获取认证主体，如果主体已存在，则将当前的主体退出
        Subject subject = SecurityUtils.getSubject();
        if(subject.isAuthenticated()) {
            subject.logout();
        }

        try {
            //登录，调用ShiroRealm类中的登录认证方法（验证前端的username和password与数据库比对）
            // TODO DigestUtils.md5Hex(password+passwordSalt)
            subject.login(new UsernamePasswordToken(username, DigestUtils.md5Hex(password+passwordSalt)));

            return "redirect:/home";
        } catch (AuthenticationException ex) {
            ex.printStackTrace();
            redirectAttributes.addFlashAttribute("message","账号或密码错误");
            return "redirect:/";
        }
    }


    /**
     * 安全退出
     * @return
     */
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(RedirectAttributes redirectAttributes) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        redirectAttributes.addFlashAttribute("message","你已安全退出");
        return "redirect:/";
    }


    /**
     * 登录后的页面
     */
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home() {
        return "home";
    }

}
