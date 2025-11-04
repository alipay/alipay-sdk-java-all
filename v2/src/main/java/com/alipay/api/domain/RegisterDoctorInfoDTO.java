package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 排班医生
 *
 * @author auto create
 * @since 1.0, 2025-04-27 11:49:03
 */
public class RegisterDoctorInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6585394513813192491L;

	/**
	 * 挂号医生地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 最早预约时间，全部号源筛选下，消费该字段
	 */
	@ApiField("book_date")
	private String bookDate;

	/**
	 * 日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 科室id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 医院行政科室名称
	 */
	@ApiField("department_name")
	private String departmentName;

	/**
	 * 医生挂号主页链接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 用户当前位置与医院距离，单位:m
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 医生性别
	 */
	@ApiField("doctor_gender")
	private String doctorGender;

	/**
	 * 平台医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 内部医生id
	 */
	@ApiField("doctor_inner_id")
	private String doctorInnerId;

	/**
	 * 医生头像
	 */
	@ApiField("doctor_logo")
	private String doctorLogo;

	/**
	 * 医生姓名
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * 最早挂号日期
	 */
	@ApiField("earliest_date")
	private String earliestDate;

	/**
	 * 医生教学名称
	 */
	@ApiField("education_title")
	private String educationTitle;

	/**
	 * 医院级别
三甲：THIRD_CLASS
三级：THREE_LEVEL
二级：SECOND_LEVEL
一级：FIRST_LEVEL
社区卫生服务中心：HEALTH_CENTER
其他：OTHER
	 */
	@ApiField("hos_grade")
	private String hosGrade;

	/**
	 * 灵知医院id
	 */
	@ApiField("hos_uinq_code")
	private String hosUinqCode;

	/**
	 * 医生挂号医院地址
	 */
	@ApiField("hospital_address")
	private String hospitalAddress;

	/**
	 * 科室专科复旦top标签
	 */
	@ApiListField("hospital_dep_feature_tags")
	@ApiField("string")
	private List<String> hospitalDepFeatureTags;

	/**
	 * 医院id
	 */
	@ApiField("hospital_id")
	private String hospitalId;

	/**
	 * 医院名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 号源列表
	 */
	@ApiListField("number_count_list")
	@ApiField("register_number_count_d_t_o")
	private List<RegisterNumberCountDTO> numberCountList;

	/**
	 * 号源状态
	 */
	@ApiField("number_status")
	private String numberStatus;

	/**
	 * 平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 医生擅长
	 */
	@ApiField("proficiency")
	private String proficiency;

	/**
	 * 挂号日期
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * 排班状态，枚举值
1： 有号
2：已约满
3：停诊
	 */
	@ApiField("schedule_status")
	private String scheduleStatus;

	/**
	 * 名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 星期序号
	 */
	@ApiField("week_num")
	private String weekNum;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBookDate() {
		return this.bookDate;
	}
	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getDoctorGender() {
		return this.doctorGender;
	}
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorInnerId() {
		return this.doctorInnerId;
	}
	public void setDoctorInnerId(String doctorInnerId) {
		this.doctorInnerId = doctorInnerId;
	}

	public String getDoctorLogo() {
		return this.doctorLogo;
	}
	public void setDoctorLogo(String doctorLogo) {
		this.doctorLogo = doctorLogo;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getEarliestDate() {
		return this.earliestDate;
	}
	public void setEarliestDate(String earliestDate) {
		this.earliestDate = earliestDate;
	}

	public String getEducationTitle() {
		return this.educationTitle;
	}
	public void setEducationTitle(String educationTitle) {
		this.educationTitle = educationTitle;
	}

	public String getHosGrade() {
		return this.hosGrade;
	}
	public void setHosGrade(String hosGrade) {
		this.hosGrade = hosGrade;
	}

	public String getHosUinqCode() {
		return this.hosUinqCode;
	}
	public void setHosUinqCode(String hosUinqCode) {
		this.hosUinqCode = hosUinqCode;
	}

	public String getHospitalAddress() {
		return this.hospitalAddress;
	}
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public List<String> getHospitalDepFeatureTags() {
		return this.hospitalDepFeatureTags;
	}
	public void setHospitalDepFeatureTags(List<String> hospitalDepFeatureTags) {
		this.hospitalDepFeatureTags = hospitalDepFeatureTags;
	}

	public String getHospitalId() {
		return this.hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
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

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getProficiency() {
		return this.proficiency;
	}
	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getScheduleStatus() {
		return this.scheduleStatus;
	}
	public void setScheduleStatus(String scheduleStatus) {
		this.scheduleStatus = scheduleStatus;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getWeekNum() {
		return this.weekNum;
	}
	public void setWeekNum(String weekNum) {
		this.weekNum = weekNum;
	}

}
