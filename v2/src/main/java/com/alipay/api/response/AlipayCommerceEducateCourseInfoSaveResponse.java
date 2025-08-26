package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.course.info.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 10:02:29
 */
public class AlipayCommerceEducateCourseInfoSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 1522279816435679696L;

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
