package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solution.batch.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-30 17:26:17
 */
public class AlipayMerchantSolutionBatchSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 1344678125846123742L;

	/** 
	 * 提交成功后，在支付宝侧生成的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

}
