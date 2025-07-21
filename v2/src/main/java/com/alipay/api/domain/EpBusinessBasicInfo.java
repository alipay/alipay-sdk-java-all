package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业工商基本信息
 *
 * @author auto create
 * @since 1.0, 2025-03-07 15:17:20
 */
public class EpBusinessBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 6138561172328776265L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * A级纳税人评价年度
	 */
	@ApiListField("ajnsrpjnd")
	@ApiField("string")
	private List<String> ajnsrpjnd;

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
	 * 法人代表
	 */
	@ApiField("frdb")
	private String frdb;

	/**
	 * 企业所属行业信息
	 */
	@ApiField("industry_model")
	private EpIndustryModel industryModel;

	/**
	 * 投资人
	 */
	@ApiField("investors")
	private String investors;

	/**
	 * 经营场所
	 */
	@ApiField("jycs")
	private String jycs;

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
	 * 经营范围
	 */
	@ApiField("manager_scope")
	private String managerScope;

	/**
	 * 企业名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 企业曾用名
	 */
	@ApiField("old_name")
	private String oldName;

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
	 * 迁入地工商局
	 */
	@ApiField("qrdgsj")
	private String qrdgsj;

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
	 * 企业标准化名称
	 */
	@ApiField("standardized_name")
	private String standardizedName;

	/**
	 * 企业股票列表
	 */
	@ApiListField("stock")
	@ApiField("ep_stock_info")
	private List<EpStockInfo> stock;

	/**
	 * 企业类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 企业类型代码
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

	/**
	 * 执行合伙人
	 */
	@ApiField("zxhhr")
	private String zxhhr;

	/**
	 * 执行事务合伙人
	 */
	@ApiField("zxswhhr")
	private String zxswhhr;

	/**
	 * 执行事务合伙人委派代表
	 */
	@ApiField("zxswhhrwpdb")
	private String zxswhhrwpdb;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getAjnsrpjnd() {
		return this.ajnsrpjnd;
	}
	public void setAjnsrpjnd(List<String> ajnsrpjnd) {
		this.ajnsrpjnd = ajnsrpjnd;
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

	public String getFrdb() {
		return this.frdb;
	}
	public void setFrdb(String frdb) {
		this.frdb = frdb;
	}

	public EpIndustryModel getIndustryModel() {
		return this.industryModel;
	}
	public void setIndustryModel(EpIndustryModel industryModel) {
		this.industryModel = industryModel;
	}

	public String getInvestors() {
		return this.investors;
	}
	public void setInvestors(String investors) {
		this.investors = investors;
	}

	public String getJycs() {
		return this.jycs;
	}
	public void setJycs(String jycs) {
		this.jycs = jycs;
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

	public String getManagerScope() {
		return this.managerScope;
	}
	public void setManagerScope(String managerScope) {
		this.managerScope = managerScope;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOldName() {
		return this.oldName;
	}
	public void setOldName(String oldName) {
		this.oldName = oldName;
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

	public String getQrdgsj() {
		return this.qrdgsj;
	}
	public void setQrdgsj(String qrdgsj) {
		this.qrdgsj = qrdgsj;
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

	public String getStandardizedName() {
		return this.standardizedName;
	}
	public void setStandardizedName(String standardizedName) {
		this.standardizedName = standardizedName;
	}

	public List<EpStockInfo> getStock() {
		return this.stock;
	}
	public void setStock(List<EpStockInfo> stock) {
		this.stock = stock;
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

	public String getZxhhr() {
		return this.zxhhr;
	}
	public void setZxhhr(String zxhhr) {
		this.zxhhr = zxhhr;
	}

	public String getZxswhhr() {
		return this.zxswhhr;
	}
	public void setZxswhhr(String zxswhhr) {
		this.zxswhhr = zxswhhr;
	}

	public String getZxswhhrwpdb() {
		return this.zxswhhrwpdb;
	}
	public void setZxswhhrwpdb(String zxswhhrwpdb) {
		this.zxswhhrwpdb = zxswhhrwpdb;
	}

}
