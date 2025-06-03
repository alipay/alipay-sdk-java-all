package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.course.info.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 18:52:28
 */
public class AlipayCommerceEducateCourseInfoSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 6385337891593362748L;

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
