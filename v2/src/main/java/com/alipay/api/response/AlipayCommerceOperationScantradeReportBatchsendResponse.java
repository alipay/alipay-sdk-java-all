package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.scantrade.report.batchsend response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-12 11:27:59
 */
public class AlipayCommerceOperationScantradeReportBatchsendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6279827384565682196L;

	/** 
	 * 成功接收条数
	 */
	@ApiField("success_count")
	private String successCount;

	public void setSuccessCount(String successCount) {
		this.successCount = successCount;
	}
	public String getSuccessCount( ) {
		return this.successCount;
	}

}
