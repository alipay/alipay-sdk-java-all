package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业分支机构信息
 *
 * @author auto create
 * @since 1.0, 2021-09-03 11:04:56
 */
public class EpBranchInfo extends AlipayObject {

	private static final long serialVersionUID = 1525565563796816684L;

	/**
	 * 分支机构社会统一信用代码
	 */
	@ApiField("branch_cert_no")
	private String branchCertNo;

	/**
	 * 企业分支机构名称
	 */
	@ApiField("branch_name")
	private String branchName;

	/**
	 * 颁发机构
	 */
	@ApiField("registry_agency")
	private String registryAgency;

	public String getBranchCertNo() {
		return this.branchCertNo;
	}
	public void setBranchCertNo(String branchCertNo) {
		this.branchCertNo = branchCertNo;
	}

	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getRegistryAgency() {
		return this.registryAgency;
	}
	public void setRegistryAgency(String registryAgency) {
		this.registryAgency = registryAgency;
	}

}
