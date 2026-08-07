package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HeaderParam;
import com.alipay.api.domain.McpToolList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.mcp.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class AlipayOpenSpMcpDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4526639991957586783L;

	/** 
	 * MCP能力编码状态
	 */
	@ApiField("ability_status")
	private String abilityStatus;

	/** 
	 * MCP能力编码版本
	 */
	@ApiField("ability_version")
	private String abilityVersion;

	/** 
	 * Header参数列表
	 */
	@ApiField("header_list")
	private HeaderParam headerList;

	/** 
	 * MCP图标文件链接
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/** 
	 * MCP中文名
	 */
	@ApiField("mcp_chinese_name")
	private String mcpChineseName;

	/** 
	 * MCP描述
	 */
	@ApiField("mcp_desc")
	private String mcpDesc;

	/** 
	 * MCP英文名
	 */
	@ApiField("mcp_english_name")
	private String mcpEnglishName;

	/** 
	 * MCP服务URL
	 */
	@ApiField("mcp_server_url")
	private String mcpServerUrl;

	/** 
	 * null
	 */
	@ApiListField("mcp_tool_list")
	@ApiField("mcp_tool_list")
	private List<McpToolList> mcpToolList;

	/** 
	 * 请求超时时间(ms)
	 */
	@ApiField("request_timeout")
	private Long requestTimeout;

	/** 
	 * 响应超时时间(ms)
	 */
	@ApiField("response_timeout")
	private Long responseTimeout;

	/** 
	 * null
	 */
	@ApiListField("support_account_type_list")
	@ApiField("string")
	private List<String> supportAccountTypeList;

	/** 
	 * null
	 */
	@ApiListField("support_protocols")
	@ApiField("string")
	private List<String> supportProtocols;

	public void setAbilityStatus(String abilityStatus) {
		this.abilityStatus = abilityStatus;
	}
	public String getAbilityStatus( ) {
		return this.abilityStatus;
	}

	public void setAbilityVersion(String abilityVersion) {
		this.abilityVersion = abilityVersion;
	}
	public String getAbilityVersion( ) {
		return this.abilityVersion;
	}

	public void setHeaderList(HeaderParam headerList) {
		this.headerList = headerList;
	}
	public HeaderParam getHeaderList( ) {
		return this.headerList;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getIconUrl( ) {
		return this.iconUrl;
	}

	public void setMcpChineseName(String mcpChineseName) {
		this.mcpChineseName = mcpChineseName;
	}
	public String getMcpChineseName( ) {
		return this.mcpChineseName;
	}

	public void setMcpDesc(String mcpDesc) {
		this.mcpDesc = mcpDesc;
	}
	public String getMcpDesc( ) {
		return this.mcpDesc;
	}

	public void setMcpEnglishName(String mcpEnglishName) {
		this.mcpEnglishName = mcpEnglishName;
	}
	public String getMcpEnglishName( ) {
		return this.mcpEnglishName;
	}

	public void setMcpServerUrl(String mcpServerUrl) {
		this.mcpServerUrl = mcpServerUrl;
	}
	public String getMcpServerUrl( ) {
		return this.mcpServerUrl;
	}

	public void setMcpToolList(List<McpToolList> mcpToolList) {
		this.mcpToolList = mcpToolList;
	}
	public List<McpToolList> getMcpToolList( ) {
		return this.mcpToolList;
	}

	public void setRequestTimeout(Long requestTimeout) {
		this.requestTimeout = requestTimeout;
	}
	public Long getRequestTimeout( ) {
		return this.requestTimeout;
	}

	public void setResponseTimeout(Long responseTimeout) {
		this.responseTimeout = responseTimeout;
	}
	public Long getResponseTimeout( ) {
		return this.responseTimeout;
	}

	public void setSupportAccountTypeList(List<String> supportAccountTypeList) {
		this.supportAccountTypeList = supportAccountTypeList;
	}
	public List<String> getSupportAccountTypeList( ) {
		return this.supportAccountTypeList;
	}

	public void setSupportProtocols(List<String> supportProtocols) {
		this.supportProtocols = supportProtocols;
	}
	public List<String> getSupportProtocols( ) {
		return this.supportProtocols;
	}

}
