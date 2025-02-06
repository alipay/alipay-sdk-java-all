package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.zhima.submerchant.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-03 23:04:29
 */
public class AlipayCommerceZhimaSubmerchantQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6291235397468165426L;

	/** 
	 * 本次进件工单失败的原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 商户进件状态
	 */
	@ApiField("status")
	private String status;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
