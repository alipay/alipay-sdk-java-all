package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 排班日期
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:03:58
 */
public class RegisterScheduleDateDTO extends AlipayObject {

	private static final long serialVersionUID = 1728663225688728178L;

	/**
	 * 展示日期，格式：MM/dd
为null 表示展示全部号源
	 */
	@ApiField("date")
	private String date;

	/**
	 * 排班医生列表
	 */
	@ApiListField("doctor_info_list")
	@ApiField("register_doctor_info_d_t_o")
	private List<RegisterDoctorInfoDTO> doctorInfoList;

	/**
	 * 号源状态，枚举值
0：无号
1：有号
2：已约满
	 */
	@ApiField("number_status")
	private String numberStatus;

	/**
	 * 平台挂号日期
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 排班描述
	 */
	@ApiField("schedule_desc")
	private String scheduleDesc;

	/**
	 * 星期序号，枚举值
周一；周二；周三；周四
周五；周六；周日
	 */
	@ApiField("week_num")
	private String weekNum;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public List<RegisterDoctorInfoDTO> getDoctorInfoList() {
		return this.doctorInfoList;
	}
	public void setDoctorInfoList(List<RegisterDoctorInfoDTO> doctorInfoList) {
		this.doctorInfoList = doctorInfoList;
	}

	public String getNumberStatus() {
		return this.numberStatus;
	}
	public void setNumberStatus(String numberStatus) {
		this.numberStatus = numberStatus;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getScheduleDesc() {
		return this.scheduleDesc;
	}
	public void setScheduleDesc(String scheduleDesc) {
		this.scheduleDesc = scheduleDesc;
	}

	public String getWeekNum() {
		return this.weekNum;
	}
	public void setWeekNum(String weekNum) {
		this.weekNum = weekNum;
	}

}
