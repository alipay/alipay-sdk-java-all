package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-26 19:52:42
 */
public class InsuredInfo extends AlipayObject {

	private static final long serialVersionUID = 6147248985658894826L;

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

}
