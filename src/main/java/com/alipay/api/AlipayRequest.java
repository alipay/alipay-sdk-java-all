package com.alipay.api;

import java.util.Map;

/**
 * 请求接口。
 * 
 * @author carver.gu
 * @since 1.0, Sep 12, 2009
 */
public interface AlipayRequest<T extends AlipayResponse> {

    /**
     * 获取TOP的API名称。
     * 
     * @return API名称
     */
    public String getApiMethodName();

    /**
     * 获取所有的Key-Value形式的文本请求参数集合。其中：
     * <ul>
     * <li>Key: 请求参数名</li>
     * <li>Value: 请求参数值</li>
     * </ul>
     * 
     * @return 文本请求参数集合
     */
    public Map<String, String> getTextParams();

    /**
     * 得到当前接口的版本
     * 
     * @return API版本
     */
    public String getApiVersion();

    /**
     * 设置当前API的版本信息
     * 
     * @param apiVersion API版本
     */
    public void setApiVersion(String apiVersion);

    /**
     * 获取终端类型
     * 
     * @return 终端类型
     */
    public String getTerminalType();

    /**
     * 设置终端类型
     * 
     * @param terminalType 终端类型
     */
    public void setTerminalType(String terminalType);

    /**
     * 获取终端信息
     * 
     * @return 终端信息
     */
    public String getTerminalInfo();

    /**
     * 设置终端信息
     * 
     * @param terminalInfo 终端信息
     */
    public void setTerminalInfo(String terminalInfo);

    /**
    * 获取产品码
    * 
    * @return 产品码
    */
    public String getProdCode();

    /**
    * 设置产品码
    * 
    * @param prodCode 产品码
    */
    public void setProdCode(String prodCode);

    /**
     * 返回通知地址
     * 
     * @return
     */
    public String getNotifyUrl();

    /**
     *  设置通知地址
     * 
     * @param notifyUrl
     */
    public void setNotifyUrl(String notifyUrl);

    /**
     * 返回回跳地址
     * 
     * @return
     */
    public String getReturnUrl();

    /**
     *  设置回跳地址
     * 
     * @param notifyUrl
     */
    public void setReturnUrl(String returnUrl);

    /**
     * 得到当前API的响应结果类型
     * 
     * @return 响应类型
     */
    public Class<T> getResponseClass();

    /**
     * 判断是否需要加密
     * 
     * @return
     */
    public boolean isNeedEncrypt();

    /**
     * 设置请求是否需要加密
     * 
     * @param needEncrypt
     */
    public void setNeedEncrypt(boolean needEncrypt);

    public AlipayObject getBizModel();

    /**
     * 设置业务实体，如需使用此方法，请勿直接设置biz_content
     * 
     * @param bizModel
     */
    public void setBizModel(AlipayObject bizModel);

}
