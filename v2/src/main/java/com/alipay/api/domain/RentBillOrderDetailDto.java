package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资商通对账场景订单支付明细
 *
 * @author auto create
 * @since 1.0, 2025-08-26 12:27:45
 */
public class RentBillOrderDetailDto extends AlipayObject {

	private static final long serialVersionUID = 6432915717345657722L;

	/**
	 * 租赁商实收金额，单位元
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 实际扣款时间
	 */
	@ApiField("actual_pay_time")
	private Date actualPayTime;

	/**
	 * 交易组件订单id
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 关联履约单号
	 */
	@ApiField("installment_no")
	private String installmentNo;

	/**
	 * 支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 还款期数
	 */
	@ApiField("period")
	private String period;

	/**
	 * 还款阶段
	 */
	@ApiField("stage")
	private String stage;

	/**
	 * 支付明细单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 还款资金类型
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

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(String installmentNo) {
		this.installmentNo = installmentNo;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getStage() {
		return this.stage;
	}
	public void setStage(String stage) {
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
