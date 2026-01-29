package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.automat.apply.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-18 15:12:41
 */
public class AntMerchantExpandAutomatApplyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8345584425729454231L;

	/** 
	 * 支付宝设备ID
	 */
	@ApiField("alipay_terminal_id")
	private String alipayTerminalId;

	public void setAlipayTerminalId(String alipayTerminalId) {
		this.alipayTerminalId = alipayTerminalId;
	}
	public String getAlipayTerminalId( ) {
		return this.alipayTerminalId;
	}

}
