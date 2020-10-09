package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构联行号查询功能
 *
 * @author auto create
 * @since 1.0, 2020-06-04 16:09:58
 */
public class AlipayFinancialnetAuthPbcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7761954655583265842L;

	/**
	 * 联行号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 支行名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

}
