package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构账户模型
 *
 * @author auto create
 * @since 1.0, 2020-06-24 16:26:22
 */
public class InstAccountDTO extends AlipayObject {

	private static final long serialVersionUID = 1414475898265231693L;

	/**
	 * 账户名称，account_type取值BANK_CARD时必填
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 支付宝账号，和account_type联合唯一
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账户类型，和account_no联合唯一； 枚举值：BANK_CARD,BALANCE_ACCOUNT； 支付宝账户选择BALANCE_ACCOUNT，银行卡选择BANK_CARD。
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 银行联行号，account_type取值BANK_CARD时必填
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 业务参数
	 */
	@ApiField("biz_param")
	private String bizParam;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 账户的OU信息，根据实际情况填写
	 */
	@ApiField("org_unit")
	private String orgUnit;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getBizParam() {
		return this.bizParam;
	}
	public void setBizParam(String bizParam) {
		this.bizParam = bizParam;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOrgUnit() {
		return this.orgUnit;
	}
	public void setOrgUnit(String orgUnit) {
		this.orgUnit = orgUnit;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
