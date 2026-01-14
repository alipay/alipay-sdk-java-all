package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-16 16:02:42
 */
public class RentPayQueryBillInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 3747159722244814481L;

	/**
	 * 公积金支付返回
	 */
	@ApiField("accfund_result")
	private String accfundResult;

	/**
	 * 申请日期
	 */
	@ApiField("application_date")
	private String applicationDate;

	/**
	 * 证件号码
	 */
	@ApiField("cert_num")
	private String certNum;

	/**
	 * 身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 提取利息，单位：元
	 */
	@ApiField("draw_interest")
	private String drawInterest;

	/**
	 * 提取原因
	 */
	@ApiField("draw_item")
	private String drawItem;

	/**
	 * 提取本金，单位：元
	 */
	@ApiField("draw_principal")
	private String drawPrincipal;

	/**
	 * 支付日期
	 */
	@ApiField("payment_date")
	private String paymentDate;

	/**
	 * 提取资金支付状态
	 */
	@ApiField("payment_state")
	private String paymentState;

	/**
	 * 本息合计，单位：元
	 */
	@ApiField("principal_interest_total")
	private String principalInterestTotal;

	/**
	 * 中国人民银行国家金库
	 */
	@ApiField("recipient_bank_code")
	private String recipientBankCode;

	/**
	 * 转入账号
	 */
	@ApiField("recipient_bank_num")
	private String recipientBankNum;

	/**
	 * 转入户名
	 */
	@ApiField("recipient_bank_username")
	private String recipientBankUsername;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 签约用户在公积金侧的备案编号
	 */
	@ApiField("user_record_no")
	private String userRecordNo;

	public String getAccfundResult() {
		return this.accfundResult;
	}
	public void setAccfundResult(String accfundResult) {
		this.accfundResult = accfundResult;
	}

	public String getApplicationDate() {
		return this.applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getCertNum() {
		return this.certNum;
	}
	public void setCertNum(String certNum) {
		this.certNum = certNum;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getDrawInterest() {
		return this.drawInterest;
	}
	public void setDrawInterest(String drawInterest) {
		this.drawInterest = drawInterest;
	}

	public String getDrawItem() {
		return this.drawItem;
	}
	public void setDrawItem(String drawItem) {
		this.drawItem = drawItem;
	}

	public String getDrawPrincipal() {
		return this.drawPrincipal;
	}
	public void setDrawPrincipal(String drawPrincipal) {
		this.drawPrincipal = drawPrincipal;
	}

	public String getPaymentDate() {
		return this.paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentState() {
		return this.paymentState;
	}
	public void setPaymentState(String paymentState) {
		this.paymentState = paymentState;
	}

	public String getPrincipalInterestTotal() {
		return this.principalInterestTotal;
	}
	public void setPrincipalInterestTotal(String principalInterestTotal) {
		this.principalInterestTotal = principalInterestTotal;
	}

	public String getRecipientBankCode() {
		return this.recipientBankCode;
	}
	public void setRecipientBankCode(String recipientBankCode) {
		this.recipientBankCode = recipientBankCode;
	}

	public String getRecipientBankNum() {
		return this.recipientBankNum;
	}
	public void setRecipientBankNum(String recipientBankNum) {
		this.recipientBankNum = recipientBankNum;
	}

	public String getRecipientBankUsername() {
		return this.recipientBankUsername;
	}
	public void setRecipientBankUsername(String recipientBankUsername) {
		this.recipientBankUsername = recipientBankUsername;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRecordNo() {
		return this.userRecordNo;
	}
	public void setUserRecordNo(String userRecordNo) {
		this.userRecordNo = userRecordNo;
	}

}
