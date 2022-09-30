package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个体工商户的银行账户信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class PersonnalBankAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 3895454127234673859L;

	/**
	 * 填入的银行账号对应的银行预留手机号
	 */
	@ApiField("personal_bank_account_mobile")
	private String personalBankAccountMobile;

	/**
	 * 个人或个体工商户的银行账号，在商户确认环节用来作为认证的一种材料。
	 */
	@ApiField("personal_bank_card_no")
	private String personalBankCardNo;

	/**
	 * 填入的银行账号对应的持卡人的身份证号码
	 */
	@ApiField("personal_bank_holder_certno")
	private String personalBankHolderCertno;

	/**
	 * 填入的银行账号对应的持卡人名称
	 */
	@ApiField("personal_bank_holder_name")
	private String personalBankHolderName;

	public String getPersonalBankAccountMobile() {
		return this.personalBankAccountMobile;
	}
	public void setPersonalBankAccountMobile(String personalBankAccountMobile) {
		this.personalBankAccountMobile = personalBankAccountMobile;
	}

	public String getPersonalBankCardNo() {
		return this.personalBankCardNo;
	}
	public void setPersonalBankCardNo(String personalBankCardNo) {
		this.personalBankCardNo = personalBankCardNo;
	}

	public String getPersonalBankHolderCertno() {
		return this.personalBankHolderCertno;
	}
	public void setPersonalBankHolderCertno(String personalBankHolderCertno) {
		this.personalBankHolderCertno = personalBankHolderCertno;
	}

	public String getPersonalBankHolderName() {
		return this.personalBankHolderName;
	}
	public void setPersonalBankHolderName(String personalBankHolderName) {
		this.personalBankHolderName = personalBankHolderName;
	}

}
