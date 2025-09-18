package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款银行信息
 *
 * @author auto create
 * @since 1.0, 2025-08-29 11:05:36
 */
public class RepayBankInfo extends AlipayObject {

	private static final long serialVersionUID = 6742878211477284775L;

	/**
	 * 还款银行编码
	 */
	@ApiField("repay_bank_code")
	private String repayBankCode;

	/**
	 * 还款银行分行名称
	 */
	@ApiField("repay_branch_name")
	private String repayBranchName;

	/**
	 * 还款银行所在城市
	 */
	@ApiField("repay_city")
	private String repayCity;

	/**
	 * 还款银行机构ID
	 */
	@ApiField("repay_inst_id")
	private String repayInstId;

	/**
	 * 还款账户
	 */
	@ApiField("repay_name")
	private String repayName;

	/**
	 * 还款账号
	 */
	@ApiField("repay_no")
	private String repayNo;

	/**
	 * 还款银行所在省
	 */
	@ApiField("repay_province")
	private String repayProvince;

	public String getRepayBankCode() {
		return this.repayBankCode;
	}
	public void setRepayBankCode(String repayBankCode) {
		this.repayBankCode = repayBankCode;
	}

	public String getRepayBranchName() {
		return this.repayBranchName;
	}
	public void setRepayBranchName(String repayBranchName) {
		this.repayBranchName = repayBranchName;
	}

	public String getRepayCity() {
		return this.repayCity;
	}
	public void setRepayCity(String repayCity) {
		this.repayCity = repayCity;
	}

	public String getRepayInstId() {
		return this.repayInstId;
	}
	public void setRepayInstId(String repayInstId) {
		this.repayInstId = repayInstId;
	}

	public String getRepayName() {
		return this.repayName;
	}
	public void setRepayName(String repayName) {
		this.repayName = repayName;
	}

	public String getRepayNo() {
		return this.repayNo;
	}
	public void setRepayNo(String repayNo) {
		this.repayNo = repayNo;
	}

	public String getRepayProvince() {
		return this.repayProvince;
	}
	public void setRepayProvince(String repayProvince) {
		this.repayProvince = repayProvince;
	}

}
