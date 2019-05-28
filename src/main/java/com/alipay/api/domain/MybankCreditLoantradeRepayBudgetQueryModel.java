package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户主动还款试算
 *
 * @author auto create
 * @since 1.0, 2018-10-11 23:24:16
 */
public class MybankCreditLoantradeRepayBudgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8516768692855935331L;

	/**
	 * 申请还款金额，如果budget_type为TOTAL_AMT，则填写还款总金额，如果为PRIN_AMT则填写还款本金
	 */
	@ApiField("apply_repay_prin")
	private String applyRepayPrin;

	/**
	 * TOTAL_AMT：总额还款，PRIN_AMT：本金还款，如果为空，默认为本金还款
	 */
	@ApiField("budget_type")
	private String budgetType;

	/**
	 * 可为空，默认需要判断是否可还款，false为不需要判断是否可还款，其他为需要判断是否可还款
	 */
	@ApiField("can_repay_flag")
	private Boolean canRepayFlag;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 银行参与者id，是在网商银行创建会员后生成的id，网商银行会员的唯一标识
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 银行参与者角色id，是在网商银行创建会员后生成的角色id，网商银行会员角色的唯一标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 贷款合约编号
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	public String getApplyRepayPrin() {
		return this.applyRepayPrin;
	}
	public void setApplyRepayPrin(String applyRepayPrin) {
		this.applyRepayPrin = applyRepayPrin;
	}

	public String getBudgetType() {
		return this.budgetType;
	}
	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
	}

	public Boolean getCanRepayFlag() {
		return this.canRepayFlag;
	}
	public void setCanRepayFlag(Boolean canRepayFlag) {
		this.canRepayFlag = canRepayFlag;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLoanArNo() {
		return this.loanArNo;
	}
	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}

}
