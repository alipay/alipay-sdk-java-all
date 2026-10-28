package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务包物料海报
 *
 * @author auto create
 * @since 1.0, 2026-10-21 13:57:58
 */
public class AlipayCommerceMedicalMedinqpPackagemateriaCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6684614925993986248L;

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
	 * 医生教学职称
	 */
	@ApiField("education_title")
	private String educationTitle;

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
	 * 服务包id
	 */
	@ApiField("service_package_id")
	private String servicePackageId;

	/**
	 * 服务包类型：1=好大夫服务包，2=履约平台服务包
	 */
	@ApiField("service_package_type")
	private Long servicePackageType;

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

	public String getEducationTitle() {
		return this.educationTitle;
	}
	public void setEducationTitle(String educationTitle) {
		this.educationTitle = educationTitle;
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

	public String getServicePackageId() {
		return this.servicePackageId;
	}
	public void setServicePackageId(String servicePackageId) {
		this.servicePackageId = servicePackageId;
	}

	public Long getServicePackageType() {
		return this.servicePackageType;
	}
	public void setServicePackageType(Long servicePackageType) {
		this.servicePackageType = servicePackageType;
	}

}
