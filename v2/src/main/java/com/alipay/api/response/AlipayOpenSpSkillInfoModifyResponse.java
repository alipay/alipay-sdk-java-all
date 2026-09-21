package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.skill.info.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-20 11:07:24
 */
public class AlipayOpenSpSkillInfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3369192999938625329L;

	/** 
	 * SKILL能力编码code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/** 
	 * SKILL能力版本
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
