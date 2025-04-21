package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.srcfgestagecredit.second.approve response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-21 17:37:26
 */
public class XingheLendassistSrcfgestagecreditSecondApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 1162535374399251694L;

	/** 
	 * 初审审核结果，APPROVE_PASS-审批通过、APPROVE_REJECT-审批拒绝
	 */
	@ApiField("approve_result")
	private String approveResult;

	/** 
	 * 授信审核拒绝时，返回拒绝原因
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

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
