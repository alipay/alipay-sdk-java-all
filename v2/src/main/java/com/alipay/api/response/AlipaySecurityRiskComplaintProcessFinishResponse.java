package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.complaint.process.finish response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-15 17:34:20
 */
public class AlipaySecurityRiskComplaintProcessFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 8225692341763613228L;

	/** 
	 * 本次投诉处理是否成功，表示系统后台是否成功收到本次请求并完成处理流程
	 */
	@ApiField("complaint_process_success")
	private Boolean complaintProcessSuccess;

	public void setComplaintProcessSuccess(Boolean complaintProcessSuccess) {
		this.complaintProcessSuccess = complaintProcessSuccess;
	}
	public Boolean getComplaintProcessSuccess( ) {
		return this.complaintProcessSuccess;
	}

}
