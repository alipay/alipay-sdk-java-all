package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医院排班列表
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:03:58
 */
public class HospitalCampusRegisterScheduleInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2496493672231467318L;

	/**
	 * 距离，单位: m，意图中指定医院名称时，该字段有值
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 排班日期列表
	 */
	@ApiListField("schedule_date_list")
	@ApiField("register_schedule_date_d_t_o")
	private List<RegisterScheduleDateDTO> scheduleDateList;

	/**
	 * 院区简称，意图中指定医院名称时，该字段有值
	 */
	@ApiField("sub_hospital_shore_name")
	private String subHospitalShoreName;

	/**
	 * 灵知院区医院编码，意图中指定医院名称时，该字段有值
	 */
	@ApiField("sub_hospital_uniq_code")
	private String subHospitalUniqCode;

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public List<RegisterScheduleDateDTO> getScheduleDateList() {
		return this.scheduleDateList;
	}
	public void setScheduleDateList(List<RegisterScheduleDateDTO> scheduleDateList) {
		this.scheduleDateList = scheduleDateList;
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
