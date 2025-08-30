package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.vehichlepromo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-21 15:52:33
 */
public class AlipayCommerceTransportChargerVehichlepromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1142782878612874951L;

	/** 
	 * 订单核销车企优惠金额，精度两位小数，单位元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	/** 
	 * 车架号
	 */
	@ApiField("vin")
	private String vin;

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountAmount( ) {
		return this.discountAmount;
	}

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getVin( ) {
		return this.vin;
	}

}
