package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.newcourse.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 17:52:48
 */
public class AlipayEbppIndustryCareertrainingNewcourseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5368842578838782845L;

	/** 
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseId( ) {
		return this.courseId;
	}

}
