/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.internal.util.AlipayEncrypt;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author junying
 * @version : EncryptTest.java, v 0.1 2019年12月20日 16:30 junying Exp $
 */
public class EncryptTest {

    @Test
    public void should_get_correct_chipertext() throws AlipayApiException {
        //given
        String chipertext = AlipayEncrypt.encryptContent("test1234567", "AES", "aa4BtZ4tspm2wnXLb1ThQA==", "utf-8");

        assertThat(chipertext, containsString("ILpoMowjIQjfYMR847rnFQ=="));
    }

    @Test
    public void should_get_correct_plaintext() throws AlipayApiException {
        //given
        String plaintext = AlipayEncrypt.decryptContent("ILpoMowjIQjfYMR847rnFQ==", "AES", "aa4BtZ4tspm2wnXLb1ThQA==", "utf-8");

        assertThat(plaintext, containsString("test1234567"));
    }

}