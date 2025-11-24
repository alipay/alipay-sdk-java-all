package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.modify.deduct.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-14 14:07:40
 */
public class AlipayCommerceEducateModifyDeductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1115911253554386219L;

	/** 
	 * 是否允许修改
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
