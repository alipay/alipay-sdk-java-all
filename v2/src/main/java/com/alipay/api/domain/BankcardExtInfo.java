package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行卡的附加信息描述
 *
 * @author auto create
 * @since 1.0, 2023-05-30 11:33:28
 */
public class BankcardExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8498442579289997224L;

	/**
	 * 收款账户类型。
1：对公（在金融机构开设的公司账户）,如果银行卡为对公，必须传递省市支行信息或者联行号
2：对私（在金融机构开设的个人账户）
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 银行支行联行号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 收款银行所属支行
	 */
	@ApiField("inst_branch_name")
	private String instBranchName;

	/**
	 * 收款银行所在市
	 */
	@ApiField("inst_city")
	private String instCity;

	/**
	 * 机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 银行所在省份
	 */
	@ApiField("inst_province")
	private String instProvince;

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getInstBranchName() {
		return this.instBranchName;
	}
	public void setInstBranchName(String instBranchName) {
		this.instBranchName = instBranchName;
	}

	public String getInstCity() {
		return this.instCity;
	}
	public void setInstCity(String instCity) {
		this.instCity = instCity;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getInstProvince() {
		return this.instProvince;
	}
	public void setInstProvince(String instProvince) {
		this.instProvince = instProvince;
	}

}
