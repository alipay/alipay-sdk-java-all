package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.course.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 15:07:42
 */
public class AlipayEbppIndustryCareertrainingCourseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8665767731696992624L;

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
