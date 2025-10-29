package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 当前支付信息
 *
 * @author auto create
 * @since 1.0, 2025-10-23 21:17:08
 */
public class InsPayEntryDTO extends AlipayObject {

	private static final long serialVersionUID = 7142184646351615233L;

	/**
	 * 金额，单位分
	 */
	@ApiField("fee")
	private Long fee;

	/**
	 * 支出户，根据账户类型传
	 */
	@ApiField("in_account_no")
	private String inAccountNo;

	/**
	 * 收入户账户类型（ALIPAY、BANK、OTHER）
	 */
	@ApiField("in_account_type")
	private String inAccountType;

	/**
	 * 收入户，根据账户类型传
	 */
	@ApiField("out_account_no")
	private String outAccountNo;

	/**
	 * 支出户账户类型（ALIPAY、BANK、OTHER）
	 */
	@ApiField("out_account_type")
	private String outAccountType;

	/**
	 * 支付流水
	 */
	@ApiField("pay_flow_id")
	private String payFlowId;

	/**
	 * 支付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	public Long getFee() {
		return this.fee;
	}
	public void setFee(Long fee) {
		this.fee = fee;
	}

	public String getInAccountNo() {
		return this.inAccountNo;
	}
	public void setInAccountNo(String inAccountNo) {
		this.inAccountNo = inAccountNo;
	}

	public String getInAccountType() {
		return this.inAccountType;
	}
	public void setInAccountType(String inAccountType) {
		this.inAccountType = inAccountType;
	}

	public String getOutAccountNo() {
		return this.outAccountNo;
	}
	public void setOutAccountNo(String outAccountNo) {
		this.outAccountNo = outAccountNo;
	}

	public String getOutAccountType() {
		return this.outAccountType;
	}
	public void setOutAccountType(String outAccountType) {
		this.outAccountType = outAccountType;
	}

	public String getPayFlowId() {
		return this.payFlowId;
	}
	public void setPayFlowId(String payFlowId) {
		this.payFlowId = payFlowId;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

}
