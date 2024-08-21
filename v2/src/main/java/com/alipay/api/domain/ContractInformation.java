package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同基本信息V2版本 增加2个参数 signOrder & signRemark
 *
 * @author auto create
 * @since 1.0, 2023-10-08 13:48:15
 */
public class ContractInformation extends AlipayObject {

	private static final long serialVersionUID = 8346869817691227419L;

	/**
	 * 合同id
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 合同周期
	 */
	@ApiField("contract_period")
	private String contractPeriod;

	/**
	 * 合同状态
	 */
	@ApiField("contract_status")
	private String contractStatus;

	/**
	 * 合同名称
	 */
	@ApiField("contract_title")
	private String contractTitle;

	/**
	 * 对方公司名称
	 */
	@ApiField("other_company")
	private String otherCompany;

	/**
	 * 对方公司所在国家或地区
	 */
	@ApiField("other_company_location")
	private String otherCompanyLocation;

	/**
	 * 我方公司code
	 */
	@ApiField("our_company")
	private String ourCompany;

	/**
	 * 我方公司名称
	 */
	@ApiField("our_company_name")
	private String ourCompanyName;

	/**
	 * 机房信息
	 */
	@ApiField("region")
	private String region;

	/**
	 * 签署顺序
	 */
	@ApiField("sign_order")
	private String signOrder;

	/**
	 * 签署备注(最大100字)
	 */
	@ApiField("sign_remark")
	private String signRemark;

	/**
	 * 合同所属租户
	 */
	@ApiField("tenant")
	private String tenant;

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getContractPeriod() {
		return this.contractPeriod;
	}
	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

	public String getContractStatus() {
		return this.contractStatus;
	}
	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getContractTitle() {
		return this.contractTitle;
	}
	public void setContractTitle(String contractTitle) {
		this.contractTitle = contractTitle;
	}

	public String getOtherCompany() {
		return this.otherCompany;
	}
	public void setOtherCompany(String otherCompany) {
		this.otherCompany = otherCompany;
	}

	public String getOtherCompanyLocation() {
		return this.otherCompanyLocation;
	}
	public void setOtherCompanyLocation(String otherCompanyLocation) {
		this.otherCompanyLocation = otherCompanyLocation;
	}

	public String getOurCompany() {
		return this.ourCompany;
	}
	public void setOurCompany(String ourCompany) {
		this.ourCompany = ourCompany;
	}

	public String getOurCompanyName() {
		return this.ourCompanyName;
	}
	public void setOurCompanyName(String ourCompanyName) {
		this.ourCompanyName = ourCompanyName;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getSignOrder() {
		return this.signOrder;
	}
	public void setSignOrder(String signOrder) {
		this.signOrder = signOrder;
	}

	public String getSignRemark() {
		return this.signRemark;
	}
	public void setSignRemark(String signRemark) {
		this.signRemark = signRemark;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
