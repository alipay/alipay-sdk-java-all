package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医院排班列表
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:04:13
 */
public class DoctorHospitalScheduleInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8397431688929515774L;

	/**
	 * 医院原始名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * main_hos_uniq_code
	 */
	@ApiField("main_hos_uniq_code")
	private String mainHosUniqCode;

	/**
	 * 院区排班列表
	 */
	@ApiListField("sub_hospital_register_info_list")
	@ApiField("doctor_hospital_campus_schedule_detail_d_t_o")
	private List<DoctorHospitalCampusScheduleDetailDTO> subHospitalRegisterInfoList;

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getMainHosUniqCode() {
		return this.mainHosUniqCode;
	}
	public void setMainHosUniqCode(String mainHosUniqCode) {
		this.mainHosUniqCode = mainHosUniqCode;
	}

	public List<DoctorHospitalCampusScheduleDetailDTO> getSubHospitalRegisterInfoList() {
		return this.subHospitalRegisterInfoList;
	}
	public void setSubHospitalRegisterInfoList(List<DoctorHospitalCampusScheduleDetailDTO> subHospitalRegisterInfoList) {
		this.subHospitalRegisterInfoList = subHospitalRegisterInfoList;
	}

}
