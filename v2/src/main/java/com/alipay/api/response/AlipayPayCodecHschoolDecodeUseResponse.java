package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.codec.hschool.decode.use response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:09
 */
public class AlipayPayCodecHschoolDecodeUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2152318756229999213L;

	/** 
	 * 学生短号
	 */
	@ApiField("feature_code")
	private String featureCode;

	/** 
	 * 红码 : "red"
 黄码 :"yellow"
 绿码 : "green"
审核中 :  "init"
未找到  : "notFound"
	 */
	@ApiField("health_status")
	private String healthStatus;

	/** 
	 * 学校编号（外标）
	 */
	@ApiField("school_std_code")
	private String schoolStdCode;

	/** 
	 * 学号
	 */
	@ApiField("student_no")
	private String studentNo;

	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}
	public String getFeatureCode( ) {
		return this.featureCode;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}
	public String getHealthStatus( ) {
		return this.healthStatus;
	}

	public void setSchoolStdCode(String schoolStdCode) {
		this.schoolStdCode = schoolStdCode;
	}
	public String getSchoolStdCode( ) {
		return this.schoolStdCode;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentNo( ) {
		return this.studentNo;
	}

}
