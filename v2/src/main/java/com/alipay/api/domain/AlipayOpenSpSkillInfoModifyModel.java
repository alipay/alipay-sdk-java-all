package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商代商户SKILL信息修改
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class AlipayOpenSpSkillInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1853243417935313191L;

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
	 * SKILL描述
	 */
	@ApiField("skill_desc")
	private String skillDesc;

	/**
	 * 只支持.zip 格式，大小不超过50MB。使用 alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("skill_file")
	private String skillFile;

	/**
	 * 支持 PNG、JPG、SVG 格式，大小 ≤ 1MB，建议 1:1，至少 128×128。使用 alipay.open.file.upload接口上传图片获取的file_id。
	 */
	@ApiField("skill_logo_pic")
	private String skillLogoPic;

	/**
	 * null
	 */
	@ApiListField("support_merchant_type_list")
	@ApiField("string")
	private List<String> supportMerchantTypeList;

	public String getAbilityCode() {
		return this.abilityCode;
	}
	public void setAbilityCode(String abilityCode) {
		this.abilityCode = abilityCode;
	}

	public String getSkillChineseName() {
		return this.skillChineseName;
	}
	public void setSkillChineseName(String skillChineseName) {
		this.skillChineseName = skillChineseName;
	}

	public String getSkillDesc() {
		return this.skillDesc;
	}
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}

	public String getSkillFile() {
		return this.skillFile;
	}
	public void setSkillFile(String skillFile) {
		this.skillFile = skillFile;
	}

	public String getSkillLogoPic() {
		return this.skillLogoPic;
	}
	public void setSkillLogoPic(String skillLogoPic) {
		this.skillLogoPic = skillLogoPic;
	}

	public List<String> getSupportMerchantTypeList() {
		return this.supportMerchantTypeList;
	}
	public void setSupportMerchantTypeList(List<String> supportMerchantTypeList) {
		this.supportMerchantTypeList = supportMerchantTypeList;
	}

}
