package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * PaymentInfo
 *
 * @author auto create
 * @since 1.0, 2021-08-16 15:53:18
 */
public class TuitionISVResponsePaymentInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4618326331953167528L;

	/**
	 * 账户名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private TuitionMoneyDTO amount;

	/**
	 * bank_code
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 国家码
	 */
	@ApiField("country")
	private String country;

	/**
	 * 截止日期
	 */
	@ApiField("deadline")
	private Date deadline;

	/**
	 * 付款人身份证
	 */
	@ApiField("payer_identity_card_number")
	private String payerIdentityCardNumber;

	/**
	 * 付款手机号
	 */
	@ApiField("payer_phone_number")
	private String payerPhoneNumber;

	/**
	 * 附言
	 */
	@ApiField("post_script")
	private String postScript;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * swift code
	 */
	@ApiField("swift_code")
	private String swiftCode;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public TuitionMoneyDTO getAmount() {
		return this.amount;
	}
	public void setAmount(TuitionMoneyDTO amount) {
		this.amount = amount;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
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

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSwiftCode() {
		return this.swiftCode;
	}
	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

}
