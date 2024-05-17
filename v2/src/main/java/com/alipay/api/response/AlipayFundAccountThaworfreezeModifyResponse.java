package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.thaworfreeze.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:15
 */
public class AlipayFundAccountThaworfreezeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5424251616788377814L;

	/** 
	 * 淘宝uid
	 */
	@ApiField("taobao_user_id")
	private String taobaoUserId;

	public void setTaobaoUserId(String taobaoUserId) {
		this.taobaoUserId = taobaoUserId;
	}
	public String getTaobaoUserId( ) {
		return this.taobaoUserId;
	}

}
