package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业站点信息
 *
 * @author auto create
 * @since 1.0, 2026-04-27 09:57:34
 */
public class SiteInfoClasses extends AlipayObject {

	private static final long serialVersionUID = 7463261578115532899L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 核准日期
	 */
	@ApiField("approval_date")
	private String approvalDate;

	/**
	 * 成立日期
	 */
	@ApiField("build_date")
	private String buildDate;

	/**
	 * 经营期限自
	 */
	@ApiField("business_period_from")
	private String businessPeriodFrom;

	/**
	 * 经营期限至
	 */
	@ApiField("business_period_to")
	private String businessPeriodTo;

	/**
	 * 注销日期
	 */
	@ApiField("cancellation_date")
	private String cancellationDate;

	/**
	 * 首席代表
	 */
	@ApiField("chief_representative")
	private String chiefRepresentative;

	/**
	 * 电子邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 执行事务合伙人
	 */
	@ApiField("executing_partner")
	private String executingPartner;

	/**
	 * 执行合伙人
	 */
	@ApiField("executive_partner")
	private String executivePartner;

	/**
	 * 法人代表
	 */
	@ApiField("frdb")
	private String frdb;

	/**
	 * A级纳税人评价年度
	 */
	@ApiListField("grade_a_taxpayer_evaluation_year")
	@ApiField("string")
	private List<String> gradeATaxpayerEvaluationYear;

	/**
	 * 迁入地工商局
	 */
	@ApiField("incoming_gov_office")
	private String incomingGovOffice;

	/**
	 * 企业所属行业信息
	 */
	@ApiField("industry_model")
	private EpIndustryModelClasses industryModel;

	/**
	 * 投资人
	 */
	@ApiField("investors")
	private String investors;

	/**
	 * 法定代表人
	 */
	@ApiField("legal_representative")
	private String legalRepresentative;

	/**
	 * 法代或执行
	 */
	@ApiField("legal_representative_or_pe")
	private String legalRepresentativeOrPe;

	/**
	 * 最新一次更新的时间戳
	 */
	@ApiField("modified_time")
	private String modifiedTime;

	/**
	 * 企业曾用名
	 */
	@ApiField("old_name")
	private String oldName;

	/**
	 * 经营场所
	 */
	@ApiField("operating_address")
	private String operatingAddress;

	/**
	 * 经营范围
	 */
	@ApiField("operating_scope")
	private String operatingScope;

	/**
	 * 经营者
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 联系方式，电话或手机
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 负责人
	 */
	@ApiField("principal")
	private String principal;

	/**
	 * 省市
	 */
	@ApiField("province_or_city")
	private String provinceOrCity;

	/**
	 * 登记机关
	 */
	@ApiField("registe_organ")
	private String registeOrgan;

	/**
	 * 登记状态
	 */
	@ApiField("register_status")
	private String registerStatus;

	/**
	 * 企业注册号
	 */
	@ApiField("registr_id")
	private String registrId;

	/**
	 * 注册资本（万元）
	 */
	@ApiField("registration_capital")
	private String registrationCapital;

	/**
	 * 企业注册地信息
	 */
	@ApiField("registration_place")
	private ZmEpRegistrationPlaceInfoClasses registrationPlace;

	/**
	 * 执行事务合伙人委派代表
	 */
	@ApiField("representative_of_partner")
	private String representativeOfPartner;

	/**
	 * 吊销日期
	 */
	@ApiField("revocation_date")
	private String revocationDate;

	/**
	 * 企业规范化名称
	 */
	@ApiField("sanitized_name")
	private String sanitizedName;

	/**
	 * 派出企业名称
	 */
	@ApiField("sent_company_name")
	private String sentCompanyName;

	/**
	 * 沪深股市股票列表
	 */
	@ApiListField("shanghai_shenzhen_stock_list")
	@ApiField("ep_stock_info_classes")
	private List<EpStockInfoClasses> shanghaiShenzhenStockList;

	/**
	 * 企业简称
多个使用,隔开
	 */
	@ApiField("site_info_abbreviation")
	private String siteInfoAbbreviation;

	/**
	 * 经营地址
	 */
	@ApiField("site_info_business_location")
	private String siteInfoBusinessLocation;

