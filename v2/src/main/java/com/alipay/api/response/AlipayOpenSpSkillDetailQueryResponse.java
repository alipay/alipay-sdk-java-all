package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.skill.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class AlipayOpenSpSkillDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6564825385793633933L;

	/** 
	 * SKILL能力编码code
	 */
	@ApiField("ability_code")
	private String abilityCode;

	/** 
	 * SKILL能力状态
	 */
	@ApiField("ability_status")
	private String abilityStatus;

	/** 
	 * SKILL能力版本
	 */
	@ApiField("ability_version")
	private String abilityVersion;

	/** 
	 * SKILL中文名称
	 */
	@ApiField("skill_chinese_name")
	private String skillChineseName;

	/** 
	 * SKILL描述
	 */
	@ApiField("skill_desc")
	private String skillDesc;

	/** 
	 * SKILL文件包下载地址
	 */
	@ApiField("skill_download_url")
	private String skillDownloadUrl;

	/** 
	 * SKILL英文名称
	 */
	@ApiField("skill_english_name")
	private String skillEnglishName;

	/** 
	 * SKILL logo URL
	 */
	@ApiField("skill_logo_url")
	private String skillLogoUrl;

	/** 
	 * null
	 */
	@ApiListField("support_account_type")
	@ApiField("string")
	private List<String> supportAccountType;

	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}
	public String getAbilityCode( ) {
		return this.abilityCode;
	}

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

	public void setSkillChineseName(String skillChineseName) {
		this.skillChineseName = skillChineseName;
	}
	public String getSkillChineseName( ) {
		return this.skillChineseName;
	}

	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}
	public String getSkillDesc( ) {
		return this.skillDesc;
	}

	public void setSkillDownloadUrl(String skillDownloadUrl) {
		this.skillDownloadUrl = skillDownloadUrl;
	}
	public String getSkillDownloadUrl( ) {
		return this.skillDownloadUrl;
	}

	public void setSkillEnglishName(String skillEnglishName) {
		this.skillEnglishName = skillEnglishName;
	}
	public String getSkillEnglishName( ) {
		return this.skillEnglishName;
	}

	public void setSkillLogoUrl(String skillLogoUrl) {
		this.skillLogoUrl = skillLogoUrl;
	}
	public String getSkillLogoUrl( ) {
		return this.skillLogoUrl;
	}

	public void setSupportAccountType(List<String> supportAccountType) {
		this.supportAccountType = supportAccountType;
	}
	public List<String> getSupportAccountType( ) {
		return this.supportAccountType;
	}

}
