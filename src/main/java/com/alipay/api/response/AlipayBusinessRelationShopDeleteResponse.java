package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.shop.delete response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 20:55:29
 */
public class AlipayBusinessRelationShopDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7216793515149372124L;

	/** 
	 * 删除的商业关系门店id
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
