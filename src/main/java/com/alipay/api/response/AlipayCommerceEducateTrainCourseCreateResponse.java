package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.train.course.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-28 20:40:22
 */
public class AlipayCommerceEducateTrainCourseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2451379849128613738L;

	/** 
	 * 支付宝内部课程id
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
