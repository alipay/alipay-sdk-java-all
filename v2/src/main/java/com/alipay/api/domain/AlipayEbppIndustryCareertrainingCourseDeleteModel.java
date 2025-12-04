package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商删除课程信息
 *
 * @author auto create
 * @since 1.0, 2025-10-13 16:12:39
 */
public class AlipayEbppIndustryCareertrainingCourseDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8467783736815614714L;

	/**
	 * 课程id，与out_course_id至少传一个
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 外部课程id，与course_id至少传一个
	 */
	@ApiField("out_course_id")
	private String outCourseId;

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getOutCourseId() {
		return this.outCourseId;
	}
	public void setOutCourseId(String outCourseId) {
		this.outCourseId = outCourseId;
	}

}
