package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.saas.enterprisecertify.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-16 21:02:56
 */
public class AlipayTradeSaasEnterprisecertifyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8216431142585413898L;

	/** 
	 * 平台认证单号
	 */
	@ApiField("certify_order_no")
	private String certifyOrderNo;

	/** 
	 * 企业认证页面失效时间
	 */
	@ApiField("expire_time")
	private String expireTime;

	/** 
	 * 企业认证页面链接
	 */
	@ApiField("page_url")
	private String pageUrl;

	public void setCertifyOrderNo(String certifyOrderNo) {
		this.certifyOrderNo = certifyOrderNo;
	}
	public String getCertifyOrderNo( ) {
		return this.certifyOrderNo;
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
