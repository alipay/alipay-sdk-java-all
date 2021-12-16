package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账号信息
 *
 * @author auto create
 * @since 1.0, 2021-10-13 10:32:13
 */
public class AccountInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5711321826479227597L;

	/**
	 * 账户别名，当前主要用于支付宝，为用户注册邮箱或手机号
	 */
	@ApiField("account_alias_name")
	private String accountAliasName;

	/**
	 * 账户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账户性质
	 */
	@ApiField("account_nature")
	private String accountNature;

	/**
	 * 账户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账户类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 账户uid
	 */
	@ApiField("account_user_id")
	private String accountUserId;

	/**
	 * 账户机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 账户机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 账户外部机构简称
	 */
	@ApiField("out_inst_abbr")
	private String outInstAbbr;

	/**
	 * 账户外部机构名称
	 */
	@ApiField("out_inst_name")
	private String outInstName;

	/**
	 * 账户父机构ID
	 */
	@ApiField("parent_inst_id")
	private String parentInstId;

	/**
	 * 子账户号 目前(20200211开始)只有招行才可能会有此字段
	 */
	@ApiField("sub_account_no")
	private String subAccountNo;

	/**
	 * 子账号类型。目前用于区分流水的子账号是 企业识别码 还是 实存子账
	 */
	@ApiField("sub_account_type")
	private String subAccountType;

	/**
	 * VO基类
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAccountAliasName() {
		return this.accountAliasName;
	}
	public void setAccountAliasName(String accountAliasName) {
		this.accountAliasName = accountAliasName;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNature() {
		return this.accountNature;
	}
	public void setAccountNature(String accountNature) {
		this.accountNature = accountNature;
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

	public String getAccountUserId() {
		return this.accountUserId;
	}
	public void setAccountUserId(String accountUserId) {
		this.accountUserId = accountUserId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getOutInstAbbr() {
		return this.outInstAbbr;
	}
	public void setOutInstAbbr(String outInstAbbr) {
		this.outInstAbbr = outInstAbbr;
	}

	public String getOutInstName() {
		return this.outInstName;
	}
	public void setOutInstName(String outInstName) {
		this.outInstName = outInstName;
	}

	public String getParentInstId() {
		return this.parentInstId;
	}
	public void setParentInstId(String parentInstId) {
		this.parentInstId = parentInstId;
	}

	public String getSubAccountNo() {
		return this.subAccountNo;
	}
	public void setSubAccountNo(String subAccountNo) {
		this.subAccountNo = subAccountNo;
	}

	public String getSubAccountType() {
		return this.subAccountType;
	}
	public void setSubAccountType(String subAccountType) {
		this.subAccountType = subAccountType;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
