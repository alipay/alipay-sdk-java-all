package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询原始订单关联的尾款单列表
 *
 * @author auto create
 * @since 1.0, 2026-05-26 14:07:45
 */
public class AlipayCommerceMerchantcardTailpaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5474216438383616745L;

	/**
	 * 预约品必填； 非预约品，不用填
	 */
	@ApiField("main_booking_order_id")
	private String mainBookingOrderId;

	/**
	 * 原始订单id
	 */
	@ApiField("main_order_id")
	private String mainOrderId;

	public String getMainBookingOrderId() {
		return this.mainBookingOrderId;
	}
	public void setMainBookingOrderId(String mainBookingOrderId) {
		this.mainBookingOrderId = mainBookingOrderId;
	}

	public String getMainOrderId() {
		return this.mainOrderId;
	}
	public void setMainOrderId(String mainOrderId) {
		this.mainOrderId = mainOrderId;
	}

}
