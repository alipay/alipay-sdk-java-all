package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-22 14:02:50
 */
public class InsuredInfo extends AlipayObject {

	private static final long serialVersionUID = 7259584787853555767L;

	/**
	 * 被保人扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 被保人出生日期 yyyy-MM-dd
	 */
	@ApiField("insured_birthday")
	private String insuredBirthday;

	/**
	 * 被保人证件号
	 */
	@ApiField("insured_cert_no")
	private String insuredCertNo;

	/**
	 * 被保人证件类型
	 */
	@ApiField("insured_cert_type")
	private String insuredCertType;

	/**
	 * 被保人姓名
	 */
	@ApiField("insured_name")
	private String insuredName;

	/**
	 * 状态枚举
有效-effective
失效-ineffective
	 */
	@ApiField("insured_status")
	private String insuredStatus;

	/**
	 * null
	 */
	@ApiListField("policy_info_list")
	@ApiField("policy_mode_info")
	private List<PolicyModeInfo> policyInfoList;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getInsuredBirthday() {
		return this.insuredBirthday;
	}
	public void setInsuredBirthday(String insuredBirthday) {
		this.insuredBirthday = insuredBirthday;
	}

	public String getInsuredCertNo() {
		return this.insuredCertNo;
	}
	public void setInsuredCertNo(String insuredCertNo) {
		this.insuredCertNo = insuredCertNo;
	}

	public String getInsuredCertType() {
		return this.insuredCertType;
	}
	public void setInsuredCertType(String insuredCertType) {
		this.insuredCertType = insuredCertType;
	}

	public String getInsuredName() {
		return this.insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getInsuredStatus() {
		return this.insuredStatus;
	}
	public void setInsuredStatus(String insuredStatus) {
		this.insuredStatus = insuredStatus;
	}

	public List<PolicyModeInfo> getPolicyInfoList() {
		return this.policyInfoList;
	}
	public void setPolicyInfoList(List<PolicyModeInfo> policyInfoList) {
		this.policyInfoList = policyInfoList;
	}

}
