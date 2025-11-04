package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.baseinfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-17 11:22:28
 */
public class AlipayOpenAgentBaseinfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2544682567999844971L;

	/** 
	 * 安全驳回原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 安全驳回原因
	 */
	@ApiField("reject_resion")
	private String rejectResion;

	/** 
	 * 安全校验状态
	 */
	@ApiField("safe_result")
	private String safeResult;

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setRejectResion(String rejectResion) {
		this.rejectResion = rejectResion;
	}
	public String getRejectResion( ) {
		return this.rejectResion;
	}

	public void setSafeResult(String safeResult) {
		this.safeResult = safeResult;
	}
	public String getSafeResult( ) {
		return this.safeResult;
	}

}
