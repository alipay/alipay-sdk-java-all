package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.credit.bankcard.bind response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-26 16:12:55
 */
public class AlipayTradeCreditBankcardBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2666172412298451917L;

	/** 
	 * 商户可根据该回跳地址进行拉端唤起支付宝并跳转到选卡页面
	 */
	@ApiField("schema")
	private String schema;

	public void setSchema(String schema) {
		this.schema = schema;
	}
	public String getSchema( ) {
		return this.schema;
	}

}
