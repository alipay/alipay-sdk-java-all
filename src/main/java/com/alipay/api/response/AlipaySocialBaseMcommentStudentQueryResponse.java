package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.student.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySocialBaseMcommentStudentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7753892312895242411L;

	/** 
	 * 大学编码
	 */
	@ApiField("campus_code")
	private String campusCode;

	/** 
	 * 大学名称
	 */
	@ApiField("campus_name")
	private String campusName;

	/** 
	 * 学历
	 */
	@ApiField("degree")
	private String degree;

	/** 
	 * 入学年份
	 */
	@ApiField("enrollment_time")
	private String enrollmentTime;

	/** 
	 * 毕业时间
	 */
	@ApiField("graduation_time")
	private String graduationTime;

	/** 
	 * 省份编码 引用方无需处理
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 外网无需处理此字段
	 */
	@ApiField("province_name")
	private String provinceName;

	/** 
	 * UNKNOWN(0, "未认证"),
    UNDERGRADUATE(1, "在校生"),
    GRADUATED(2, "毕业生"),
    OFFICAL(3, "官方"),    
    UNIVERSITY(4, "学校"),
    NEWBORN(6, "新生"),
    EXPIRATION(7, "认证失效")
	 */
	@ApiField("status_enum")
	private String statusEnum;

	/** 
	 * 用户userId
	 */
	@ApiField("user_id")
	private String userId;

	public void setCampusCode(String campusCode) {
		this.campusCode = campusCode;
	}
	public String getCampusCode( ) {
		return this.campusCode;
	}

	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}
	public String getCampusName( ) {
		return this.campusName;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDegree( ) {
		return this.degree;
	}

	public void setEnrollmentTime(String enrollmentTime) {
		this.enrollmentTime = enrollmentTime;
	}
	public String getEnrollmentTime( ) {
		return this.enrollmentTime;
	}

	public void setGraduationTime(String graduationTime) {
		this.graduationTime = graduationTime;
	}
	public String getGraduationTime( ) {
		return this.graduationTime;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvinceName( ) {
		return this.provinceName;
	}

	public void setStatusEnum(String statusEnum) {
		this.statusEnum = statusEnum;
	}
	public String getStatusEnum( ) {
		return this.statusEnum;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
