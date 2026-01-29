package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 排班日期列表
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:04:13
 */
public class DoctorRegisterScheduleDateDTO extends AlipayObject {

	private static final long serialVersionUID = 8382376138346379649L;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 号源统计列表
	 */
	@ApiListField("number_count_list")
	@ApiField("register_number_count_d_t_o")
	private List<RegisterNumberCountDTO> numberCountList;

	/**
	 * 枚举值：
有号:1
已约满:2
停诊:3
等待放号:4
	 */
	@ApiField("number_status")
	private String numberStatus;

	/**
	 * 日期，格式：MM.dd
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 排班id
	 */
	@ApiField("register_id")
	private String registerId;

	/**
	 * 星期序号
	 */
	@ApiField("week_num")
	private String weekNum;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public List<RegisterNumberCountDTO> getNumberCountList() {
		return this.numberCountList;
	}
	public void setNumberCountList(List<RegisterNumberCountDTO> numberCountList) {
		this.numberCountList = numberCountList;
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

	public String getRegisterId() {
		return this.registerId;
	}
	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

	public String getWeekNum() {
		return this.weekNum;
	}
	public void setWeekNum(String weekNum) {
		this.weekNum = weekNum;
	}

}
