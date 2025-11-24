package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款信息
 *
 * @author auto create
 * @since 1.0, 2025-03-24 18:57:40
 */
public class TuitionISVRequestPaymentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7236931633135644712L;

	/**
	 * 170
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 留学金额
	 */
	@ApiField("amount")
	private TuitionMoneyDTO amount;

	/**
	 * billerCode字段，当收款类型为BPAY时，该字段必传
	 */
	@ApiField("biller_code")
	private String billerCode;

	/**
	 * 证书列表
	 */
	@ApiField("certificate_list")
	private String certificateList;

	/**
	 * 缴费截止日期
	 */
	@ApiField("deadline")
	private Date deadline;

	/**
	 * 付款人身份证号
	 */
	@ApiField("payer_identity_card_number")
	private String payerIdentityCardNumber;

	/**
	 * 缴费手机号
	 */
	@ApiField("payer_phone_number")
	private String payerPhoneNumber;

	/**
	 * 附言
	 */
	@ApiField("post_script")
	private String postScript;

	/**
	 * referenceNumber字段，当收款类型为BPAY时，该字段必传
	 */
	@ApiField("reference_number")
	private String referenceNumber;

	/**
	 * 学校id
	 */
	@ApiField("school_id")
	private String schoolId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public TuitionMoneyDTO getAmount() {
		return this.amount;
	}
	public void setAmount(TuitionMoneyDTO amount) {
		this.amount = amount;
	}

	public String getBillerCode() {
		return this.billerCode;
	}
	public void setBillerCode(String billerCode) {
		this.billerCode = billerCode;
	}

	public String getCertificateList() {
		return this.certificateList;
	}
	public void setCertificateList(String certificateList) {
		this.certificateList = certificateList;
	}

	public Date getDeadline() {
		return this.deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public String getPayerIdentityCardNumber() {
		return this.payerIdentityCardNumber;
	}
	public void setPayerIdentityCardNumber(String payerIdentityCardNumber) {
		this.payerIdentityCardNumber = payerIdentityCardNumber;
	}

	public String getPayerPhoneNumber() {
		return this.payerPhoneNumber;
	}
	public void setPayerPhoneNumber(String payerPhoneNumber) {
		this.payerPhoneNumber = payerPhoneNumber;
	}

	public String getPostScript() {
		return this.postScript;
	}
	public void setPostScript(String postScript) {
		this.postScript = postScript;
	}

	public String getReferenceNumber() {
		return this.referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

}
