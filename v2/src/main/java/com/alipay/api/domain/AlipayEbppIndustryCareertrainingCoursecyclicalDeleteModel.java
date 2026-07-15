package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除课程班次
 *
 * @author auto create
 * @since 1.0, 2026-04-07 10:52:16
 */
public class AlipayEbppIndustryCareertrainingCoursecyclicalDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1196355255852394661L;

	/**
	 * 业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
