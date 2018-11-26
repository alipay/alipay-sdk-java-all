package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.apply.result.sync response.
 * 
 * @author auto create
 * @since 1.0, 2018-06-21 14:45:00
 */
public class AlipayEbppInvoiceApplyResultSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1613923147722297278L;

	/** 
	 * 标注是否需要调用方重试，在请求失败的情况下返回，如果该字段返回true表明该失败的情况通过重试补偿可解决，为false表明失败情况通过重试无法解决
	 */
	@ApiField("retry_flag")
	private Boolean retryFlag;

	public void setRetryFlag(Boolean retryFlag) {
		this.retryFlag = retryFlag;
	}
	public Boolean getRetryFlag( ) {
		return this.retryFlag;
	}

}
