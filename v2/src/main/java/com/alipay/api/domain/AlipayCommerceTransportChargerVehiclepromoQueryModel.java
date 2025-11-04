package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车企营销优惠核销结果查询
 *
 * @author auto create
 * @since 1.0, 2025-07-24 12:57:34
 */
public class AlipayCommerceTransportChargerVehiclepromoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8471112451563782494L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单唯一编码
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
