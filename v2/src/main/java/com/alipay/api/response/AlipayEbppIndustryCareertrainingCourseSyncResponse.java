package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.course.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:17:36
 */
public class AlipayEbppIndustryCareertrainingCourseSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1786339643158241332L;

	/** 
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	/** 
	 * DELISTING("下架")
AVAILABLE("上架")
	 */
	@ApiField("course_status")
	private String courseStatus;

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseId( ) {
		return this.courseId;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}
	public String getCourseStatus( ) {
		return this.courseStatus;
	}

}
