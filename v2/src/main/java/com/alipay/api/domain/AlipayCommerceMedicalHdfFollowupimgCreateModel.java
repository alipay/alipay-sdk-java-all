package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 随访二维码创建
 *
 * @author auto create
 * @since 1.0, 2026-06-17 19:12:56
 */
public class AlipayCommerceMedicalHdfFollowupimgCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3277696139874515645L;

	/**
	 * 医生科室
	 */
	@ApiField("department")
	private String department;

	/**
	 * 医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生头像链接
	 */
	@ApiField("doctor_image")
	private String doctorImage;

	/**
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 医生职称
	 */
	@ApiField("doctor_title")
	private String doctorTitle;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 二维码类型
	 */
	@ApiField("qr_type")
	private Long qrType;

	/**
	 * 二维码跳转链接
	 */
	@ApiField("qr_url")
	private String qrUrl;

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorImage() {
		return this.doctorImage;
	}
	public void setDoctorImage(String doctorImage) {
		this.doctorImage = doctorImage;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorTitle() {
		return this.doctorTitle;
	}
	public void setDoctorTitle(String doctorTitle) {
		this.doctorTitle = doctorTitle;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Long getQrType() {
		return this.qrType;
	}
	public void setQrType(Long qrType) {
		this.qrType = qrType;
	}

	public String getQrUrl() {
		return this.qrUrl;
	}
	public void setQrUrl(String qrUrl) {
		this.qrUrl = qrUrl;
	}

}
