package com.kaishengit;

import org.apache.commons.codec.digest.DigestUtils;

public class Test {

    @org.junit.Test
    public void test( ) {
        System.out.println(DigestUtils.md5Hex("123123QDF&*^%&#$%$$%#123123^%^#%$#"));
        // f76a319dbd7ad4d3c153c775ad503f37
    }
}
