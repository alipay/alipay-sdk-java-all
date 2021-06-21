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
 * @version : MsgClientTest.java, v 0.1 2020年12月02日 9:54 上午 junying Exp $
 */
public class MsgClientTest {

    @Ignore
    public void websocketTest(){
        AlipayMsgClient alipayMsgClient;
        String appId = "2021001136668295";
        String serverHost = "openchannel-0.rz00b.dev.alipay.net";
        boolean isSSL = false;
        String signType = "RSA2";
        String charset = "UTF-8";
        String appPrivateKey
                = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDOB+7d4u08HvfvzynZGZ1FMfKi/4kravQbBd+6O38Yn/b8AfOy+vHHm6CRFOwpAGT503SliRJgSBs6vCwrdAXZctYRzKkU7l4gCFMG8rL0kX1KWzYi3sQlsBylPay7cXVcjZiBNrxI752753L1C+JFP6yfbOSV2xn3xB4KlMRtLDcDYWHa2ffpS9nuFzY9YF5zt+63yxUhhQxe9ISeS1K+1YGrQCemjZG8908e5kuq/ywcL/lhHB4BJ8xEp0u9OuyUTCnJy84Y/ifTsxog8BXuDRPyzEChplssNUjH1RgHjpeCOPImypGuvbXq47KhEEPUW2qho5zIX0+UcdsZJ0XRAgMBAAECggEAXZLCzSnUf1q9VsArDHwSrquZvKf8X6jKxz8qtoVxGvkEDr7ANQi+KN8o1NvAynpwYfrE3q3bl7kIDOwLz4x5X6JFUX43SNdeDoRZWS1/U46EbfHxK3MreMZ8rBvPyK4mFGwG2KDIcQPLCt16m4rTMIpT13B4fQsuxxXeYwXgFIiQpSbVdWadnoZvZRwDeJF3p2kMOx9THnaMNnVakBuSKgpRd18tq4MnVRLreNk5rdtEvUtRtdINUgIAjCkFISw3XgeodRYCYG04EJtO7CEQNAzirZTUXaRjfFa1WXu33xrYyYAJdtYP/Q0fxY60xL8hcAAc2Zhaee6IsJPnuYPcBQKBgQDq549qQ/DzZV7FoIv51VIhGoJOwAI1XJtTvKBtzfjX4oKDmmjOzU4tVgCryxxU53IPwd8oXmvNKJkXVH4q8h4ILwBLBiaSEPtuIjcVSbo7Z99xY2Vt2z/17h1pFLYdJSdP+yDs7iDQKZe7BmdduOys9bRr+OCrVwDerEP/oEziewKBgQDgiJJtsT60z7cM5Jyc7VvF6VnsRZuQQesicJ7AbJ8k7zCjCeCv4/LLr6VUsWs2yW0KzXG5A2nJ70uBNBe+W08vOD7jNFPvyEQEh4+39IfBWVDzq13lcW1X//OU3zUoftXiqgxxtABVB6Mly6skex4KUN1uDt4I5P8oNnvCiPc9IwKBgQDQAgaz8b++uAgI9lac/3H/kErNUydhe0SsDL7/HMH64T/zK1sdrR1J9fsYJP5MjLorC+EBDUNmY0nVJ+OlQcqoMn6O8L5c357VcoTWW/gGPL/W105szhZAPv9aGpX9DvZV06nfRCpYSkxqt4v2qRcjPVvrtHG2J4/EnkSEar1KWwKBgQCxeuKbuD3DuGiN1WsCFBC1uMUuoLrdZW2SVIj3uyR0kmjUhutGvRze6iD6eB8yODdsEYax4sPNLcx1/ZJDEnPd9EypVWR/pcI1/l2Y374rFAmMAkn/IhB3PcbxRxoCv3cbaqTZf5m/nIDWUE4gUP0m1FKjOzdAupoB1EcxNwiPFwKBgQCBYKck0H/Yl3Z7RHAjpxsoV5gZnljxU0WDa7/QW0xr/c2SBcFY1tr7sV3wiz3bEo35Zou7xd++PCetCmd+5TaQ0nNwye1L75q6x9spzb64WHMtuXfZdCB9nWcKtVx1iFNpaqY6EM8poJ2/5kPTyu+qGm7XTEJNg4gpXEtGjhLWOw==";
        String alipayPublicKey
                = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAl8vrEHQO5DL77Mc4pXriRTc1Z6QPV2Pvm4go7XM/SwVTOJIdoFnj2t9oTXAmQUXLY+8137UD3D7TS7uGPX9bzh+mb8Ssw4RN/4r+zPzVrxSLc8BDdFR4ao7Ff+6sDRumU0Co+DrzgfaQq56yYJSvK3r/U9uOyx1SYLpEnYs5urQiTtMBU8bdThrbypqao5rvGxaSXhPMQkc+6JVQ9ibDlRvmvLVwJm7u18SX4PMVEKADDpl1g6s9YiwHl+4JC9XfVXgM0vy6vYjf/1SolxheCt/5/x7w2ua6Bsu1B+TMrZ8IEnwZT+C9s3MMZKluOamxjAyUVnyB0GktcIrzOjDlaQIDAQAB";

        alipayMsgClient = AlipayMsgClient.getInstance(appId);

        try {
            alipayMsgClient.setConnector(serverHost, isSSL);
            alipayMsgClient.setSecurityConfig(signType, appPrivateKey, alipayPublicKey);
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
    public void httpTest(){
        String privateKey
                = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDOB+7d4u08HvfvzynZGZ1FMfKi/4kravQbBd+6O38Yn/b8AfOy+vHHm6CRFOwpAGT503SliRJgSBs6vCwrdAXZctYRzKkU7l4gCFMG8rL0kX1KWzYi3sQlsBylPay7cXVcjZiBNrxI752753L1C+JFP6yfbOSV2xn3xB4KlMRtLDcDYWHa2ffpS9nuFzY9YF5zt+63yxUhhQxe9ISeS1K+1YGrQCemjZG8908e5kuq/ywcL/lhHB4BJ8xEp0u9OuyUTCnJy84Y/ifTsxog8BXuDRPyzEChplssNUjH1RgHjpeCOPImypGuvbXq47KhEEPUW2qho5zIX0+UcdsZJ0XRAgMBAAECggEAXZLCzSnUf1q9VsArDHwSrquZvKf8X6jKxz8qtoVxGvkEDr7ANQi+KN8o1NvAynpwYfrE3q3bl7kIDOwLz4x5X6JFUX43SNdeDoRZWS1/U46EbfHxK3MreMZ8rBvPyK4mFGwG2KDIcQPLCt16m4rTMIpT13B4fQsuxxXeYwXgFIiQpSbVdWadnoZvZRwDeJF3p2kMOx9THnaMNnVakBuSKgpRd18tq4MnVRLreNk5rdtEvUtRtdINUgIAjCkFISw3XgeodRYCYG04EJtO7CEQNAzirZTUXaRjfFa1WXu33xrYyYAJdtYP/Q0fxY60xL8hcAAc2Zhaee6IsJPnuYPcBQKBgQDq549qQ/DzZV7FoIv51VIhGoJOwAI1XJtTvKBtzfjX4oKDmmjOzU4tVgCryxxU53IPwd8oXmvNKJkXVH4q8h4ILwBLBiaSEPtuIjcVSbo7Z99xY2Vt2z/17h1pFLYdJSdP+yDs7iDQKZe7BmdduOys9bRr+OCrVwDerEP/oEziewKBgQDgiJJtsT60z7cM5Jyc7VvF6VnsRZuQQesicJ7AbJ8k7zCjCeCv4/LLr6VUsWs2yW0KzXG5A2nJ70uBNBe+W08vOD7jNFPvyEQEh4+39IfBWVDzq13lcW1X//OU3zUoftXiqgxxtABVB6Mly6skex4KUN1uDt4I5P8oNnvCiPc9IwKBgQDQAgaz8b++uAgI9lac/3H/kErNUydhe0SsDL7/HMH64T/zK1sdrR1J9fsYJP5MjLorC+EBDUNmY0nVJ+OlQcqoMn6O8L5c357VcoTWW/gGPL/W105szhZAPv9aGpX9DvZV06nfRCpYSkxqt4v2qRcjPVvrtHG2J4/EnkSEar1KWwKBgQCxeuKbuD3DuGiN1WsCFBC1uMUuoLrdZW2SVIj3uyR0kmjUhutGvRze6iD6eB8yODdsEYax4sPNLcx1/ZJDEnPd9EypVWR/pcI1/l2Y374rFAmMAkn/IhB3PcbxRxoCv3cbaqTZf5m/nIDWUE4gUP0m1FKjOzdAupoB1EcxNwiPFwKBgQCBYKck0H/Yl3Z7RHAjpxsoV5gZnljxU0WDa7/QW0xr/c2SBcFY1tr7sV3wiz3bEo35Zou7xd++PCetCmd+5TaQ0nNwye1L75q6x9spzb64WHMtuXfZdCB9nWcKtVx1iFNpaqY6EM8poJ2/5kPTyu+qGm7XTEJNg4gpXEtGjhLWOw==";
        String alipayPublicKey
                = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnaESDeU3bC5Vz03iwa8SlSVFoXkzf5ilLvTvS4j/GlcZwI/p/J7D32i6/1d/8ZZSxbb2fmVbScVP8CSZKRV7s+acumKlJHf5WV0nYgRJqjImI58AwsE37jYBjgKjVGyV9XOCMkS5vlKv4GSqITmHkIxT1fFhNvwrB1LUyaZfqOcE5ZiP/VOwAZFJsxh7+CGL+eNw6iSRH4OSSQq5M97uJPfzHrIMn7pG6J6Icsoi3aRX1HqxA9X+01D4OeDJhcTXTwVJxzGHunjKuU5+BKYNNGuY/WBr1BWF4gfvsIDJoGP1uhwHh5mKYM9t9CCh+9wRbERGRhvBGsg/gdVsdJlfFQIDAQAB";
        String appId = "2014060600164699";
        try {
            AlipayClient alipayClient = new DefaultAlipayClient(
                    "http://openmq-0.rz00b.dev.alipay.net/message.do",
                    appId,
                    privateKey,
                    "json",
                    "UTF-8",
                    alipayPublicKey,
                    "RSA2"
            );

            AlipayOpenAppOpenbizmockMessageSendRequest request = new AlipayOpenAppOpenbizmockMessageSendRequest();
            request.setBizContent("{" +
                    "\"user_id\":\"2088102122458832\"," +
                    "\"shop_id\":\"20001\"," +
                    "\"status\":\"0\"" +
                    "  }");
            AlipayOpenAppOpenbizmockMessageSendResponse response = alipayClient.execute(request);
            if(response.isSuccess()){
                System.out.println("调用成功");
            } else {
                System.out.println("调用失败");
            }

            System.out.println(response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}