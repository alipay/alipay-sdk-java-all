package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.batch.close response.
 * 
 * @author auto create
 * @since 1.0, 2022-02-08 11:06:45
 */
public class AlipayFundBatchCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8843691112559529793L;

	/** 
	 * 支付宝内部的批次ID
	 */
	@ApiField("batch_trans_id")
	private String batchTransId;

	/** 
	 * DISUSE：批次废弃
	 */
	@ApiField("status")
	private String status;

	public void setBatchTransId(String batchTransId) {
		this.batchTransId = batchTransId;
	}
	public String getBatchTransId( ) {
		return this.batchTransId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
