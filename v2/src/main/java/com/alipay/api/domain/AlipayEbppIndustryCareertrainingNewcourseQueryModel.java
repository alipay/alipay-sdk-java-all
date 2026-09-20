package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询职业培训课程详情V2
 *
 * @author auto create
 * @since 1.0, 2026-08-27 09:47:11
 */
public class AlipayEbppIndustryCareertrainingNewcourseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1198268223972414974L;

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
