package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建课程班次
 *
 * @author auto create
 * @since 1.0, 2026-05-26 17:57:47
 */
public class AlipayEbppIndustryCareertrainingCoursecyclicalCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1412773291663211956L;

	/**
	 * 课程ID
	 */
	@ApiField("course_id")
	private String courseId;

	/**
	 * 结课日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 上课时间描述
	 */
	@ApiField("schedule_description")
	private String scheduleDescription;

	/**
	 * 蚂蚁门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * null
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 开班日期
	 */
	@ApiField("start_date")
	private String startDate;

	public String getCourseId() {
		return this.courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getScheduleDescription() {
		return this.scheduleDescription;
	}
	public void setScheduleDescription(String scheduleDescription) {
		this.scheduleDescription = scheduleDescription;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
