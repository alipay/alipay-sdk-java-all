package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-02 14:11:48
 */
public class AlipayBusinessRelationShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4314181213256846239L;

	/** 
	 * 基于商业关系的代运营门店id
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}
	public String getRealShopId( ) {
		return this.realShopId;
	}

}
