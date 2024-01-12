package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.findata.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:59:50
 */
public class AlipayFinanceQuotationFindataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2126114172183742927L;

	/** 
	 * 是否投递成功
	 */
	@ApiField("send_result")
	private Boolean sendResult;

	public void setSendResult(Boolean sendResult) {
		this.sendResult = sendResult;
	}
	public Boolean getSendResult( ) {
		return this.sendResult;
	}

}
