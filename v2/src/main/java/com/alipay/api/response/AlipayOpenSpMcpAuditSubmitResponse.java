package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.mcp.audit.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class AlipayOpenSpMcpAuditSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2814851627937729265L;

	/** 
	 * 提交审核结果
	 */
	@ApiField("submit_result")
	private String submitResult;

	/** 
	 * null
	 */
	@ApiListField("tool_list")
	@ApiField("string")
	private List<String> toolList;

	public void setSubmitResult(String submitResult) {
		this.submitResult = submitResult;
	}
	public String getSubmitResult( ) {
		return this.submitResult;
	}

	public void setToolList(List<String> toolList) {
		this.toolList = toolList;
	}
	public List<String> getToolList( ) {
		return this.toolList;
	}

}
