package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.terminal.powerbank.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:56:00
 */
public class AlipayCommerceTerminalPowerbankCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4318255912183261272L;

	/** 
	 * 同步订单记录初始化后返回的唯一Id,后续用于订单状态更新
	 */
	@ApiField("terminal_id")
	private String terminalId;

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getTerminalId( ) {
		return this.terminalId;
	}

}
