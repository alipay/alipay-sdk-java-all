package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.career.openbase.intention.batchconsult response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-08 19:12:57
 */
public class AlipayCommerceCareerOpenbaseIntentionBatchconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2348262991666878258L;

	/** 
	 * 意向雷达平台生成的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 意向雷达批次处理状态。
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 调用方传入的外部批次号
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}
	public String getBatchStatus( ) {
		return this.batchStatus;
	}

	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}
	public String getOutBatchNo( ) {
		return this.outBatchNo;
	}

}
