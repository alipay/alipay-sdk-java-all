package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询服务包订单患者信息
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:07
 */
public class ServicepackagePatientInfo extends AlipayObject {

	private static final long serialVersionUID = 4763517342635164538L;

	/**
	 * 年龄
	 */
	@ApiField("patient_age")
	private String patientAge;

	/**
	 * 患者疾病
	 */
	@ApiField("patient_disease")
	private String patientDisease;

	/**
	 * 性别
	 */
	@ApiField("patient_gender")
	private String patientGender;

	/**
	 * 患者ID
	 */
	@ApiField("patient_id")
	private String patientId;

	/**
	 * 患者姓名
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 病例图片
	 */
	@ApiListField("patient_pic")
	@ApiField("string")
	private List<String> patientPic;

	public String getPatientAge() {
		return this.patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientDisease() {
		return this.patientDisease;
	}
	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}

	public String getPatientGender() {
		return this.patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
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

	public List<String> getPatientPic() {
		return this.patientPic;
	}
	public void setPatientPic(List<String> patientPic) {
		this.patientPic = patientPic;
	}

}
