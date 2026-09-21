package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商代商户MCP工具调试
 *
 * @author auto create
 * @since 1.0, 2026-09-18 22:32:55
 */
public class AlipayOpenSpMcpDebugSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 2436944186646716581L;

	/**
	 * MCP能力编码code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/**
	 * null
	 */
	@ApiListField("headers")
	@ApiField("name_value_param")
	private List<NameValueParam> headers;

	/**
	 * null
	 */
	@ApiListField("query_params")
	@ApiField("name_value_param")
	private List<NameValueParam> queryParams;

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

	public List<NameValueParam> getHeaders() {
		return this.headers;
	}
	public void setHeaders(List<NameValueParam> headers) {
		this.headers = headers;
	}

	public List<NameValueParam> getQueryParams() {
		return this.queryParams;
	}
	public void setQueryParams(List<NameValueParam> queryParams) {
		this.queryParams = queryParams;
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
