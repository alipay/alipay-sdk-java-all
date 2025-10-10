package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.kbcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 10:12:23
 */
public class KoubeiRetailKbcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8628873255587921576L;

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
