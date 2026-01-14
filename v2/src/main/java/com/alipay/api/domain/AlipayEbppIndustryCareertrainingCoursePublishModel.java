package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 课程行业投放与撤销投放
 *
 * @author auto create
 * @since 1.0, 2026-01-14 10:47:43
 */
public class AlipayEbppIndustryCareertrainingCoursePublishModel extends AlipayObject {

	private static final long serialVersionUID = 3795469742282337712L;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 投放状态 LAUNCH 投放 CANCEL_LAUNCH 撤退投放（仅当前商品为非审核中可撤销）
	 */
	@ApiField("publish_status")
	private String publishStatus;

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getPublishStatus() {
		return this.publishStatus;
	}
	public void setPublishStatus(String publishStatus) {
		this.publishStatus = publishStatus;
	}

}
