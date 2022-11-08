package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.data.hotel.verify.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-27 11:26:51
 */
public class AlipayCommerceDataHotelVerifySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4161983619195569485L;

	/** 
	 * 错误信息具体描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 对应入参中的shop_id
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