	/**
	 * 企业实力证明文件
	 */
	@ApiListField("site_info_enterprise_cert_file_list")
	@ApiField("file_info_classes")
	private List<FileInfoClasses> siteInfoEnterpriseCertFileList;

	/**
	 * 站点信息id，由geo侧定义的唯一标识
	 */
	@ApiField("site_info_id")
	private String siteInfoId;

	/**
	 * 企业名称
	 */
	@ApiField("site_info_name")
	private String siteInfoName;

	/**
	 * 站点信息标题
	 */
	@ApiField("site_info_title")
	private String siteInfoTitle;

	/**
	 * 企业标准化名称
	 */
	@ApiField("standardized_name")
	private String standardizedName;

	/**
	 * 企业类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * （国统字〔2011〕86号）的企业登记注册类型
	 */
	@ApiField("type_code")
	private String typeCode;

	/**
	 * 企业注册号或统一社会信用代码，一般为18位
	 */
	@ApiField("tyshxydm")
	private String tyshxydm;

	/**
	 * 注册资本币种
	 */
	@ApiField("zczbbz")
	private String zczbbz;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getApprovalDate() {
		return this.approvalDate;
	}
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getBuildDate() {
		return this.buildDate;
	}
	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

	public String getBusinessPeriodFrom() {
		return this.businessPeriodFrom;
	}
	public void setBusinessPeriodFrom(String businessPeriodFrom) {
		this.businessPeriodFrom = businessPeriodFrom;
	}

	public String getBusinessPeriodTo() {
		return this.businessPeriodTo;
	}
	public void setBusinessPeriodTo(String businessPeriodTo) {
		this.businessPeriodTo = businessPeriodTo;
	}

