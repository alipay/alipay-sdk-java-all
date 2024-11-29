package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物险-结算单状态同步
 *
 * @author auto create
 * @since 1.0, 2024-07-23 22:08:28
 */
public class AlipayInsSceneSettleWorkersaasSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6863927754474631469L;

	/**
	 * 收款人户名
	 */
	@ApiField("emp_name")
	private String empName;

	/**
	 * 收款人手机号
	 */
	@ApiField("emp_phone")
	private String empPhone;

	/**
	 * 交易流水号。取转账渠道交易流水。
	 */
	@ApiField("front_log_no")
	private String frontLogNo;

	/**
	 * 取收款人证件号码。
	 */
	@ApiField("license_id")
	private String licenseId;

	/**
	 * 收款人证件类型
	 */
	@ApiField("license_type")
	private String licenseType;

	/**
	 * 取蚂蚁保结算单号。
	 */
	@ApiField("outer_trade_no")
	private String outerTradeNo;

	/**
	 * 收款账号
	 */
	@ApiField("pay_account")
	private String payAccount;

	/**
	 * 交易金额，单位 元。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 交易类型
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 取转账渠道失败code。
	 */
	@ApiField("trade_fail_code")
	private String tradeFailCode;

	/**
	 * 交易状态
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/**
	 * 交易时间
	 */
	@ApiField("trade_time")
	private Date tradeTime;

	public String getEmpName() {
		return this.empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPhone() {
		return this.empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getFrontLogNo() {
		return this.frontLogNo;
	}
	public void setFrontLogNo(String frontLogNo) {
		this.frontLogNo = frontLogNo;
	}

	public String getLicenseId() {
		return this.licenseId;
	}
	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	public String getLicenseType() {
		return this.licenseType;
	}
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public String getOuterTradeNo() {
		return this.outerTradeNo;
	}
	public void setOuterTradeNo(String outerTradeNo) {
		this.outerTradeNo = outerTradeNo;
	}

	public String getPayAccount() {
		return this.payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getTradeFailCode() {
		return this.tradeFailCode;
	}
	public void setTradeFailCode(String tradeFailCode) {
		this.tradeFailCode = tradeFailCode;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public Date getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}

}
