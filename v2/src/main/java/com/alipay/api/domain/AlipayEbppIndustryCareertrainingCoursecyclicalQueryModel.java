package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询有效课程班次
 *
 * @author auto create
 * @since 1.0, 2026-04-07 10:52:45
 */
public class AlipayEbppIndustryCareertrainingCoursecyclicalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6135166174364288429L;

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
