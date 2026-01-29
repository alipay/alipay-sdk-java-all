package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职业培训课程取消审核
 *
 * @author auto create
 * @since 1.0, 2026-01-14 10:45:57
 */
public class AlipayEbppIndustryCareertrainingCourseauditCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4418162657951711995L;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

}
