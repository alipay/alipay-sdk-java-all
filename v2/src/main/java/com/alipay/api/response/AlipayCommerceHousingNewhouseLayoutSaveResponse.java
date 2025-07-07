package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.newhouse.layout.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-19 10:47:29
 */
public class AlipayCommerceHousingNewhouseLayoutSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3884837731389459722L;

	/** 
	 * 内部户型id
	 */
	@ApiField("layout_id")
	private String layoutId;

	public void setLayoutId(String layoutId) {
		this.layoutId = layoutId;
	}
	public String getLayoutId( ) {
		return this.layoutId;
	}

}
