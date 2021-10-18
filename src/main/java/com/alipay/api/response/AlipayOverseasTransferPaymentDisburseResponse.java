package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.payment.disburse response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-09 15:05:44
 */
public class AlipayOverseasTransferPaymentDisburseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2342529515646829117L;

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
