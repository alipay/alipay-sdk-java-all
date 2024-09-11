package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.apply.result.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-26 19:01:59
 */
public class AlipayEbppInvoiceApplyResultSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3388592217658197986L;

	/** 
	 * 标注是否需要调用方重试。
当结果返回失败时（code 不等于 10000 且 msg 不等于 SUCCESS
），如果该字段返回true表明该失败的情况通过重试补偿可解决，为false表明失败情况通过重试无法解决，可以停止重试，根据返回的错误码尝试解决。
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
