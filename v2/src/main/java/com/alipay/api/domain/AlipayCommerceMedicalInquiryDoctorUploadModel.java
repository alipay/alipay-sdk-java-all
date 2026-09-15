package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 互联网医院医生基础数据同步
 *
 * @author auto create
 * @since 1.0, 2026-08-24 20:57:47
 */
public class AlipayCommerceMedicalInquiryDoctorUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3323694213519384721L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 数据版本号（毫秒级时间戳）
	 */
	@ApiField("data_version")
	private String dataVersion;

	/**
	 * 三方科室编码
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 医生问诊类别（图文问诊，电话问诊）
	 */
	@ApiField("doctor_category")
	private String doctorCategory;

	/**
	 * 医生执业资格证编码
	 */
	@ApiField("doctor_credential_id")
	private String doctorCredentialId;

	/**
	 * 医生介绍说明
	 */
	@ApiField("doctor_desc")
	private String doctorDesc;

	/**
	 * 三方医生编码
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 医生擅长领域
	 */
	@ApiField("doctor_proficiency")
	private String doctorProficiency;

	/**
	 * 医生状态(ONLINE/OFFLINE)
	 */
	@ApiField("doctor_status")
	private String doctorStatus;

	/**
	 * 医生职称
	 */
	@ApiField("doctor_title")
	private String doctorTitle;

	/**
	 * 医生性别
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 三方医院编码
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 医生身份证号
	 */
	@ApiField("id_card_number")
	private String idCardNumber;

	/**
	 * 医生证件类型
	 */
	@ApiField("id_card_type")
	private String idCardType;

	/**
	 * 医生头像 URL
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 服务商编码
	 */
	@ApiField("isv_code")
	private String isvCode;

	/**
	 * 来源平台 code
	 */
	@ApiField("platform_code")
	private String platformCode;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDataVersion() {
		return this.dataVersion;
	}
	public void setDataVersion(String dataVersion) {
		this.dataVersion = dataVersion;
	}

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDoctorCategory() {
		return this.doctorCategory;
	}
	public void setDoctorCategory(String doctorCategory) {
		this.doctorCategory = doctorCategory;
	}

	public String getDoctorCredentialId() {
		return this.doctorCredentialId;
	}
	public void setDoctorCredentialId(String doctorCredentialId) {
		this.doctorCredentialId = doctorCredentialId;
	}

	public String getDoctorDesc() {
		return this.doctorDesc;
	}
	public void setDoctorDesc(String doctorDesc) {
		this.doctorDesc = doctorDesc;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorProficiency() {
		return this.doctorProficiency;
	}
	public void setDoctorProficiency(String doctorProficiency) {
		this.doctorProficiency = doctorProficiency;
	}

	public String getDoctorStatus() {
		return this.doctorStatus;
	}
	public void setDoctorStatus(String doctorStatus) {
		this.doctorStatus = doctorStatus;
	}

	public String getDoctorTitle() {
		return this.doctorTitle;
	}
	public void setDoctorTitle(String doctorTitle) {
		this.doctorTitle = doctorTitle;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getIdCardNumber() {
		return this.idCardNumber;
	}
	public void setIdCardNumber(String idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	public String getIdCardType() {
		return this.idCardType;
	}
	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getIsvCode() {
		return this.isvCode;
	}
	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

}
