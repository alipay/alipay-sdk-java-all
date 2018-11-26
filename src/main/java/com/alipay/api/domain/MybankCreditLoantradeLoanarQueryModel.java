package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商业平台合作-查询贷款合约
 *
 * @author auto create
 * @since 1.0, 2018-11-14 16:41:28
 */
public class MybankCreditLoantradeLoanarQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2325237477946137874L;

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

}
