package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-19 18:02:10
 */
public class AntMerchantExpandShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2567996316685815121L;

	/** 
	 * 触发幂等时返回已存在的门店shopId
	 */
	@ApiField("exist_shop_id")
	private String existShopId;

	/** 
	 * 申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	public void setExistShopId(String existShopId) {
		this.existShopId = existShopId;
	}
	public String getExistShopId( ) {
		return this.existShopId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
