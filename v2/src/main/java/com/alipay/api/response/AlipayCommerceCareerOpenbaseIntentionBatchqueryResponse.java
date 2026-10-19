package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CareerOpenBaseIntentionLadarDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.career.openbase.intention.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-08 17:17:54
 */
public class AlipayCommerceCareerOpenbaseIntentionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8264871183738358724L;

	/** 
	 * null
	 */
	@ApiListField("batch_details")
	@ApiField("career_open_base_intention_ladar_detail_result")
	private List<CareerOpenBaseIntentionLadarDetailResult> batchDetails;

	/** 
	 * 平台生成的批次号。
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 批次处理状态。
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 外部批次号
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	public void setBatchDetails(List<CareerOpenBaseIntentionLadarDetailResult> batchDetails) {
		this.batchDetails = batchDetails;
	}
	public List<CareerOpenBaseIntentionLadarDetailResult> getBatchDetails( ) {
		return this.batchDetails;
	}

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
