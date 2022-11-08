package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户主体信息
 *
 * @author auto create
 * @since 1.0, 2022-09-01 19:25:30
 */
public class AuthIdentityInfo extends AlipayObject {

	private static final long serialVersionUID = 8547891637227764486L;

	/**
	 * 证件信息，主体类型为企业/个体户/政府机关/事业单位/社会组织时，必填
	 */
	@ApiField("certificate_info")
	private IndirectCertificateInfo certificateInfo;

	/**
	 * 主体类型为企业/个体户/政府机关/事业单位/社会组织时，必填；
证照类型：营业执照(BUSINESS_CERT)/登记证书(REGISTER_CERT)
主体为政府机关/事业单位/社会组织时，填登记证书；
主体类型为企业/个体户时，填营业执照；
	 */
	@ApiField("certificate_type")
	private String certificateType;

	/**
	 * 单位证明函照片（使用图片上传接口）主体类型为政府机关/事业单位时，单位证明函照片必填
	 */
	@ApiField("employer_letter_img")
	private String employerLetterImg;

	/**
	 * 金融机构信息，当主体为金融机构时，必填
	 */
	@ApiField("financial_org_info")
	private IndirectFinancialOrgInfo financialOrgInfo;

	/**
	 * 主体类型，枚举定义：企业(ENTERPRISE)、个体工商户(IND_BIZ)、事业单位(INST)、党政机关(GOV)、社会组织(ORG)、小微商户(MSE)
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 是否金融机构
	 */
	@ApiField("is_financial_org")
	private Boolean isFinancialOrg;

	/**
	 * 经营许可证列表，填写特殊行业的经营许可证信息，一个主体最多5个行业
	 */
	@ApiListField("qualification_info_list")
	@ApiField("indirect_qualification_info")
	private List<IndirectQualificationInfo> qualificationInfoList;

	/**
	 * 辅助证明材料,主体类型为小微商户时，辅助证明材料信息必填
	 */
	@ApiField("support_credentials")
	private IndirectSupportCredentials supportCredentials;

	public IndirectCertificateInfo getCertificateInfo() {
		return this.certificateInfo;
	}
	public void setCertificateInfo(IndirectCertificateInfo certificateInfo) {
		this.certificateInfo = certificateInfo;
	}

	public String getCertificateType() {
		return this.certificateType;
	}
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getEmployerLetterImg() {
		return this.employerLetterImg;
	}
	public void setEmployerLetterImg(String employerLetterImg) {
		this.employerLetterImg = employerLetterImg;
	}

	public IndirectFinancialOrgInfo getFinancialOrgInfo() {
		return this.financialOrgInfo;
	}
	public void setFinancialOrgInfo(IndirectFinancialOrgInfo financialOrgInfo) {
		this.financialOrgInfo = financialOrgInfo;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public Boolean getIsFinancialOrg() {
		return this.isFinancialOrg;
	}
	public void setIsFinancialOrg(Boolean isFinancialOrg) {
		this.isFinancialOrg = isFinancialOrg;
	}

	public List<IndirectQualificationInfo> getQualificationInfoList() {
		return this.qualificationInfoList;
	}
	public void setQualificationInfoList(List<IndirectQualificationInfo> qualificationInfoList) {
		this.qualificationInfoList = qualificationInfoList;
	}

	public IndirectSupportCredentials getSupportCredentials() {
		return this.supportCredentials;
	}
	public void setSupportCredentials(IndirectSupportCredentials supportCredentials) {
		this.supportCredentials = supportCredentials;
	}

}
