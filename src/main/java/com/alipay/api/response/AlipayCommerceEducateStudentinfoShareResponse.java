package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EduStudentInfoShareResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.studentinfo.share response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:44:04
 */
public class AlipayCommerceEducateStudentinfoShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 5823722771658162323L;

	/** 
	 * 学生信息
	 */
	@ApiField("student_info_share_result")
	private EduStudentInfoShareResult studentInfoShareResult;

	public void setStudentInfoShareResult(EduStudentInfoShareResult studentInfoShareResult) {
		this.studentInfoShareResult = studentInfoShareResult;
	}
	public EduStudentInfoShareResult getStudentInfoShareResult( ) {
		return this.studentInfoShareResult;
	}

}
