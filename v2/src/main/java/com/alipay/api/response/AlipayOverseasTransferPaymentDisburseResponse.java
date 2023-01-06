package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.payment.disburse response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 06:14:33
 */
public class AlipayOverseasTransferPaymentDisburseResponse extends AlipayResponse {

	private static final long serialVersionUID = 1851235834154877453L;

	/** 
	 * 透传信息
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	/** 
	 * 批量结果返回
	 */
	@ApiField("transaction_results")
	private String transactionResults;

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

	public void setTransactionResults(String transactionResults) {
		this.transactionResults = transactionResults;
	}
	public String getTransactionResults( ) {
		return this.transactionResults;
	}

}
