package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.shopgroup.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-16 16:27:01
 */
public class AlipayCommerceEcShopgroupCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5756719546442588986L;

	/** 
	 * 门店组包含的门店数量
	 */
	@ApiField("shop_cnt")
	private String shopCnt;

	/** 
	 * 门店组ID
	 */
	@ApiField("shop_group_id")
	private String shopGroupId;

	public void setShopCnt(String shopCnt) {
		this.shopCnt = shopCnt;
	}
	public String getShopCnt( ) {
		return this.shopCnt;
	}

	public void setShopGroupId(String shopGroupId) {
		this.shopGroupId = shopGroupId;
	}
	public String getShopGroupId( ) {
		return this.shopGroupId;
	}

}