	public String getCancellationDate() {
		return this.cancellationDate;
	}
	public void setCancellationDate(String cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public String getChiefRepresentative() {
		return this.chiefRepresentative;
	}
	public void setChiefRepresentative(String chiefRepresentative) {
		this.chiefRepresentative = chiefRepresentative;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getExecutingPartner() {
		return this.executingPartner;
	}
	public void setExecutingPartner(String executingPartner) {
		this.executingPartner = executingPartner;
	}

	public String getExecutivePartner() {
		return this.executivePartner;
	}
	public void setExecutivePartner(String executivePartner) {
		this.executivePartner = executivePartner;
	}

	public String getFrdb() {
		return this.frdb;
	}
	public void setFrdb(String frdb) {
		this.frdb = frdb;
	}

	public List<String> getGradeATaxpayerEvaluationYear() {
		return this.gradeATaxpayerEvaluationYear;
	}
	public void setGradeATaxpayerEvaluationYear(List<String> gradeATaxpayerEvaluationYear) {
		this.gradeATaxpayerEvaluationYear = gradeATaxpayerEvaluationYear;
	}

	public String getIncomingGovOffice() {
		return this.incomingGovOffice;
	}
	public void setIncomingGovOffice(String incomingGovOffice) {
		this.incomingGovOffice = incomingGovOffice;
	}

	public EpIndustryModelClasses getIndustryModel() {
		return this.industryModel;
	}
	public void setIndustryModel(EpIndustryModelClasses industryModel) {
		this.industryModel = industryModel;
	}

	public String getInvestors() {
		return this.investors;
	}
	public void setInvestors(String investors) {
		this.investors = investors;
	}

	public String getLegalRepresentative() {
		return this.legalRepresentative;
	}
	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getLegalRepresentativeOrPe() {
		return this.legalRepresentativeOrPe;
	}
	public void setLegalRepresentativeOrPe(String legalRepresentativeOrPe) {
		this.legalRepresentativeOrPe = legalRepresentativeOrPe;
	}

	public String getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOldName() {
		return this.oldName;
	}
	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

	public String getOperatingAddress() {
		return this.operatingAddress;
	}
	public void setOperatingAddress(String operatingAddress) {
		this.operatingAddress = operatingAddress;
	}

	public String getOperatingScope() {
		return this.operatingScope;
	}
	public void setOperatingScope(String operatingScope) {
		this.operatingScope = operatingScope;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getProvinceOrCity() {
		return this.provinceOrCity;
	}
	public void setProvinceOrCity(String provinceOrCity) {
		this.provinceOrCity = provinceOrCity;
	}

	public String getRegisteOrgan() {
		return this.registeOrgan;
	}
	public void setRegisteOrgan(String registeOrgan) {
		this.registeOrgan = registeOrgan;
	}

	public String getRegisterStatus() {
		return this.registerStatus;
	}
	public void setRegisterStatus(String registerStatus) {
		this.registerStatus = registerStatus;
	}

	public String getRegistrId() {
		return this.registrId;
	}
	public void setRegistrId(String registrId) {
		this.registrId = registrId;
	}

	public String getRegistrationCapital() {
		return this.registrationCapital;
	}
	public void setRegistrationCapital(String registrationCapital) {
		this.registrationCapital = registrationCapital;
	}

	public ZmEpRegistrationPlaceInfoClasses getRegistrationPlace() {
		return this.registrationPlace;
	}
	public void setRegistrationPlace(ZmEpRegistrationPlaceInfoClasses registrationPlace) {
		this.registrationPlace = registrationPlace;
	}

	public String getRepresentativeOfPartner() {
		return this.representativeOfPartner;
	}
	public void setRepresentativeOfPartner(String representativeOfPartner) {
		this.representativeOfPartner = representativeOfPartner;
	}

	public String getRevocationDate() {
		return this.revocationDate;
	}
	public void setRevocationDate(String revocationDate) {
		this.revocationDate = revocationDate;
	}

	public String getSanitizedName() {
		return this.sanitizedName;
	}
	public void setSanitizedName(String sanitizedName) {
		this.sanitizedName = sanitizedName;
	}

	public String getSentCompanyName() {
		return this.sentCompanyName;
	}
	public void setSentCompanyName(String sentCompanyName) {
		this.sentCompanyName = sentCompanyName;
	}

	public List<EpStockInfoClasses> getShanghaiShenzhenStockList() {
		return this.shanghaiShenzhenStockList;
	}
	public void setShanghaiShenzhenStockList(List<EpStockInfoClasses> shanghaiShenzhenStockList) {
		this.shanghaiShenzhenStockList = shanghaiShenzhenStockList;
	}

	public String getSiteInfoAbbreviation() {
		return this.siteInfoAbbreviation;
	}
	public void setSiteInfoAbbreviation(String siteInfoAbbreviation) {
		this.siteInfoAbbreviation = siteInfoAbbreviation;
	}

	public String getSiteInfoBusinessLocation() {
		return this.siteInfoBusinessLocation;
	}
	public void setSiteInfoBusinessLocation(String siteInfoBusinessLocation) {
		this.siteInfoBusinessLocation = siteInfoBusinessLocation;
	}

	public List<FileInfoClasses> getSiteInfoEnterpriseCertFileList() {
		return this.siteInfoEnterpriseCertFileList;
	}
	public void setSiteInfoEnterpriseCertFileList(List<FileInfoClasses> siteInfoEnterpriseCertFileList) {
		this.siteInfoEnterpriseCertFileList = siteInfoEnterpriseCertFileList;
	}

	public String getSiteInfoId() {
		return this.siteInfoId;
	}
	public void setSiteInfoId(String siteInfoId) {
		this.siteInfoId = siteInfoId;
	}

	public String getSiteInfoName() {
		return this.siteInfoName;
	}
	public void setSiteInfoName(String siteInfoName) {
		this.siteInfoName = siteInfoName;
	}

	public String getSiteInfoTitle() {
		return this.siteInfoTitle;
	}
	public void setSiteInfoTitle(String siteInfoTitle) {
		this.siteInfoTitle = siteInfoTitle;
	}

	public String getStandardizedName() {
		return this.standardizedName;
	}
	public void setStandardizedName(String standardizedName) {
		this.standardizedName = standardizedName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getTypeCode() {
		return this.typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTyshxydm() {
		return this.tyshxydm;
	}
	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}

	public String getZczbbz() {
		return this.zczbbz;
	}
	public void setZczbbz(String zczbbz) {
		this.zczbbz = zczbbz;
	}

}
