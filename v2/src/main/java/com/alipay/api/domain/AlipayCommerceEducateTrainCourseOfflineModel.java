package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品下架
 *
 * @author auto create
 * @since 1.0, 2025-04-14 11:19:57
 */
public class AlipayCommerceEducateTrainCourseOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 3898926377983282538L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝内部课程id
	 */
	@ApiField("course_id")
	private String courseId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

}
