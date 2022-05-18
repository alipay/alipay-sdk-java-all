package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.bill.batch.upload response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-09 14:34:58
 */
public class AlipayEcoCplifeBillBatchUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2443732946425574649L;

	/** 
	 * 成功导入所有条目集合中的条目，则回传请求中的批次号
	 */
	@ApiField("batch_id")
	private String batchId;

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchId( ) {
		return this.batchId;
	}

}
