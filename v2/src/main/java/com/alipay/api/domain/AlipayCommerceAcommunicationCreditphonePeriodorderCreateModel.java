package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商行业信用购分期单创建
 *
 * @author auto create
 * @since 1.0, 2024-02-01 15:17:40
 */
public class AlipayCommerceAcommunicationCreditphonePeriodorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1631893533591742676L;

	/**
	 * 支付宝openid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝主单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 当期外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户当期金额，单位元
	 */
	@ApiField("period_amount")
	private String periodAmount;

	/**
	 * 合约机分期数
	 */
	@ApiField("step_number")
	private Long stepNumber;

	/**
	 * 用户本期状态
	 */
	@ApiField("user_period_status")
	private String userPeriodStatus;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPeriodAmount() {
		return this.periodAmount;
	}
	public void setPeriodAmount(String periodAmount) {
		this.periodAmount = periodAmount;
	}

	public Long getStepNumber() {
		return this.stepNumber;
	}
	public void setStepNumber(Long stepNumber) {
		this.stepNumber = stepNumber;
	}

	public String getUserPeriodStatus() {
		return this.userPeriodStatus;
	}
	public void setUserPeriodStatus(String userPeriodStatus) {
		this.userPeriodStatus = userPeriodStatus;
	}

}
