package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保局获取用户付款码接口
 *
 * @author auto create
 * @since 1.0, 2023-07-17 13:44:06
 */
public class AlipayCommerceMedicalPaymentCodeGetModel extends AlipayObject {

	private static final long serialVersionUID = 6343477677925921915L;

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
