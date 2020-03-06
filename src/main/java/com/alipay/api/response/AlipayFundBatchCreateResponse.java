package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.batch.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-31 16:27:12
 */
public class AlipayFundBatchCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2866338245784956818L;

	/** 
	 * 支付宝内部的批次ID
	 */
	@ApiField("batch_trans_id")
	private String batchTransId;

	/** 
	 * 商户的批次号
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	/** 
	 * INIT：批次落单成功
	 */
	@ApiField("status")
	private String status;

	public void setBatchTransId(String batchTransId) {
		this.batchTransId = batchTransId;
	}
	public String getBatchTransId( ) {
		return this.batchTransId;
	}

	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}
	public String getOutBatchNo( ) {
		return this.outBatchNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
