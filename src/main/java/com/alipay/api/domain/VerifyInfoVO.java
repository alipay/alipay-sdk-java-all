package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 补全信息VO
 *
 * @author auto create
 * @since 1.0, 2019-01-22 14:43:46
 */
public class VerifyInfoVO extends AlipayObject {

	private static final long serialVersionUID = 5678943982469966645L;

	/**
	 * 公司地址
	 */
	@ApiField("business_address")
	private String businessAddress;

	/**
	 * 公司名称
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 曾用名(目前为null)
	 */
	@ApiField("ever_org_name")
	private String everOrgName;

	/**
	 * 国民经济行业
	 */
	@ApiField("industry_name")
	private String industryName;

	/**
	 * 法人信息
	 */
	@ApiField("legal_representative")
	private LegalRepresentativeVO legalRepresentative;

	/**
	 * 当地税号
	 */
	@ApiField("local_tax_no")
	private String localTaxNo;

	/**
	 * 注销日期
	 */
	@ApiField("logoff_date")
	private String logoffDate;

	/**
	 * 主要管理人员信息
	 */
	@ApiListField("managers")
	@ApiField("manager_v_o")
	private List<ManagerVO> managers;

	/**
	 * 一般经营项目
	 */
	@ApiField("norm_opr_project")
	private String normOprProject;

	/**
	 * 经营状态
	 */
	@ApiField("opr_status")
	private String oprStatus;

	/**
	 * 经营期限结束时间
	 */
	@ApiField("oprt_end_date")
	private String oprtEndDate;

	/**
	 * 经营期限起始时间
	 */
	@ApiField("oprt_start_date")
	private String oprtStartDate;

	/**
	 * 实缴资金（万）
	 */
	@ApiField("org_actual_cptl")
	private String orgActualCptl;

	/**
	 * 注册地址
	 */
	@ApiField("org_reg_addr")
	private String orgRegAddr;

	/**
	 * 注册资金（万）
	 */
	@ApiField("org_reg_cptl")
	private String orgRegCptl;

	/**
	 * 注册币种
	 */
	@ApiField("org_reg_cptl_curcy")
	private String orgRegCptlCurcy;

	/**
	 * 经营范围
	 */
	@ApiField("org_reg_opr_scope")
	private String orgRegOprScope;

	/**
	 * 企业类型
	 */
	@ApiField("org_type")
	private String orgType;

	/**
	 * 网站列表
	 */
	@ApiField("org_website")
	private String orgWebsite;

	/**
	 * 许可经营项目
	 */
	@ApiField("permit_opr_project")
	private String permitOprProject;

	/**
	 * 注册国家
	 */
	@ApiField("registration_country")
	private String registrationCountry;

	/**
	 * 注册日期
	 */
	@ApiField("registration_date")
	private String registrationDate;

	/**
	 * 工商注册号
	 */
	@ApiField("registration_no")
	private String registrationNo;

	/**
	 * 吊销日期
	 */
	@ApiField("revoke_date")
	private String revokeDate;

	/**
	 * 股东信息
	 */
	@ApiListField("stock_holders")
	@ApiField("stock_holder_v_o")
	private List<StockHolderVO> stockHolders;

	/**
	 * 个人UBO信息
	 */
	@ApiListField("ubos")
	@ApiField("ubo_v_o")
	private List<UboVO> ubos;

	/**
	 * 标识码
	 */
	@ApiField("uc_code")
	private String ucCode;

	public String getBusinessAddress() {
		return this.businessAddress;
	}
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEverOrgName() {
		return this.everOrgName;
	}
	public void setEverOrgName(String everOrgName) {
		this.everOrgName = everOrgName;
	}

	public String getIndustryName() {
		return this.industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public LegalRepresentativeVO getLegalRepresentative() {
		return this.legalRepresentative;
	}
	public void setLegalRepresentative(LegalRepresentativeVO legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getLocalTaxNo() {
		return this.localTaxNo;
	}
	public void setLocalTaxNo(String localTaxNo) {
		this.localTaxNo = localTaxNo;
	}

	public String getLogoffDate() {
		return this.logoffDate;
	}
	public void setLogoffDate(String logoffDate) {
		this.logoffDate = logoffDate;
	}

	public List<ManagerVO> getManagers() {
		return this.managers;
	}
	public void setManagers(List<ManagerVO> managers) {
		this.managers = managers;
	}

	public String getNormOprProject() {
		return this.normOprProject;
	}
	public void setNormOprProject(String normOprProject) {
		this.normOprProject = normOprProject;
	}

	public String getOprStatus() {
		return this.oprStatus;
	}
	public void setOprStatus(String oprStatus) {
		this.oprStatus = oprStatus;
	}

	public String getOprtEndDate() {
		return this.oprtEndDate;
	}
	public void setOprtEndDate(String oprtEndDate) {
		this.oprtEndDate = oprtEndDate;
	}

	public String getOprtStartDate() {
		return this.oprtStartDate;
	}
	public void setOprtStartDate(String oprtStartDate) {
		this.oprtStartDate = oprtStartDate;
	}

	public String getOrgActualCptl() {
		return this.orgActualCptl;
	}
	public void setOrgActualCptl(String orgActualCptl) {
		this.orgActualCptl = orgActualCptl;
	}

	public String getOrgRegAddr() {
		return this.orgRegAddr;
	}
	public void setOrgRegAddr(String orgRegAddr) {
		this.orgRegAddr = orgRegAddr;
	}

	public String getOrgRegCptl() {
		return this.orgRegCptl;
	}
	public void setOrgRegCptl(String orgRegCptl) {
		this.orgRegCptl = orgRegCptl;
	}

	public String getOrgRegCptlCurcy() {
		return this.orgRegCptlCurcy;
	}
	public void setOrgRegCptlCurcy(String orgRegCptlCurcy) {
		this.orgRegCptlCurcy = orgRegCptlCurcy;
	}

	public String getOrgRegOprScope() {
		return this.orgRegOprScope;
	}
	public void setOrgRegOprScope(String orgRegOprScope) {
		this.orgRegOprScope = orgRegOprScope;
	}

	public String getOrgType() {
		return this.orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getOrgWebsite() {
		return this.orgWebsite;
	}
	public void setOrgWebsite(String orgWebsite) {
		this.orgWebsite = orgWebsite;
	}

	public String getPermitOprProject() {
		return this.permitOprProject;
	}
	public void setPermitOprProject(String permitOprProject) {
		this.permitOprProject = permitOprProject;
	}

	public String getRegistrationCountry() {
		return this.registrationCountry;
	}
	public void setRegistrationCountry(String registrationCountry) {
		this.registrationCountry = registrationCountry;
	}

	public String getRegistrationDate() {
		return this.registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getRegistrationNo() {
		return this.registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getRevokeDate() {
		return this.revokeDate;
	}
	public void setRevokeDate(String revokeDate) {
		this.revokeDate = revokeDate;
	}

	public List<StockHolderVO> getStockHolders() {
		return this.stockHolders;
	}
	public void setStockHolders(List<StockHolderVO> stockHolders) {
		this.stockHolders = stockHolders;
	}

	public List<UboVO> getUbos() {
		return this.ubos;
	}
	public void setUbos(List<UboVO> ubos) {
		this.ubos = ubos;
	}

	public String getUcCode() {
		return this.ucCode;
	}
	public void setUcCode(String ucCode) {
		this.ucCode = ucCode;
	}

}
