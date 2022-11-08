package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.srta.nanonymous.callback response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-02 20:31:42
 */
public class AnttechMorseMarketingSrtaNanonymousCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 4874278154774745455L;

	/** 
	 * 业务请求唯一标识，用于链路问题排查和对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 本次调用回调结果，标识是否回调成功，true：回调成功；false：回调失败
	 */
	@ApiField("callback_result")
	private Boolean callbackResult;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCallbackResult(Boolean callbackResult) {
		this.callbackResult = callbackResult;
	}
	public Boolean getCallbackResult( ) {
		return this.callbackResult;
	}

}
