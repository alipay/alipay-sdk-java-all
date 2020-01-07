/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api.internal.util.fixture;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.*;

/**
 * @author zhongyu
 * @version $Id: Response.java, v 0.1 2019年07月31日 上午11:51 zhongyu Exp $
 */
public class RandomInnerResponse {
    @JSONField(serialize = false)
    private final Random random = new Random();

    private String code = "10000";

    private String msg = "Success";

    private String randomString;

    private long randomLong;

    private Boolean randomBoolean;

    private List<String> randomArray;

    private Map<String, String> randomMap;

    public RandomInnerResponse() {
        this.randomString = generateRandomString();
        this.randomLong = random.nextLong();
        this.randomBoolean = random.nextBoolean();

        int maxIndex = random.nextInt(128);
        this.randomArray = new ArrayList<String>();
        for (int index = 0; index != maxIndex; ++index) {
            this.randomArray.add(generateRandomString());
        }
        this.randomMap = new HashMap<String, String>();
        for (int index = 0; index != maxIndex; ++index) {
            this.randomMap.put(generateRandomString(), generateRandomString());
        }
    }

    private String generateRandomString() {
        byte[] bytes = new byte[random.nextInt(1024)];
        random.nextBytes(bytes);
        return new String(bytes);
    }

    public Random getRandom() {
        return random;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRandomString() {
        return randomString;
    }

    public void setRandomString(String randomString) {
        this.randomString = randomString;
    }

    public long getRandomLong() {
        return randomLong;
    }

    public void setRandomLong(long randomLong) {
        this.randomLong = randomLong;
    }

    public Boolean getRandomBoolean() {
        return randomBoolean;
    }

    public void setRandomBoolean(Boolean randomBoolean) {
        this.randomBoolean = randomBoolean;
    }

    public List<String> getRandomArray() {
        return randomArray;
    }

    public void setRandomArray(List<String> randomArray) {
        this.randomArray = randomArray;
    }

    public Map<String, String> getRandomMap() {
        return randomMap;
    }

    public void setRandomMap(Map<String, String> randomMap) {
        this.randomMap = randomMap;
    }
}