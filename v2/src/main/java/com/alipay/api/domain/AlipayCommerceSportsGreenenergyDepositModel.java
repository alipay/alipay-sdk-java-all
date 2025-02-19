package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场馆订单发放绿色能量接口
 *
 * @author auto create
 * @since 1.0, 2023-03-13 19:53:44
 */
public class AlipayCommerceSportsGreenenergyDepositModel extends AlipayObject {

	private static final long serialVersionUID = 6723376982647163277L;

	/**
	 * 用户支付宝OPENID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单交易状态，verify_succ-已使用，目前仅支持对已使用的订单发放能量
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 外部系统中的订单ID，唯一键
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 订单金额(单位：元)，保留两位小数
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易所属pid，一般为发起交易的应用配置的pid
	 */
	@ApiField("trade_partner_id")
	private String tradePartnerId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradePartnerId() {
		return this.tradePartnerId;
	}
	public void setTradePartnerId(String tradePartnerId) {
		this.tradePartnerId = tradePartnerId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
