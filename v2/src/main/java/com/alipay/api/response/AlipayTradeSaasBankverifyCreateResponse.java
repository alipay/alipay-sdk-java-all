package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.bankverify.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-16 21:02:56
 */
public class AlipayTradeSaasBankverifyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7473292497966496517L;

	/** 
	 * 平台认证单号
	 */
	@ApiField("bank_verify_order_no")
	private String bankVerifyOrderNo;

	/** 
	 * 平台认证表单链接失效时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * 平台认证表单链接
	 */
	@ApiField("page_url")
	private String pageUrl;

	public void setBankVerifyOrderNo(String bankVerifyOrderNo) {
		this.bankVerifyOrderNo = bankVerifyOrderNo;
	}
	public String getBankVerifyOrderNo( ) {
		return this.bankVerifyOrderNo;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}
	public String getExpireTime( ) {
		return this.expireTime;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public String getPageUrl( ) {
		return this.pageUrl;
	}

}
