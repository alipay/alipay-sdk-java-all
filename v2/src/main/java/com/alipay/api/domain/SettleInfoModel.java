package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结算信息模型
 *
 * @author auto create
 * @since 1.0, 2026-06-26 21:15:54
 */
public class SettleInfoModel extends AlipayObject {

	private static final long serialVersionUID = 8512537988123585358L;

	/**
	 * 结算账号,一般是手机号或者邮箱
	 */
	@ApiField("account")
	private String account;

	/**
	 * 具体办理开户业务的银行分支机构名称
	 */
	@ApiField("account_branch_name")
	private String accountBranchName;

	/**
	 * 开户支行所在的城市名称（地级市或直辖市）
	 */
	@ApiField("account_inst_city")
	private String accountInstCity;

	/**
	 * 支行的银行联行号（也称“支付系统行号”）
	 */
	@ApiField("account_inst_id")
	private String accountInstId;

	/**
	 * 中国工商银行
	 */
	@ApiField("account_inst_name")
	private String accountInstName;

	/**
	 * 开户支行所在的省级行政区名称
	 */
	@ApiField("account_inst_province")
	private String accountInstProvince;

	/**
	 * 客户开设银行账户的具体营业网点，通常包括银行名称和支行名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 结算类型设置,0默认是结算到户,目前只支持结算到户
	 */
	@ApiField("type")
	private String type;

	/**
	 * 账号使用类型：01对公、02对私
	 */
	@ApiField("usage_type")
	private String usageType;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountBranchName() {
		return this.accountBranchName;
	}
	public void setAccountBranchName(String accountBranchName) {
		this.accountBranchName = accountBranchName;
	}

	public String getAccountInstCity() {
		return this.accountInstCity;
	}
	public void setAccountInstCity(String accountInstCity) {
		this.accountInstCity = accountInstCity;
	}

	public String getAccountInstId() {
		return this.accountInstId;
	}
	public void setAccountInstId(String accountInstId) {
		this.accountInstId = accountInstId;
	}

	public String getAccountInstName() {
		return this.accountInstName;
	}
	public void setAccountInstName(String accountInstName) {
		this.accountInstName = accountInstName;
	}

	public String getAccountInstProvince() {
		return this.accountInstProvince;
	}
	public void setAccountInstProvince(String accountInstProvince) {
		this.accountInstProvince = accountInstProvince;
	}

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

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUsageType() {
		return this.usageType;
	}
	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

}
