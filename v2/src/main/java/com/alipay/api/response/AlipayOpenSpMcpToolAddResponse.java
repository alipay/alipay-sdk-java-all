package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ToolInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.mcp.tool.add response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:53
 */
public class AlipayOpenSpMcpToolAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8252523333456228154L;

	/** 
	 * null
	 */
	@ApiListField("tool_info_list")
	@ApiField("tool_info")
	private List<ToolInfo> toolInfoList;

	public void setToolInfoList(List<ToolInfo> toolInfoList) {
		this.toolInfoList = toolInfoList;
	}
	public List<ToolInfo> getToolInfoList( ) {
		return this.toolInfoList;
	}

}
