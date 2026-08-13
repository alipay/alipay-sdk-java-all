package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商代商户MCP工具调试
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class AlipayOpenSpMcpDebugSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1231646532921832667L;

	/**
	 * MCP能力编码code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/**
	 * 工具编码
	 */
	@ApiField("tool_code")
	private String toolCode;

	/**
	 * 工具调试报文JSON
	 */
	@ApiField("tool_schema")
	private String toolSchema;

	public String getAbilityCode() {
		return this.abilityCode;
	}
	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

	public String getToolCode() {
		return this.toolCode;
	}
	public void setToolCode(String toolCode) {
		this.toolCode = toolCode;
	}

	public String getToolSchema() {
		return this.toolSchema;
	}
	public void setToolSchema(String toolSchema) {
		this.toolSchema = toolSchema;
	}

}
