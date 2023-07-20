package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.thaworfreeze.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:56:55
 */
public class AlipayFundAccountThaworfreezeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1297788168452241829L;

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
