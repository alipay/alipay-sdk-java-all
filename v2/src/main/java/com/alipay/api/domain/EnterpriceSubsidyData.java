package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户账户信息
 *
 * @author auto create
 * @since 1.0, 2025-08-04 10:17:36
 */
public class EnterpriceSubsidyData extends AlipayObject {

	private static final long serialVersionUID = 8463362638936413548L;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 失败的原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 就诊编号
	 */
	@ApiField("mdtrt_id")
	private String mdtrtId;

	/**
	 * 密算数据
	 */
	@ApiField("ms_data")
	private EnterpriceSubsidyMsData msData;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 冲减金额
	 */
	@ApiField("offset_amount")
	private String offsetAmount;

	/**
	 * 支付宝转账订单号（失败时不传
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 账户类型是alipay时：支付宝用户名（邮箱、手机号）
账户类型是bankcard时：银行卡号
	 */
	@ApiField("pay_account")
	private String payAccount;

	/**
	 * 账户类型（alipay/bankcard）
	 */
	@ApiField("pay_account_type")
	private String payAccountType;

	/**
	 * 拨付金额 + 冲抵金额 = 密算里边计算出来的拨付金额
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 支付宝支付资金流水号
	 */
	@ApiField("pay_fund_order_id")
	private String payFundOrderId;

	/**
	 * 拨付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 医保结算单号
	 */
	@ApiField("setl_id")
	private String setlId;

	/**
	 * 转账成功：success
转账失败：fail
未开始：pending
	 */
	@ApiField("transfer_result")
	private String transferResult;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getMdtrtId() {
		return this.mdtrtId;
	}
	public void setMdtrtId(String mdtrtId) {
		this.mdtrtId = mdtrtId;
	}

	public EnterpriceSubsidyMsData getMsData() {
		return this.msData;
	}
	public void setMsData(EnterpriceSubsidyMsData msData) {
		this.msData = msData;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOffsetAmount() {
		return this.offsetAmount;
	}
	public void setOffsetAmount(String offsetAmount) {
		this.offsetAmount = offsetAmount;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayAccount() {
		return this.payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public String getPayAccountType() {
		return this.payAccountType;
	}
	public void setPayAccountType(String payAccountType) {
		this.payAccountType = payAccountType;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayFundOrderId() {
		return this.payFundOrderId;
	}
	public void setPayFundOrderId(String payFundOrderId) {
		this.payFundOrderId = payFundOrderId;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getSetlId() {
		return this.setlId;
	}
	public void setSetlId(String setlId) {
		this.setlId = setlId;
	}

	public String getTransferResult() {
		return this.transferResult;
	}
	public void setTransferResult(String transferResult) {
		this.transferResult = transferResult;
	}

}
