package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步职业培训课程状态
 *
 * @author auto create
 * @since 1.0, 2025-08-18 14:17:36
 */
public class AlipayEbppIndustryCareertrainingCourseSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1218975425776343117L;

	/**
	 * 课程ID, 以此作为主键更新
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 枚举: 
DELISTING("下架")
AVAILABLE("上架")
	 */
	@ApiField("course_status")
	private String courseStatus;

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseStatus() {
		return this.courseStatus;
	}
	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

}
