package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.mcp.info.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-31 09:42:54
 */
public class AlipayOpenSpMcpInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4315217955825777826L;

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
