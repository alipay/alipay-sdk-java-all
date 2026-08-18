package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商代商户MCP工具保存
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:53
 */
public class AlipayOpenSpMcpToolAddModel extends AlipayObject {

	private static final long serialVersionUID = 6875195142225868929L;

	/**
	 * MCP能力编码code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/**
	 * 添加方式：1-自动拉取，2-手动添加
	 */
	@ApiField("add_type")
	private String addType;

	/**
	 * null
	 */
	@ApiListField("mcp_tool_info_list")
	@ApiField("mcp_tool_paramete_info")
	private List<McpToolParameteInfo> mcpToolInfoList;

	public String getAbilityCode() {
		return this.abilityCode;
	}
	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

	public String getAddType() {
		return this.addType;
	}
	public void setAddType(String addType) {
		this.addType = addType;
	}

	public List<McpToolParameteInfo> getMcpToolInfoList() {
		return this.mcpToolInfoList;
	}
	public void setMcpToolInfoList(List<McpToolParameteInfo> mcpToolInfoList) {
		this.mcpToolInfoList = mcpToolInfoList;
	}

}
