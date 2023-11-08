package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.paymode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:40:10
 */
public class KoubeiCateringPosPaymodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2492532727714476219L;

	/** 
	 * 流水id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
