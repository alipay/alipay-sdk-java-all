package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.kbcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:27
 */
public class KoubeiCateringKbcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5554763627893863937L;

	/** 
	 * 口碑码创建的批次号，可以根据该批次号查询创建的具体码信息
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
