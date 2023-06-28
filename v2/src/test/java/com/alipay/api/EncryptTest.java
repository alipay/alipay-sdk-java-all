/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.internal.util.AlipayEncrypt;
import com.alipay.api.internal.util.codec.Base64;
import com.alipay.api.internal.util.encrypt.Encrypt;
import org.junit.Test;

import javax.crypto.KeyGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
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

    @Test
    public void testAll() throws AlipayApiException {


        byte[] key = generateKey("AES");
        final String encKey = Base64.encodeBase64String(key);
        String raw = "test1234567你好";
        String charset = "utf-8";

        System.out.println("key --->" + encKey);

        for (Map.Entry<String, Encrypt> stringEncryptEntry : AlipayEncrypt.getEncryptManager().entrySet()) {
            String encryptType = stringEncryptEntry.getKey();
            //given
            String chipertext = AlipayEncrypt.encryptContent(raw, encryptType, encKey, charset);

            String plaintext = AlipayEncrypt.decryptContent(chipertext, encryptType, encKey, charset);

            assertThat(plaintext, containsString(raw));

            System.out.println(plaintext + " --- " + encryptType + " --->" + chipertext);

        }

        //given
        String chipertext = AlipayEncrypt.encryptContent(raw, "SM4", encKey, charset);
        String plaintext = AlipayEncrypt.decryptContent(chipertext, "SM4", encKey, charset);
        assertThat(plaintext, containsString(raw));
        System.out.println(plaintext + " --- " + "SM4" + " --->" + chipertext);

    }


    @Test
    public void testAcross() throws AlipayApiException {

        byte[] key = Base64.decodeBase64String("vEARwBsVE8dBrk0tiaNQtQ==");

        Map<String, String> checkMap = new HashMap<String, String>();
        checkMap.put("AES", "Xg5Qdr1jGhRugqAdBHYgl94KzwIqcaA37/dMvR1PeSc=");
        checkMap.put("AES_V2", "2QL0g2nIXPryV+HHfsjcFiekGJIczOnP3DB8PakDw89AzuFjayOxIE19Zu8OyY3O");
        checkMap.put("SM4", "eYOm33zpxniyBwCUAgSUX9EcGrkj56LhXxiuo0VyY4OfkLFA51Qeyrz6OnuA8pkjuw==");

        final String encKey = Base64.encodeBase64String(key);
        String raw = "test1234567你好";
        String charset = "utf-8";

        System.out.println("key --->" + encKey);

        for (Map.Entry<String, Encrypt> stringEncryptEntry : AlipayEncrypt.getEncryptManager().entrySet()) {
            String encryptType = stringEncryptEntry.getKey();

            String chipertext = AlipayEncrypt.encryptContent(raw, encryptType, encKey, charset);

            System.out.println(encryptType +" --> "+ chipertext);

        }

        for (Map.Entry<String, String> entry : checkMap.entrySet()) {

            final String decrypted = AlipayEncrypt.decryptContent(entry.getValue(), entry.getKey(), encKey, charset);

            System.out.println(entry.getKey() +" --> "+ entry.getValue());

            assertThat(decrypted, equalTo(raw));
        }

    }


    public static byte[] generateKey(String alg) {
        KeyGenerator keygen;
        try {
            keygen = KeyGenerator.getInstance(alg);
            keygen.init(128);
            return keygen.generateKey().getEncoded();
        } catch (NoSuchAlgorithmException ignored) {
        }
        return null;
    }

}