package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁履约明细信息，包含阶段、期数、资金类型、实收金额、分账金额等信息
 *
 * @author auto create
 * @since 1.0, 2025-03-04 18:19:41
 */
public class RentDetail extends AlipayObject {

	private static final long serialVersionUID = 2519118943426155373L;

	/**
	 * 租赁商实收金额，单位：元
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 实际扣款时间
	 */
	@ApiField("actual_pay_time")
	private Date actualPayTime;

	/**
	 * 实际分账金额，单位：元
	 */
	@ApiField("actual_royalty_price")
	private String actualRoyaltyPrice;

	/**
	 * 每一期的扣款分期单号
	 */
	@ApiField("installment_id")
	private String installmentId;

	/**
	 * 支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 代表某一个阶段的第几期的还款计划，要结合stage进行锁定某一期计划
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 分账履约方式
	 */
	@ApiField("royalty_deliver_type")
	private String royaltyDeliverType;

	/**
	 * 分账完成时间
	 */
	@ApiField("royalty_time")
	private Date royaltyTime;

	/**
	 * 分账交易号
	 */
	@ApiField("royalty_trade_no")
	private String royaltyTradeNo;

	/**
	 * 还款阶段
	 */
	@ApiField("stage")
	private Long stage;

	/**
	 * 明细单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 资金类型
	 */
	@ApiField("type")
	private String type;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public Date getActualPayTime() {
		return this.actualPayTime;
	}
	public void setActualPayTime(Date actualPayTime) {
		this.actualPayTime = actualPayTime;
	}

	public String getActualRoyaltyPrice() {
		return this.actualRoyaltyPrice;
	}
	public void setActualRoyaltyPrice(String actualRoyaltyPrice) {
		this.actualRoyaltyPrice = actualRoyaltyPrice;
	}

	public String getInstallmentId() {
		return this.installmentId;
	}
	public void setInstallmentId(String installmentId) {
		this.installmentId = installmentId;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public String getRoyaltyDeliverType() {
		return this.royaltyDeliverType;
	}
	public void setRoyaltyDeliverType(String royaltyDeliverType) {
		this.royaltyDeliverType = royaltyDeliverType;
	}

	public Date getRoyaltyTime() {
		return this.royaltyTime;
	}
	public void setRoyaltyTime(Date royaltyTime) {
		this.royaltyTime = royaltyTime;
	}

	public String getRoyaltyTradeNo() {
		return this.royaltyTradeNo;
	}
	public void setRoyaltyTradeNo(String royaltyTradeNo) {
		this.royaltyTradeNo = royaltyTradeNo;
	}

	public Long getStage() {
		return this.stage;
	}
	public void setStage(Long stage) {
		this.stage = stage;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
