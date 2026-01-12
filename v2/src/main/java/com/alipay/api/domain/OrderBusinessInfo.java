package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单业务扩展信息
 *
 * @author auto create
 * @since 1.0, 2025-09-16 15:39:34
 */
public class OrderBusinessInfo extends AlipayObject {

	private static final long serialVersionUID = 6628241797762659785L;

	/**
	 * 本次从卡内消费的金额，阿拉伯数字，单位：元，小数点后两位。或者是其他剩余卡权益的相关
	 */
	@ApiField("card_balance")
	private String cardBalance;

	/**
	 * 绑定卡片名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 餐卡卡号
	 */
	@ApiField("cardid")
	private String cardid;

	/**
	 * 消费金额，单位：元
	 */
	@ApiField("consumption_amount")
	private String consumptionAmount;

	/**
	 * 餐卡消费的具体项目
	 */
	@ApiField("consumption_project")
	private String consumptionProject;

	/**
	 * 餐卡消费详情
	 */
	@ApiField("details")
	private String details;

	/**
	 * 充值金额，单位：元
	 */
	@ApiField("recharge_amount")
	private String rechargeAmount;

	/**
	 * 充值时间
	 */
	@ApiField("recharge_time")
	private String rechargeTime;

	/**
	 * 退款金额，单位：元
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 餐卡消费温馨提示
	 */
	@ApiField("reminder")
	private String reminder;

	public String getCardBalance() {
		return this.cardBalance;
	}
	public void setCardBalance(String cardBalance) {
		this.cardBalance = cardBalance;
	}

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardid() {
		return this.cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	public String getConsumptionAmount() {
		return this.consumptionAmount;
	}
	public void setConsumptionAmount(String consumptionAmount) {
		this.consumptionAmount = consumptionAmount;
	}

	public String getConsumptionProject() {
		return this.consumptionProject;
	}
	public void setConsumptionProject(String consumptionProject) {
		this.consumptionProject = consumptionProject;
	}

	public String getDetails() {
		return this.details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

	public String getRechargeAmount() {
		return this.rechargeAmount;
	}
	public void setRechargeAmount(String rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public String getRechargeTime() {
		return this.rechargeTime;
	}
	public void setRechargeTime(String rechargeTime) {
		this.rechargeTime = rechargeTime;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getReminder() {
		return this.reminder;
	}
	public void setReminder(String reminder) {
		this.reminder = reminder;
	}

}
