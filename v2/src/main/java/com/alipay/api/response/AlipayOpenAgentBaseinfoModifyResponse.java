package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.baseinfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-10 11:33:01
 */
public class AlipayOpenAgentBaseinfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7311864632738651852L;

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
