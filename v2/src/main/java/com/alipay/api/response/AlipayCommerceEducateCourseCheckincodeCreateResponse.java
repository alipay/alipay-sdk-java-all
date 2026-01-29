package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.course.checkincode.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 10:02:29
 */
public class AlipayCommerceEducateCourseCheckincodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8798622725525363694L;

	/** 
	 * 课程签到规则ID
	 */
	@ApiField("course_rule_id")
	private String courseRuleId;

	public void setCourseRuleId(String courseRuleId) {
		this.courseRuleId = courseRuleId;
	}
	public String getCourseRuleId( ) {
		return this.courseRuleId;
	}

}
