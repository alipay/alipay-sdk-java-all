/**
 * Alipay.com Inc. Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.alipay.api.internal.util;

/**
 * 从响应字符串中提取到的待验签原始内容
 *
 * @author zhongyu
 * @version $Id: SignContent.java, v 0.1 2019年09月04日 下午7:19 zhongyu Exp $
 */
public class SignSourceData {
    /**
     * 待验签原始内容
     */
    private final String sourceData;
    /**
     * 待验签原始内容在响应字符串中的起始位置
     */
    private final int    beginIndex;
    /**
     * 待验签原始内容在响应字符串中的结束位置
     */
    private final int    endIndex;

    public SignSourceData(String sourceData, int beginIndex, int endIndex) {
        this.sourceData = sourceData;
        this.beginIndex = beginIndex;
        this.endIndex = endIndex;
    }

    public String getSourceData() {
        return sourceData;
    }

    public int getBeginIndex() {
        return beginIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }
}