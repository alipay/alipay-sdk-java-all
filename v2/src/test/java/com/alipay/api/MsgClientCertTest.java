/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.api;

import com.alipay.api.domain.AlipayOpenAppOpenbizmockMessageSendModel;
import com.alipay.api.msg.AlipayMsgClient;
import com.alipay.api.msg.MsgHandler;
import com.alipay.api.msg.ProduceMsgAck;
import com.alipay.api.request.AlipayOpenAppOpenbizmockMessageSendRequest;
import com.alipay.api.response.AlipayOpenAppOpenbizmockMessageSendResponse;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author junying
 * @version : MsgClientCertTest.java, v 0.1 2020年12月02日 11:52 上午 junying Exp $
 */
public class MsgClientCertTest {

    @Ignore
    public void websocketRSA2CertTest() {
        AlipayMsgClient alipayMsgClient;
        String appId = "2021000149644027";
        String serverHost = "openchannel-0.rz00b.dev.alipay.net";
        boolean isSSL = false;
        String signType = "RSA2";
        String charset = "UTF-8";
        String appPrivateKey
                = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDKb72RRw+36+LOAvWmpkPMp8G2sv/u1b8DQ5rzdjM3FHi3jAf8jtg41Cu6B+azBWgwzdyKYRHjwTPaP7yOF6uITYzdu68XRmJGyt0opyWjGNcYSOcC1TGoThfXPRJIlGCAJLsnEwapIx8w3rxiFh/Yg9QCoYeT325/KOjvyTVBphbZO+jeIpfj8gHF3KkohgFFHAKFzM0xQyYsEyKdRJcdMt63s0YtCZ+NLMM17LXUDT+kC49moDiT8UiQO+YRLSfkHGx+SnCHsCVPHoQs6HGyeTNgweGbfUFFcUZitr3mR4f8eHyn7u1wBVQdAV+R+5U0sQqmgdCk6FzDNrI2hTzRAgMBAAECggEBAMaU4K//tpKkaiPPUWy+EypSsjtn0ppWwX8RNZJ4s/rnMRhU3IzLD56Hu7FNCOk6d5/QgfSZDnSOVTBWb8Avxgv6jyIAd9zsJYHuhQ7ZEJmyx2XCNiNYQdMpcEerWCEstJFf9tt41YLbukA1bzUFIQ5DG5nNHPNZLcq9tetrRLv01BPdKgqoowS+xGTfCUbTfsGkJN7/naVfzcxrMYcqd1jqv088buwgY0sH2XjzGz6CzlZp+8SiQF6WD0uBjSEbAPNQgmfuxov0SERHBQxhNkgZav48YTriBwQRL+/FsgH1bAjagirFExgzDhx7iBqb4k67wYTHIHnU5o0sPEwi2AECgYEA6YXrPQSIvtCdI1daRxFvYnu1ikryB0Mch8Sxaqsx7fdJ4ZtAzWrknAt21XCjirrVr9IlZ4t29cURvYUWfmtgiolOgCWuiLXC33KapLgfRkkPzmYuEea098c0qWijcl0SlBB8HWR9RChl20ewCbLpVzn9UG+JtVfqZtwgpAHvzVECgYEA3evWYUBm7FbIpkVOPvowEi1XZEV+GuQCxqMj0HUc+eHKEkiYyTuVPcIKI3YEdz+IJYHRwlHz4s9ryEffXNRytmBekjgmngSzxpDjMna5WbGLDdh9ZQv4vJjS6x/HUatuOu6bmdyaeTc5cYg3HpWfewyPqEL7/PQ2IBqUF6xUl4ECgYARhTeqA04TKumvPh2K2XcG54suTgMsok9grFQ3UZLUbMpBP/mzr8JpJr8KsoHCpdPkdhrSUvdg5yE2m+adI4dBvZ2DJdCbdy+gviN2Gk5WYqLp9GaedzW6pVqBH1Wr/emn7Dizp9dyJqnFsvI1OBQjtDkaMNQfI/J1NyzHwVFxkQKBgQCTLluDKlxYeIIgzCxF1lZVZ97i8LffC8PPi9kv4swx6g7Dq4QxSiQDzpI8zIPPtsIL5hqA3yt6DIj2TryT646c6DMwlK7/9CxrECKukFEDbJ3FtAQOJS91nYGdUPk3cBPuX9uw4r9Mj1S4uFeeICuiR0VrmelX7XuMNTRssu1zgQKBgEhHXa3vwwm5ReupBYXQTOgfHzmz8hjU1arcjy2Q6q4iq7u2iAwwkl/LHYqxrf4kjPn+5O/FS441C4rp8z0qSZDd9hXXjUH1Jkd6+pQy1KXsexKIDyhskNWDOrsXWcpphIIz3ZDecVH12OEbFnFGkitmuNE/ba5EWe3MLfCg5pXG";

        String certPath = "src/test/resources/fixture/dev-appCertPublicKey_2021000149644027.crt";
        String alipayPublicCertPath = "src/test/resources/fixture/dev-alipayCertPublicKey_RSA2-4.crt";
        String rootCertPath = "src/test/resources/fixture/dev-alipayRootCert.crt";

        alipayMsgClient = AlipayMsgClient.getInstance(appId);

        try {
            alipayMsgClient.setConnector(serverHost, isSSL);
            alipayMsgClient.setSecurityCertConfig(signType, appPrivateKey, certPath, alipayPublicCertPath, rootCertPath);
            alipayMsgClient.setCharset(charset);
            alipayMsgClient.setLoadTest(false);

            // 消息接收
            alipayMsgClient.setMessageHandler(new MsgHandler() {
                public void onMessage(String msgApi, String msgId, String bizContent) {
                    System.out.println("receive message. msgApi:" + msgApi + " msgId:" + msgId + " bizContent:" + bizContent);
                }
            });

            alipayMsgClient.connect();

        } catch (Exception e) {
            System.out.println("上行消息建立链接异常：");
            e.printStackTrace();
        }

        AlipayOpenAppOpenbizmockMessageSendRequest request = new AlipayOpenAppOpenbizmockMessageSendRequest();
        AlipayOpenAppOpenbizmockMessageSendModel model = new AlipayOpenAppOpenbizmockMessageSendModel();
        model.setShopId("1001");
        model.setStatus("1002");
        request.setBizModel(model);

        try {
            for (int i = 0; i < 10; i++) {
                ProduceMsgAck produceMsgAck = alipayMsgClient.sendMessage(request);
                System.out.println(produceMsgAck);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Ignore
    public void websocketSM2CertTest() {
        AlipayMsgClient alipayMsgClient;
        String appId = "2021000146613340";
        String serverHost = "openchannel-0.rz00b.dev.alipay.net";
        boolean isSSL = false;
        String signType = "SM2";
        String charset = "UTF-8";
        String appPrivateKey
                = "MIGHAgEAMBMGByqGSM49AgEGCCqBHM9VAYItBG0wawIBAQQgTHx9+TBhG9rmgejfbyovrVjQtb12qY564XU/Km6oqnyhRANCAAQxonuZuuPQZcvl3/fMjZEBxEcP14UGygfFASwSQnDqeY47wxCrIaCCwKSktobNoJAlA4Wc1V1Vbs98/B9SoGoR";

        String certPath = "src/test/resources/fixture/dev-appCertPublicKey_2021000146613340.crt";
        String alipayPublicCertPath = "src/test/resources/fixture/dev-alipayCertPublicKey_SM2.crt";
        String rootCertPath = "src/test/resources/fixture/dev-alipayRootCert.crt";

        alipayMsgClient = AlipayMsgClient.getInstance(appId);

        try {
            alipayMsgClient.setConnector(serverHost, isSSL);
            alipayMsgClient.setSecurityCertConfig(signType, appPrivateKey, certPath, alipayPublicCertPath, rootCertPath);
            alipayMsgClient.setCharset(charset);
            alipayMsgClient.setLoadTest(false);

            // 消息接收
            alipayMsgClient.setMessageHandler(new MsgHandler() {
                public void onMessage(String msgApi, String msgId, String bizContent) {
                    System.out.println("receive message. msgApi:" + msgApi + " msgId:" + msgId + " bizContent:" + bizContent);
                }
            });

            alipayMsgClient.connect();

        } catch (Exception e) {
            System.out.println("上行消息建立链接异常：");
            e.printStackTrace();
        }

        AlipayOpenAppOpenbizmockMessageSendRequest request = new AlipayOpenAppOpenbizmockMessageSendRequest();
        AlipayOpenAppOpenbizmockMessageSendModel model = new AlipayOpenAppOpenbizmockMessageSendModel();
        model.setShopId("1001");
        model.setStatus("1002");
        request.setBizModel(model);

        try {
            for (int i = 0; i < 10; i++) {
                ProduceMsgAck produceMsgAck = alipayMsgClient.sendMessage(request);
                System.out.println(produceMsgAck);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}