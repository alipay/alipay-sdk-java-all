package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.kbcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:20:50
 */
public class KoubeiRetailKbcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3432136861793427257L;

	/** 
	 * 口碑码生成批次id，可用于查询接口
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
