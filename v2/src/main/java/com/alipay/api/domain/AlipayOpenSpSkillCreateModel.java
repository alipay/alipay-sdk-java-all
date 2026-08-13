package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商代商户创建SKILL
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class AlipayOpenSpSkillCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5364421446811963225L;

	/**
	 * 商户支付宝账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 营业执照号
	 */
	@ApiField("business_license_code")
	private String businessLicenseCode;

	/**
	 * 营业执照名称
	 */
	@ApiField("business_license_name")
	private String businessLicenseName;

	/**
	 * 商家法人名称
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

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
	 * SKILL英文名称
	 */
	@ApiField("skill_english_name")
	private String skillEnglishName;

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

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getBusinessLicenseCode() {
		return this.businessLicenseCode;
	}
	public void setBusinessLicenseCode(String businessLicenseCode) {
		this.businessLicenseCode = businessLicenseCode;
	}

	public String getBusinessLicenseName() {
		return this.businessLicenseName;
	}
	public void setBusinessLicenseName(String businessLicenseName) {
		this.businessLicenseName = businessLicenseName;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
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

	public String getSkillEnglishName() {
		return this.skillEnglishName;
	}
	public void setSkillEnglishName(String skillEnglishName) {
		this.skillEnglishName = skillEnglishName;
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
