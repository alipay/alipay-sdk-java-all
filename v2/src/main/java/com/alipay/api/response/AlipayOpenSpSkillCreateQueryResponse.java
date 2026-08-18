package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.skill.create.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 16:37:51
 */
public class AlipayOpenSpSkillCreateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5315978148138254486L;

	/** 
	 * SKILL能力编码code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/** 
	 * SKILL中文名称
	 */
	@ApiField("skill_chinese_name")
	private String skillChineseName;

	/** 
	 * SKILL英文名称
	 */
	@ApiField("skill_english_name")
	private String skillEnglishName;

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

	public void setSkillChineseName(String skillChineseName) {
		this.skillChineseName = skillChineseName;
	}
	public String getSkillChineseName( ) {
		return this.skillChineseName;
	}

	public void setSkillEnglishName(String skillEnglishName) {
		this.skillEnglishName = skillEnglishName;
	}
	public String getSkillEnglishName( ) {
		return this.skillEnglishName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
