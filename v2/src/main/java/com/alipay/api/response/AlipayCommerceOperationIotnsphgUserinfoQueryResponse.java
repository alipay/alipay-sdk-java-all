package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.iotnsphg.userinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-26 11:37:24
 */
public class AlipayCommerceOperationIotnsphgUserinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3273364567289924188L;

	/** 
	 * 支付宝用户绑定的手机号 。
	 */
	@ApiField("binded_mobile")
	private String bindedMobile;

	public void setBindedMobile(String bindedMobile) {
		this.bindedMobile = bindedMobile;
	}
	public String getBindedMobile( ) {
		return this.bindedMobile;
	}

}
