package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新能源充电公共充电支付结果通知
 *
 * @author auto create
 * @since 1.0, 2026-05-06 14:32:45
 */
public class AlipayCommerceTransportChargerPubapipayNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3735224328719744618L;

	/**
	 * 用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单支付金额，单位：元，两位小数
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 订单支付结果。success-支付成功；failed-支付失败；timeout-支付超时
	 */
	@ApiField("pay_status")
	private String payStatus;

	/**
	 * 商户侧订单id，全局唯一；与互联互通的订单号保持一致
	 */
	@ApiField("start_charge_seq")
	private String startChargeSeq;

	/**
	 * 支付宝交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

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

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayStatus() {
		return this.payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getStartChargeSeq() {
		return this.startChargeSeq;
	}
	public void setStartChargeSeq(String startChargeSeq) {
		this.startChargeSeq = startChargeSeq;
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
