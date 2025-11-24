package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.course.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-21 14:22:41
 */
public class AlipayEbppIndustryCareertrainingCourseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5729798299868983582L;

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
