package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转支付申请明细
 *
 * @author auto create
 * @since 1.0, 2026-07-20 16:32:51
 */
public class TransferApplyBizDetail extends AlipayObject {

	private static final long serialVersionUID = 3491235434748793438L;

	/**
	 * 还款总金额，单位：CNY
	 */
	@ApiField("amt")
	private String amt;

	/**
	 * 罚金，单位：CNY
	 */
	@ApiField("penalty")
	private String penalty;

	/**
	 * 还款本金，单位：CNY
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 还款类型
	 */
	@ApiField("repay_type")
	private String repayType;

	/**
	 * 服务费，单位：CNY
	 */
	@ApiField("service_fee")
	private String serviceFee;

	/**
	 * 当期期数
	 */
	@ApiField("step_no")
	private Long stepNo;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmt() {
		return this.amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getPenalty() {
		return this.penalty;
	}
	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getRepayType() {
		return this.repayType;
	}
	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

	public String getServiceFee() {
		return this.serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}

	public Long getStepNo() {
		return this.stepNo;
	}
	public void setStepNo(Long stepNo) {
		this.stepNo = stepNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
