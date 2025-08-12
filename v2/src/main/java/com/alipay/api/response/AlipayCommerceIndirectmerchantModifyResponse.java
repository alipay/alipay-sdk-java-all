package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.indirectmerchant.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-13 11:11:50
 */
public class AlipayCommerceIndirectmerchantModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5676398378473859723L;

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
