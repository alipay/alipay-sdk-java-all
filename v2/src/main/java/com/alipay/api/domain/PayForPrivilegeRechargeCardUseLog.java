package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充享惠用户使用记录
 *
 * @author auto create
 * @since 1.0, 2022-10-31 21:54:03
 */
public class PayForPrivilegeRechargeCardUseLog extends AlipayObject {

	private static final long serialVersionUID = 4195445484985336758L;

	/**
	 * 交易总金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 交易中权益金部分（配置膨胀方案时使用）
	 */
	@ApiField("benefit")
	private String benefit;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 业务类型，PAY(支付), REFUND(退款)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 该字段已废弃，请勿使用
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 交易中本金部分
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝统一用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBenefit() {
		return this.benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
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
