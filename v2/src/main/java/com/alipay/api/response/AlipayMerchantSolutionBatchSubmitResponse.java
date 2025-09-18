package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.solution.batch.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-14 11:02:05
 */
public class AlipayMerchantSolutionBatchSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 4457123271341712265L;

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
