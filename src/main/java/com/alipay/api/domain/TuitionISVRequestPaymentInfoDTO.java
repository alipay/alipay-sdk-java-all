package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 付款信息
 *
 * @author auto create
 * @since 1.0, 2021-08-16 15:52:36
 */
public class TuitionISVRequestPaymentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3395189746121761695L;

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

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

}
