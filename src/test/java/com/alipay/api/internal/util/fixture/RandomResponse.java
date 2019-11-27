/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api.internal.util.fixture;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author zhongyu
 * @version $Id: RandomResponse.java, v 0.1 2019年07月31日 上午11:49 zhongyu Exp $
 */
public class RandomResponse {

    @JSONField(name = "alipay_trade_create_response")
    private RandomInnerResponse response = new RandomInnerResponse();

    private String sign = "TS355N0QjK1r9GyD4YOsG5esszSUhESgwu1q5+e1sWwqtPYe30CQ3v0QTEDdxYN9vm2No8V1KzuTSadrA4SZSkEkRchrcdVHCU8rCXOHWzS5wof8jg5S75y481kj3HqlpTaz/EhvAXK8iC8Xz9CgPmvfLmAUNkxy0q05yV2wZAGNX0WElUOx1Lcd2FqeuRFMvBOq5TQ+SVqunfUMLic8rYsW+smDHzIgjRcde8pHOZBMvmqDDzmyBLEgSbBswgHifQPDrhnGPlpk2U/nb8Sx7G8mWHEibtb8ClENcxtJEwcI0NN+erWO4Le+jFVUOU0BqC4dxGBNX9AHCTZMEhfcZQ==";

    public RandomInnerResponse getResponse() {
        return response;
    }

    public void setResponse(RandomInnerResponse response) {
        this.response = response;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}