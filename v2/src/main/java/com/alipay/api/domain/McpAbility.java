package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * MCP schema 信息
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:12:58
 */
public class McpAbility extends AlipayObject {

	private static final long serialVersionUID = 5314179551131536644L;

	/**
	 * null
	 */
	@ApiListField("authorization")
	@ApiField("mcp_authorization")
	private List<McpAuthorization> authorization;

	/**
	 * 开放平台网关调用地址
	 */
	@ApiField("opengw_url")
	private String opengwUrl;

	/**
	 * 服务发现编码
	 */
	@ApiField("server_discovery_code")
	private String serverDiscoveryCode;

	/**
	 * null
	 */
	@ApiListField("tool_list")
	@ApiField("mcp_tool")
	private List<McpTool> toolList;

	public List<McpAuthorization> getAuthorization() {
		return this.authorization;
	}
	public void setAuthorization(List<McpAuthorization> authorization) {
		this.authorization = authorization;
	}

	public String getOpengwUrl() {
		return this.opengwUrl;
	}
	public void setOpengwUrl(String opengwUrl) {
		this.opengwUrl = opengwUrl;
	}

	public String getServerDiscoveryCode() {
		return this.serverDiscoveryCode;
	}
	public void setServerDiscoveryCode(String serverDiscoveryCode) {
		this.serverDiscoveryCode = serverDiscoveryCode;
	}

	public List<McpTool> getToolList() {
		return this.toolList;
	}
	public void setToolList(List<McpTool> toolList) {
		this.toolList = toolList;
	}

}
