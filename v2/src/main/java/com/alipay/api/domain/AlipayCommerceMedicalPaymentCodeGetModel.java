package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医保局获取用户付款码接口
 *
 * @author auto create
 * @since 1.0, 2025-01-13 20:50:53
 */
public class AlipayCommerceMedicalPaymentCodeGetModel extends AlipayObject {

	private static final long serialVersionUID = 3151656475912796565L;

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

	/**
	 * 通过该参数可以重复获取付款码
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

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

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
