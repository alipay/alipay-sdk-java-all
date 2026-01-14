package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益入库
 *
 * @author auto create
 * @since 1.0, 2025-11-20 21:22:42
 */
public class AlipayOfflineProviderNpassporterBenefitCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7294671515298997753L;

	/**
	 * null
	 */
	@ApiListField("benefits_list")
	@ApiField("string")
	private List<String> benefitsList;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件号码
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 用户手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 活动最小单元ID
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 方案类型
	 */
	@ApiField("solution_type")
	private String solutionType;

	public List<String> getBenefitsList() {
		return this.benefitsList;
	}
	public void setBenefitsList(List<String> benefitsList) {
		this.benefitsList = benefitsList;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getSolutionType() {
		return this.solutionType;
	}
	public void setSolutionType(String solutionType) {
		this.solutionType = solutionType;
	}

}
