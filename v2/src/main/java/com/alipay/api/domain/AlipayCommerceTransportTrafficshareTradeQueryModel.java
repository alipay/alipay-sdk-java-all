package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共享出行交易查询
 *
 * @author auto create
 * @since 1.0, 2026-01-28 21:22:42
 */
public class AlipayCommerceTransportTrafficshareTradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8832346537526373845L;

	/**
	 * 金额单位
	 */
	@ApiField("amount_unit")
	private String amountUnit;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单支付时传入的商户订单号,和支付宝交易号不能同时为空。 trade_no,out_biz_no如果同时存在优先取trade_no
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付宝交易号，和商户业务号不能同时为空
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmountUnit() {
		return this.amountUnit;
	}
	public void setAmountUnit(String amountUnit) {
		this.amountUnit = amountUnit;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

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

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
