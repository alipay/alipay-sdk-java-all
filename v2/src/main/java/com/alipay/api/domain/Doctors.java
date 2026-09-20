package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生推荐列表
 *
 * @author auto create
 * @since 1.0, 2026-09-14 17:22:35
 */
public class Doctors extends AlipayObject {

	private static final long serialVersionUID = 4871525358542779967L;

	/**
	 * 权威认证
	 */
	@ApiField("authority")
	private String authority;

	/**
	 * 科室
	 */
	@ApiField("department")
	private String department;

	/**
	 * 医生用户名
	 */
	@ApiField("doctor_user_name")
	private String doctorUserName;

	/**
	 * 医院
	 */
	@ApiField("hospital")
	private String hospital;

	/**
	 * 医生姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 电话问诊价格
	 */
	@ApiField("phone_price")
	private String phonePrice;

	/**
	 * 电话回复时间
	 */
	@ApiField("phone_reply_time")
	private String phoneReplyTime;

	/**
	 * 职称
	 */
	@ApiField("professional")
	private String professional;

	/**
	 * 服务描述
	 */
	@ApiField("service")
	private String service;

	/**
	 * 图文问诊价格
	 */
	@ApiField("text_price")
	private String textPrice;

	/**
	 * 图文回复时间
	 */
	@ApiField("text_reply_time")
	private String textReplyTime;

	/**
	 * 黄页地址
	 */
	@ApiField("yellow_page_url")
	private String yellowPageUrl;

	public String getAuthority() {
		return this.authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDoctorUserName() {
		return this.doctorUserName;
	}
	public void setDoctorUserName(String doctorUserName) {
		this.doctorUserName = doctorUserName;
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

	public String getPhonePrice() {
		return this.phonePrice;
	}
	public void setPhonePrice(String phonePrice) {
		this.phonePrice = phonePrice;
	}

	public String getPhoneReplyTime() {
		return this.phoneReplyTime;
	}
	public void setPhoneReplyTime(String phoneReplyTime) {
		this.phoneReplyTime = phoneReplyTime;
	}

	public String getProfessional() {
		return this.professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}

	public String getService() {
		return this.service;
	}
	public void setService(String service) {
		this.service = service;
	}

	public String getTextPrice() {
		return this.textPrice;
	}
	public void setTextPrice(String textPrice) {
		this.textPrice = textPrice;
	}

	public String getTextReplyTime() {
		return this.textReplyTime;
	}
	public void setTextReplyTime(String textReplyTime) {
		this.textReplyTime = textReplyTime;
	}

	public String getYellowPageUrl() {
		return this.yellowPageUrl;
	}
	public void setYellowPageUrl(String yellowPageUrl) {
		this.yellowPageUrl = yellowPageUrl;
	}

}
