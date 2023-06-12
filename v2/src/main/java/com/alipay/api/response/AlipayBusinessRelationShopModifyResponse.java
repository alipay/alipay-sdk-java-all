package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.shop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 09:03:53
 */
public class AlipayBusinessRelationShopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6877947243449297637L;

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
