package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子账户详情
 *
 * @author auto create
 * @since 1.0, 2022-11-25 16:49:15
 */
public class CardSubAccountResult extends AlipayObject {

	private static final long serialVersionUID = 1741816845847426845L;

	/**
	 * 账户类型
	 */
	@ApiField("account_belong")
	private String accountBelong;

	/**
	 * 主户账户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 充值批次号
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 1.00
	 */
	@ApiField("denomination")
	private String denomination;

	/**
	 * 开始时间
	 */
	@ApiField("effective_date")
	private String effectiveDate;

	/**
	 * 充值单号
	 */
	@ApiField("recharge_no")
	private String rechargeNo;

	/**
	 * 子账户号
	 */
	@ApiField("sub_account_no")
	private String subAccountNo;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 结束时间
	 */
	@ApiField("validate_date")
	private String validateDate;

	public String getAccountBelong() {
		return this.accountBelong;
	}
	public void setAccountBelong(String accountBelong) {
		this.accountBelong = accountBelong;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getDenomination() {
		return this.denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getEffectiveDate() {
		return this.effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getRechargeNo() {
		return this.rechargeNo;
	}
	public void setRechargeNo(String rechargeNo) {
		this.rechargeNo = rechargeNo;
	}

	public String getSubAccountNo() {
		return this.subAccountNo;
	}
	public void setSubAccountNo(String subAccountNo) {
		this.subAccountNo = subAccountNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getValidateDate() {
		return this.validateDate;
	}
	public void setValidateDate(String validateDate) {
		this.validateDate = validateDate;
	}

}
