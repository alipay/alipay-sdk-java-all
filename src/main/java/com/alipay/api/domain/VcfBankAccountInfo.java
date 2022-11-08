package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收款方银存账号信息
 *
 * @author auto create
 * @since 1.0, 2022-07-14 15:54:48
 */
public class VcfBankAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 4194127785134124846L;

	/**
	 * 账户开户人名字
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 两位国家代码
	 */
	@ApiField("country")
	private String country;

	/**
	 * 收款方主体
	 */
	@ApiField("recon_inst")
	private String reconInst;

	/**
	 * swiftCode
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

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getReconInst() {
		return this.reconInst;
	}
	public void setReconInst(String reconInst) {
		this.reconInst = reconInst;
	}

	public String getSwiftCode() {
		return this.swiftCode;
	}
	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

}
