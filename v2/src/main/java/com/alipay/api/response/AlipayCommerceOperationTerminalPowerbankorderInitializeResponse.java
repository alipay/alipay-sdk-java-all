package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.terminal.powerbankorder.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 17:16:57
 */
public class AlipayCommerceOperationTerminalPowerbankorderInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6268636459366173677L;

	/** 
	 * 同步订单记录初始化后返回的唯一Id。
	 */
	@ApiField("record_id")
	private String recordId;

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
