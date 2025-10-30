package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.srcfgestagecredit.first.approve response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-21 17:37:26
 */
public class XingheLendassistSrcfgestagecreditFirstApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5153387574393851284L;

	/** 
	 * 政企员工团购分期授信初审返回的唯一申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 初审审核结果，APPROVE_PASS-审批通过、APPROVE_REJECT-审批拒绝
	 */
	@ApiField("approve_result")
	private String approveResult;

	/** 
	 * 审核通过时，通过类型有值；NEED_SC-需要走芝麻信用、NOT_NEED_SC-不走芝麻信用
	 */
	@ApiField("pass_type")
	private String passType;

	/** 
	 * 授信审核拒绝返回拒绝原因
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}
	public String getApplyNo( ) {
		return this.applyNo;
	}

	public void setApproveResult(String approveResult) {
		this.approveResult = approveResult;
	}
	public String getApproveResult( ) {
		return this.approveResult;
	}

	public void setPassType(String passType) {
		this.passType = passType;
	}
	public String getPassType( ) {
		return this.passType;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}
	public String getRefuseReason( ) {
		return this.refuseReason;
	}

}
