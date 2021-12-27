package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EpBranchInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-17 16:17:52
 */
public class ZhimaCreditEpDossierInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7731839586938148935L;

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
	 * 经营范围
	 */
	@ApiField("business_scope")
	private String businessScope;

	/** 
	 * 负责人姓名
	 */
	@ApiField("charge_person_name")
	private String chargePersonName;

	/** 
	 * 负责人类型，例如：法定代表人、法人代表、执行合伙人等
	 */
	@ApiField("charge_person_type")
	private String chargePersonType;

	/** 
	 * 企业从业人数
	 */
	@ApiField("employee_account")
	private String employeeAccount;

	/** 
	 * 企业分支机构列表信息
	 */
	@ApiListField("ep_branch_list")
	@ApiField("ep_branch_info")
	private List<EpBranchInfo> epBranchList;

	/** 
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/** 
	 * 企业全称
	 */
	@ApiField("ep_name")
	private String epName;

	/** 
	 * 经营状态，如存续、在业、吊销、注销、迁入、迁出等
	 */
	@ApiField("ep_status")
	private String epStatus;

	/** 
	 * 企业类型
	 */
	@ApiField("ep_type")
	private String epType;

	/** 
	 * 企业类别范围: ENTERPRISE(企业)， INDIVIDUAL（个体工商户), ORGANIZATION(组织机构)
	 */
	@ApiField("ep_type_scope")
	private String epTypeScope;

	/** 
	 * 成立时间
	 */
	@ApiField("established_time")
	private String establishedTime;

	/** 
	 * 所属行业
	 */
	@ApiField("industry")
	private String industry;

	/** 
	 * 所在地
	 */
	@ApiField("location")
	private String location;

	/** 
	 * 注册地址
	 */
	@ApiField("registered_address")
	private String registeredAddress;

	/** 
	 * 注册资本
	 */
	@ApiField("registered_capital")
	private String registeredCapital;

	/** 
	 * 登记机关
	 */
	@ApiField("registered_org")
	private String registeredOrg;

	/** 
	 * 公开社保缴纳员工数
	 */
	@ApiField("social_security_account")
	private String socialSecurityAccount;

	public void setBusinessPeriodFrom(String businessPeriodFrom) {
		this.businessPeriodFrom = businessPeriodFrom;
	}
	public String getBusinessPeriodFrom( ) {
		return this.businessPeriodFrom;
	}

	public void setBusinessPeriodTo(String businessPeriodTo) {
		this.businessPeriodTo = businessPeriodTo;
	}
	public String getBusinessPeriodTo( ) {
		return this.businessPeriodTo;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	public String getBusinessScope( ) {
		return this.businessScope;
	}

	public void setChargePersonName(String chargePersonName) {
		this.chargePersonName = chargePersonName;
	}
	public String getChargePersonName( ) {
		return this.chargePersonName;
	}

	public void setChargePersonType(String chargePersonType) {
		this.chargePersonType = chargePersonType;
	}
	public String getChargePersonType( ) {
		return this.chargePersonType;
	}

	public void setEmployeeAccount(String employeeAccount) {
		this.employeeAccount = employeeAccount;
	}
	public String getEmployeeAccount( ) {
		return this.employeeAccount;
	}

	public void setEpBranchList(List<EpBranchInfo> epBranchList) {
		this.epBranchList = epBranchList;
	}
	public List<EpBranchInfo> getEpBranchList( ) {
		return this.epBranchList;
	}

	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}
	public String getEpCertNo( ) {
		return this.epCertNo;
	}

	public void setEpName(String epName) {
		this.epName = epName;
	}
	public String getEpName( ) {
		return this.epName;
	}

	public void setEpStatus(String epStatus) {
		this.epStatus = epStatus;
	}
	public String getEpStatus( ) {
		return this.epStatus;
	}

	public void setEpType(String epType) {
		this.epType = epType;
	}
	public String getEpType( ) {
		return this.epType;
	}

	public void setEpTypeScope(String epTypeScope) {
		this.epTypeScope = epTypeScope;
	}
	public String getEpTypeScope( ) {
		return this.epTypeScope;
	}

	public void setEstablishedTime(String establishedTime) {
		this.establishedTime = establishedTime;
	}
	public String getEstablishedTime( ) {
		return this.establishedTime;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getIndustry( ) {
		return this.industry;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation( ) {
		return this.location;
	}

	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}
	public String getRegisteredAddress( ) {
		return this.registeredAddress;
	}

	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital = registeredCapital;
	}
	public String getRegisteredCapital( ) {
		return this.registeredCapital;
	}

	public void setRegisteredOrg(String registeredOrg) {
		this.registeredOrg = registeredOrg;
	}
	public String getRegisteredOrg( ) {
		return this.registeredOrg;
	}

	public void setSocialSecurityAccount(String socialSecurityAccount) {
		this.socialSecurityAccount = socialSecurityAccount;
	}
	public String getSocialSecurityAccount( ) {
		return this.socialSecurityAccount;
	}

}
