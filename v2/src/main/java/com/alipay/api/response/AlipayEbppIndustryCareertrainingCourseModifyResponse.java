package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.course.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-13 16:22:39
 */
public class AlipayEbppIndustryCareertrainingCourseModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4886118253343651171L;

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
