package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.indirectmerchant.businessstatus.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-10 10:35:55
 */
public class AlipayCommerceIndirectmerchantBusinessstatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1133575666563312727L;

	/** 
	 * 结果
	 */
	@ApiField("res")
	private Boolean res;

	public void setRes(Boolean res) {
		this.res = res;
	}
	public Boolean getRes( ) {
		return this.res;
	}

}
