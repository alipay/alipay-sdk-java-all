package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.course.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-27 19:07:36
 */
public class AlipayEbppIndustryCareertrainingCourseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2368476156891379347L;

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
