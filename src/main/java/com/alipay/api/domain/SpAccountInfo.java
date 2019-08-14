package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构专户信息模型
 *
 * @author auto create
 * @since 1.0, 2019-01-17 17:41:27
 */
public class SpAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 3173885537924476613L;

	/**
	 * 机构专户开户银行名称
	 */
	@ApiField("account_inst_name")
	private String accountInstName;

	/**
	 * 账户名称（个人对应真实姓名，企业用户对应是企业注册名）
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 开户银行的分支行完整名称
	 */
	@ApiField("inst_branch_name")
	private String instBranchName;

	/**
	 * 开户行所在省市信息
	 */
	@ApiField("inst_location")
	private String instLocation;

	/**
	 * 机构专户账号
	 */
	@ApiField("sp_account_no")
	private String spAccountNo;

	public String getAccountInstName() {
		return this.accountInstName;
	}
	public void setAccountInstName(String accountInstName) {
		this.accountInstName = accountInstName;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getInstBranchName() {
		return this.instBranchName;
	}
	public void setInstBranchName(String instBranchName) {
		this.instBranchName = instBranchName;
	}

	public String getInstLocation() {
		return this.instLocation;
	}
	public void setInstLocation(String instLocation) {
		this.instLocation = instLocation;
	}

	public String getSpAccountNo() {
		return this.spAccountNo;
	}
	public void setSpAccountNo(String spAccountNo) {
		this.spAccountNo = spAccountNo;
	}

}
