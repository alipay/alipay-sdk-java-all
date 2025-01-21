package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.thaworfreeze.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-05 11:56:03
 */
public class AlipayFundAccountThaworfreezeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7885394332239297885L;

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
