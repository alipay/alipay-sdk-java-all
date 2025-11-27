package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 海心获取医生返回结构体
 *
 * @author auto create
 * @since 1.0, 2025-03-31 09:33:28
 */
public class GetDoctorResult extends AlipayObject {

	private static final long serialVersionUID = 2452467726926786852L;

	/**
	 * 所属科室
	 */
	@ApiField("department")
	private String department;

	/**
	 * 医生描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 头像
	 */
	@ApiField("head")
	private String head;

	/**
	 * 医院
	 */
	@ApiField("hospital")
	private String hospital;

	/**
	 * 医生名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 医生出诊时间
	 */
	@ApiField("schedule")
	private String schedule;

	/**
	 * 医生职称
	 */
	@ApiField("title")
	private String title;

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getHead() {
		return this.head;
	}
	public void setHead(String head) {
		this.head = head;
	}

	public String getHospital() {
		return this.hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSchedule() {
		return this.schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
