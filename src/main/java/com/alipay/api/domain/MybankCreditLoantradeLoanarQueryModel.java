package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商业平台合作-查询贷款合约
 *
 * @author auto create
 * @since 1.0, 2020-12-14 20:38:21
 */
public class MybankCreditLoantradeLoanarQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6284315565661656817L;

	/**
	 * 客户的角色编号
	 */
	@ApiField("iproleid")
	private String iproleid;

	/**
	 * 合约编号
	 */
	@ApiField("loanarno")
	private String loanarno;

	/**
	 * 用于场景角色的查询，默认不填
扫码付业务填 1
	 */
	@ApiField("roletype")
	private String roletype;

	public String getIproleid() {
		return this.iproleid;
	}
	public void setIproleid(String iproleid) {
		this.iproleid = iproleid;
	}

	public String getLoanarno() {
		return this.loanarno;
	}
	public void setLoanarno(String loanarno) {
		this.loanarno = loanarno;
	}

	public String getRoletype() {
		return this.roletype;
	}
	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}

}
