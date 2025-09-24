package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.course.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-27 17:27:36
 */
public class AlipayEbppIndustryCareertrainingCourseModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8291355154233873238L;

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
