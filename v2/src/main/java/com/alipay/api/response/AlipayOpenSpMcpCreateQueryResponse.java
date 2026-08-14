package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.mcp.create.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 16:37:51
 */
public class AlipayOpenSpMcpCreateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8618524718989382235L;

	/** 
	 * MCP能力编码code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/** 
	 * MCP中文名
	 */
	@ApiField("mcp_chinese_name")
	private String mcpChineseName;

	/** 
	 * MCP英文名
	 */
	@ApiField("mcp_english_name")
	private String mcpEnglishName;

	/** 
	 * 申请单状态
	 */
	@ApiField("status")
	private String status;

	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}
	public String getAbilityCode( ) {
		return this.abilityCode;
	}

	public void setMcpChineseName(String mcpChineseName) {
		this.mcpChineseName = mcpChineseName;
	}
	public String getMcpChineseName( ) {
		return this.mcpChineseName;
	}

	public void setMcpEnglishName(String mcpEnglishName) {
		this.mcpEnglishName = mcpEnglishName;
	}
	public String getMcpEnglishName( ) {
		return this.mcpEnglishName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
