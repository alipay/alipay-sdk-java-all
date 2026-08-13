package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.mcp.info.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:53
 */
public class AlipayOpenSpMcpInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7448356435823827848L;

	/** 
	 * MCP能力编码code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/** 
	 * MCP版本号
	 */
	@ApiField("ability_version")
	private String abilityVersion;

	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}
	public String getAbilityCode( ) {
		return this.abilityCode;
	}

	public void setAbilityVersion(String abilityVersion) {
		this.abilityVersion = abilityVersion;
	}
	public String getAbilityVersion( ) {
		return this.abilityVersion;
	}

}
