package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 素问医生资质核验请求
 *
 * @author auto create
 * @since 1.0, 2025-07-08 10:54:28
 */
public class RcDoctorLicenseRequest extends AlipayObject {

	private static final long serialVersionUID = 6429196334528892226L;

	/**
	 * 医生唯一id，关联到传入方医生信息
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生姓名，审核项，必传
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 性别，男/女/未知
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 医生职称
	 */
	@ApiField("job_title")
	private String jobTitle;

	/**
	 * 医生资格证书编码，选传，传入时以此为依据进行审核
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 执业科室（专业方向）
	 */
	@ApiField("main_department")
	private String mainDepartment;

	/**
	 * 主执业医院名称
	 */
	@ApiField("main_hospital")
	private String mainHospital;

	/**
	 * 执业医院所在省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 次执业机构列表
	 */
	@ApiListField("second_hos_list")
	@ApiField("string")
	private List<String> secondHosList;

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

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getMainDepartment() {
		return this.mainDepartment;
	}
	public void setMainDepartment(String mainDepartment) {
		this.mainDepartment = mainDepartment;
	}

	public String getMainHospital() {
		return this.mainHospital;
	}
	public void setMainHospital(String mainHospital) {
		this.mainHospital = mainHospital;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public List<String> getSecondHosList() {
		return this.secondHosList;
	}
	public void setSecondHosList(List<String> secondHosList) {
		this.secondHosList = secondHosList;
	}

}
