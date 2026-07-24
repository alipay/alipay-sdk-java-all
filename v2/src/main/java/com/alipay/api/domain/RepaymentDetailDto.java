package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单还款明细列表
 *
 * @author auto create
 * @since 1.0, 2026-05-25 16:07:49
 */
public class RepaymentDetailDto extends AlipayObject {

	private static final long serialVersionUID = 6727368739399383735L;

	/**
	 * 交易订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 商家订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 还款期数
	 */
	@ApiField("period")
	private String period;

	/**
	 * 还款利息,单位:元
	 */
	@ApiField("repayment_interest_price")
	private String repaymentInterestPrice;

	/**
	 * 还款本金,单位:元
	 */
	@ApiField("repayment_principal_price")
	private String repaymentPrincipalPrice;

	/**
	 * 实际还款日
	 */
	@ApiField("repayment_time")
	private Date repaymentTime;

	/**
	 * 还款总金额，单位：元
	 */
	@ApiField("repayment_total_price")
	private String repaymentTotalPrice;

	/**
	 * 还款阶段
	 */
	@ApiField("stage")
	private String stage;

	/**
	 * 租赁类型
	 */
	@ApiField("type")
	private String type;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getRepaymentInterestPrice() {
		return this.repaymentInterestPrice;
	}
	public void setRepaymentInterestPrice(String repaymentInterestPrice) {
		this.repaymentInterestPrice = repaymentInterestPrice;
	}

	public String getRepaymentPrincipalPrice() {
		return this.repaymentPrincipalPrice;
	}
	public void setRepaymentPrincipalPrice(String repaymentPrincipalPrice) {
		this.repaymentPrincipalPrice = repaymentPrincipalPrice;
	}

	public Date getRepaymentTime() {
		return this.repaymentTime;
	}
	public void setRepaymentTime(Date repaymentTime) {
		this.repaymentTime = repaymentTime;
	}

	public String getRepaymentTotalPrice() {
		return this.repaymentTotalPrice;
	}
	public void setRepaymentTotalPrice(String repaymentTotalPrice) {
		this.repaymentTotalPrice = repaymentTotalPrice;
	}

	public String getStage() {
		return this.stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
