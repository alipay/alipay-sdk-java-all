package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.srcfgoventer.access.approve response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-21 17:37:26
 */
public class XingheLendassistSrcfgoventerAccessApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 2771193785861391724L;

	/** 
	 * 本次审核请求返回的唯一申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/** 
	 * 审核结果，WAIT_APPROVE-待审批、APPROVE_PASS-审批通过、APPROVE_REJECT-审批拒绝
	 */
	@ApiField("approve_result")
	private String approveResult;

	/** 
	 * 准入审核拒绝时，返回拒绝原因
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

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}
	public String getRefuseReason( ) {
		return this.refuseReason;
	}

}
