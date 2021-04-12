package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试脱敏数据
 *
 * @author auto create
 * @since 1.0, 2021-04-09 17:21:00
 */
public class TestDesensitive extends AlipayObject {

	private static final long serialVersionUID = 1472445916231869261L;

	/**
	 * 100
	 */
	@ApiField("city")
	private String city;

	/**
	 * 1
	 */
	@ApiListField("city_list")
	@ApiField("string")
	private List<String> cityList;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 移动手机列表
	 */
	@ApiListField("mobile_list")
	@ApiField("string")
	private List<String> mobileList;

	/**
	 * 1200
	 */
	@ApiField("name")
	private String name;

	/**
	 * 接口名测试
	 */
	@ApiField("name_list")
	private String nameList;

	/**
	 * 学生
	 */
	@ApiField("student_info")
	private SubTestDesensitive studentInfo;

	/**
	 * 学生信息列表
	 */
	@ApiListField("student_info_list")
	@ApiField("sub_test_desensitive")
	private List<SubTestDesensitive> studentInfoList;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getCityList() {
		return this.cityList;
	}
	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<String> getMobileList() {
		return this.mobileList;
	}
	public void setMobileList(List<String> mobileList) {
		this.mobileList = mobileList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNameList() {
		return this.nameList;
	}
	public void setNameList(String nameList) {
		this.nameList = nameList;
	}

	public SubTestDesensitive getStudentInfo() {
		return this.studentInfo;
	}
	public void setStudentInfo(SubTestDesensitive studentInfo) {
		this.studentInfo = studentInfo;
	}

	public List<SubTestDesensitive> getStudentInfoList() {
		return this.studentInfoList;
	}
	public void setStudentInfoList(List<SubTestDesensitive> studentInfoList) {
		this.studentInfoList = studentInfoList;
	}

}
