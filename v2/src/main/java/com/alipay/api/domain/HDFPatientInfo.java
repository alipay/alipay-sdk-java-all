package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 患者信息
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:37:41
 */
public class HDFPatientInfo extends AlipayObject {

	private static final long serialVersionUID = 3423741639974193924L;

	/**
	 * 生日
	 */
	@ApiField("birthday")
	private String birthday;

	/**
	 * 患者id
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 0  女、 1 男、2 未知
	 */
	@ApiField("sex")
	private Long sex;

	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Long getSex() {
		return this.sex;
	}
	public void setSex(Long sex) {
		this.sex = sex;
	}

}
