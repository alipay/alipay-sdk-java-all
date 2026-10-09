package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.career.openbase.invitation.batchsend response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-08 09:47:54
 */
public class AlipayCommerceCareerOpenbaseInvitationBatchsendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6559887881799794282L;

	/** 
	 * 平台批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 当前批次执行状态
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 外部批次号
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
