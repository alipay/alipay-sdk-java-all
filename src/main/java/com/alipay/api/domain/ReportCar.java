package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报案相关车辆信息
 *
 * @author auto create
 * @since 1.0, 2018-04-12 16:01:02
 */
public class ReportCar extends AlipayObject {

	private static final long serialVersionUID = 2251688961464627758L;

	/**
	 * 定损员信息，核赔阶段标的车必填
	 */
	@ApiField("assessor")
	private Person assessor;

	/**
	 * 司机信息，查勘、核赔阶段必填
	 */
	@ApiField("driver")
	private Person driver;

	/**
	 * 车架号，标的车在查勘、核赔阶段必填
	 */
	@ApiField("frame_no")
	private String frameNo;

	/**
	 * 修理厂地址
	 */
	@ApiField("garage_address")
	private String garageAddress;

	/**
	 * 修理厂名称
	 */
	@ApiField("garage_name")
	private String garageName;

	/**
	 * 修理厂手机号
	 */
	@ApiField("garage_phone_no")
	private String garagePhoneNo;

	/**
	 * 修理厂类型
4S:4S店
GENERAL:综合修理
	 */
	@ApiField("garage_type")
	private String garageType;

	/**
	 * 车牌号，标的车在查勘、核赔阶段必填
	 */
	@ApiField("license_no")
	private String licenseNo;

	/**
	 * 查勘首次提交时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("survey_first_commit_date")
	private Date surveyFirstCommitDate;

	/**
	 * 查勘末次时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("survey_last_commit_date")
	private String surveyLastCommitDate;

	/**
	 * 查勘员，查勘、核赔阶段标的车必填
	 */
	@ApiField("surveyor")
	private Person surveyor;

	public Person getAssessor() {
		return this.assessor;
	}
	public void setAssessor(Person assessor) {
		this.assessor = assessor;
	}

	public Person getDriver() {
		return this.driver;
	}
	public void setDriver(Person driver) {
		this.driver = driver;
	}

	public String getFrameNo() {
		return this.frameNo;
	}
	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	public String getGarageAddress() {
		return this.garageAddress;
	}
	public void setGarageAddress(String garageAddress) {
		this.garageAddress = garageAddress;
	}

	public String getGarageName() {
		return this.garageName;
	}
	public void setGarageName(String garageName) {
		this.garageName = garageName;
	}

	public String getGaragePhoneNo() {
		return this.garagePhoneNo;
	}
	public void setGaragePhoneNo(String garagePhoneNo) {
		this.garagePhoneNo = garagePhoneNo;
	}

	public String getGarageType() {
		return this.garageType;
	}
	public void setGarageType(String garageType) {
		this.garageType = garageType;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public Date getSurveyFirstCommitDate() {
		return this.surveyFirstCommitDate;
	}
	public void setSurveyFirstCommitDate(Date surveyFirstCommitDate) {
		this.surveyFirstCommitDate = surveyFirstCommitDate;
	}

	public String getSurveyLastCommitDate() {
		return this.surveyLastCommitDate;
	}
	public void setSurveyLastCommitDate(String surveyLastCommitDate) {
		this.surveyLastCommitDate = surveyLastCommitDate;
	}

	public Person getSurveyor() {
		return this.surveyor;
	}
	public void setSurveyor(Person surveyor) {
		this.surveyor = surveyor;
	}

}
