package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户验证
 *
 * @author auto create
 * @since 1.0, 2021-04-30 16:47:35
 */
public class AlipayOverseasOpenAccountConsultModel extends AlipayObject {

	private static final long serialVersionUID = 2742898838368446661L;

	/**
	 * 账户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 银行代码包括：

美国银行abafw号

（aba/fw）

英国收款银行清算号(sort_code)

澳大利亚收款银行清算号(bsb_code)

加拿大收款银行清算号(cc_code)
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 国家
	 */
	@ApiField("country")
	private String country;

	/**
	 * 学校id
	 */
	@ApiField("school_id")
	private String schoolId;

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

	public String getSchoolId() {
		return this.schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSwiftCode() {
		return this.swiftCode;
	}
	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

}
