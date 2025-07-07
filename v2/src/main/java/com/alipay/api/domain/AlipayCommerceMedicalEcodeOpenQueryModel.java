package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户开通一码付接口
 *
 * @author auto create
 * @since 1.0, 2024-09-11 17:00:12
 */
public class AlipayCommerceMedicalEcodeOpenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4656464412542876732L;

	/**
	 * 用户医保码值
	 */
	@ApiField("medical_code")
	private String medicalCode;

	/**
	 * 定点医疗机构编码
	 */
	@ApiField("org_no")
	private String orgNo;

	public String getMedicalCode() {
		return this.medicalCode;
	}
	public void setMedicalCode(String medicalCode) {
		this.medicalCode = medicalCode;
	}

	public String getOrgNo() {
		return this.orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

}
