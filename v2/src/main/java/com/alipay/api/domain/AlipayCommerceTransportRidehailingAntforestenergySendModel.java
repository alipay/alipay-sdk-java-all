package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网约车蚂蚁森林能量发放
 *
 * @author auto create
 * @since 1.0, 2024-11-12 16:34:28
 */
public class AlipayCommerceTransportRidehailingAntforestenergySendModel extends AlipayObject {

	private static final long serialVersionUID = 8894435927926859571L;

	/**
	 * 蚂蚁森林能量发放订单号
	 */
	@ApiField("ant_forest_order_id")
	private String antForestOrderId;

	/**
	 * 车牌号
	 */
	@ApiField("car_no")
	private String carNo;

	/**
	 * 发放蚂蚁森林能量的应用Id
	 */
	@ApiField("ride_hailing_app_id")
	private String rideHailingAppId;

	/**
	 * 网约车行程订单ID
	 */
	@ApiField("ride_hailing_order_id")
	private String rideHailingOrderId;

	/**
	 * 网约车发放蚂蚁森林能量的pid
	 */
	@ApiField("ride_hailing_partner_id")
	private String rideHailingPartnerId;

	/**
	 * 支付宝交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAntForestOrderId() {
		return this.antForestOrderId;
	}
	public void setAntForestOrderId(String antForestOrderId) {
		this.antForestOrderId = antForestOrderId;
	}

	public String getCarNo() {
		return this.carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getRideHailingAppId() {
		return this.rideHailingAppId;
	}
	public void setRideHailingAppId(String rideHailingAppId) {
		this.rideHailingAppId = rideHailingAppId;
	}

	public String getRideHailingOrderId() {
		return this.rideHailingOrderId;
	}
	public void setRideHailingOrderId(String rideHailingOrderId) {
		this.rideHailingOrderId = rideHailingOrderId;
	}

	public String getRideHailingPartnerId() {
		return this.rideHailingPartnerId;
	}
	public void setRideHailingPartnerId(String rideHailingPartnerId) {
		this.rideHailingPartnerId = rideHailingPartnerId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
