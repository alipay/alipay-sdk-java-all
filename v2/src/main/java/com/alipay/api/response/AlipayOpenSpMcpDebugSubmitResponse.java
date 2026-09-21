package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.mcp.debug.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-18 22:32:55
 */
public class AlipayOpenSpMcpDebugSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 4119376237439215573L;

	/** 
	 * 调试结果详情
	 */
	@ApiField("debug_result_info")
	private String debugResultInfo;

	/** 
	 * 调试调用是否成功
true-成功
false-失败
	 */
	@ApiField("debug_success")
	private Boolean debugSuccess;

	public void setDebugResultInfo(String debugResultInfo) {
		this.debugResultInfo = debugResultInfo;
	}
	public String getDebugResultInfo( ) {
		return this.debugResultInfo;
	}

	public void setDebugSuccess(Boolean debugSuccess) {
		this.debugSuccess = debugSuccess;
	}
	public Boolean getDebugSuccess( ) {
		return this.debugSuccess;
	}

}
