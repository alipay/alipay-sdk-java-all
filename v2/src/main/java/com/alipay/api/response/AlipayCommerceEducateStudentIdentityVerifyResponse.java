package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.student.identity.verify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:36
 */
public class AlipayCommerceEducateStudentIdentityVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6173947225164812299L;

	/** 
	 * 签名
	 */
	@ApiField("biz_sign")
	private String bizSign;

	/** 
	 * 是否是学生，1是；0否
	 */
	@ApiField("college_online_tag")
	private String collegeOnlineTag;

	/** 
	 * 学历，枚举类型：专科0，本科1，研究生2，博士3，本硕连读4，硕博连读5，本硕博连读6
	 */
	@ApiField("degree")
	private String degree;

	/** 
	 * 入学时间，格式yyyy-mm-dd
	 */
	@ApiField("enroll_date")
	private String enrollDate;

	/** 
	 * 审核状态，0-审核中，2-审核不通过，3-审核通过，5-无数据
	 */
	@ApiField("examine_status")
	private String examineStatus;

	/** 
	 * 会员状态，1 校园会员；0 新用户
	 */
	@ApiField("member_ship_status")
	private String memberShipStatus;

	/** 
	 * 学校内标
	 */
	@ApiField("school_id")
	private String schoolId;

	/** 
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/** 
	 * 时间戳
	 */
	@ApiField("time_stamp")
	private String timeStamp;

	/** 
	 * 身份类型，1-学生；2-教师；3-校友；4-考生；5-家长
	 */
	@ApiField("type")
	private String type;

	public void setBizSign(String bizSign) {
		this.bizSign = bizSign;
	}
	public String getBizSign( ) {
		return this.bizSign;
	}

	public void setCollegeOnlineTag(String collegeOnlineTag) {
		this.collegeOnlineTag = collegeOnlineTag;
	}
	public String getCollegeOnlineTag( ) {
		return this.collegeOnlineTag;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDegree( ) {
		return this.degree;
	}

	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getEnrollDate( ) {
		return this.enrollDate;
	}

	public void setExamineStatus(String examineStatus) {
		this.examineStatus = examineStatus;
	}
	public String getExamineStatus( ) {
		return this.examineStatus;
	}

	public void setMemberShipStatus(String memberShipStatus) {
		this.memberShipStatus = memberShipStatus;
	}
	public String getMemberShipStatus( ) {
		return this.memberShipStatus;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolId( ) {
		return this.schoolId;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolName( ) {
		return this.schoolName;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getTimeStamp( ) {
		return this.timeStamp;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
