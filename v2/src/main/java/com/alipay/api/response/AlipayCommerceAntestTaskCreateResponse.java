package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.task.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 05:21:09
 */
public class AlipayCommerceAntestTaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3564355356696823318L;

	/** 
	 * 任务id
	 */
	@ApiField("batch_id")
	private Long batchId;

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	public Long getBatchId( ) {
		return this.batchId;
	}

}
