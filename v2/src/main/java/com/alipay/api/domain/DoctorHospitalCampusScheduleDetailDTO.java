package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 院区排班列表
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:04:13
 */
public class DoctorHospitalCampusScheduleDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 2812233338367445174L;

	/**
	 * 科室排班信息
	 */
	@ApiListField("department_schedule_list")
	@ApiField("doctor_department_schedule_detail_d_t_o")
	private List<DoctorDepartmentScheduleDetailDTO> departmentScheduleList;

	/**
	 * 距离，单位: m
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 医院id
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 院区简称
	 */
	@ApiField("sub_hospital_shore_name")
	private String subHospitalShoreName;

	/**
	 * 灵知院区医院编码
	 */
	@ApiField("sub_hospital_uniq_code")
	private String subHospitalUniqCode;

	public List<DoctorDepartmentScheduleDetailDTO> getDepartmentScheduleList() {
		return this.departmentScheduleList;
	}
	public void setDepartmentScheduleList(List<DoctorDepartmentScheduleDetailDTO> departmentScheduleList) {
		this.departmentScheduleList = departmentScheduleList;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getSubHospitalShoreName() {
		return this.subHospitalShoreName;
	}
	public void setSubHospitalShoreName(String subHospitalShoreName) {
		this.subHospitalShoreName = subHospitalShoreName;
	}

	public String getSubHospitalUniqCode() {
		return this.subHospitalUniqCode;
	}
	public void setSubHospitalUniqCode(String subHospitalUniqCode) {
		this.subHospitalUniqCode = subHospitalUniqCode;
	}

}
