package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农户修改接口
 *
 * @author auto create
 * @since 1.0, 2026-06-16 16:50:38
 */
public class AlipayCommerceEcRecyclinginvoiceFarmerModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3716575527854244574L;

	/**
	 * 支付宝账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 支付宝账号类型
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 归属承包主身份证号
	 */
	@ApiField("belong_contractor_cert_no")
	private String belongContractorCertNo;

	/**
	 * 归属家庭主身份证
	 */
	@ApiField("belong_family_head_cert_no")
	private String belongFamilyHeadCertNo;

	/**
	 * 农户ID
	 */
	@ApiField("farmer_id")
	private String farmerId;

	/**
	 * 农户姓名
	 */
	@ApiField("farmer_name")
	private String farmerName;

	/**
	 * 是否承包主
	 */
	@ApiField("is_contractor")
	private String isContractor;

	/**
	 * 是否家庭主
	 */
	@ApiField("is_family_master")
	private String isFamilyMaster;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBelongContractorCertNo() {
		return this.belongContractorCertNo;
	}
	public void setBelongContractorCertNo(String belongContractorCertNo) {
		this.belongContractorCertNo = belongContractorCertNo;
	}

	public String getBelongFamilyHeadCertNo() {
		return this.belongFamilyHeadCertNo;
	}
	public void setBelongFamilyHeadCertNo(String belongFamilyHeadCertNo) {
		this.belongFamilyHeadCertNo = belongFamilyHeadCertNo;
	}

	public String getFarmerId() {
		return this.farmerId;
	}
	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}

	public String getFarmerName() {
		return this.farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public String getIsContractor() {
		return this.isContractor;
	}
	public void setIsContractor(String isContractor) {
		this.isContractor = isContractor;
	}

	public String getIsFamilyMaster() {
		return this.isFamilyMaster;
	}
	public void setIsFamilyMaster(String isFamilyMaster) {
		this.isFamilyMaster = isFamilyMaster;
	}

}
