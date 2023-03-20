package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.fuelling.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 02:52:21
 */
public class AlipayEcoMycarFuellingShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5418821274426667373L;

	/** 
	 * 车主平台内部门店编号,系统唯一，ISV应保存好该标识
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
