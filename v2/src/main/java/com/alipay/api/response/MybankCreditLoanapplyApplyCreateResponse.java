package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.apply.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 11:19:35
 */
public class MybankCreditLoanapplyApplyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6377232168954223775L;

	/** 
	 * 申请单编号，展示给客户，无业务意义
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 客户在网商银行的角色ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/** 
	 * 子申请单号，唯一标识一笔申请，业务使用
	 */
	@ApiField("sub_apply_no")
	private String subApplyNo;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public String getIpRoleId( ) {
		return this.ipRoleId;
	}

	public void setSubApplyNo(String subApplyNo) {
		this.subApplyNo = subApplyNo;
	}
	public String getSubApplyNo( ) {
		return this.subApplyNo;
	}

}
