package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.automat.apply.upload response.
 * 
 * @author auto create
 * @since 1.0, 2020-10-30 11:42:24
 */
public class AntMerchantExpandAutomatApplyUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5374536823876644172L;

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
