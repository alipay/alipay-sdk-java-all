package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-07 10:52:45
 */
public class ClassInfoQueryVO extends AlipayObject {

	private static final long serialVersionUID = 5862425857727347256L;

	/**
	 * 业务单号
	 */
	@ApiField("biz_no")
	private String bizNo;

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
	 * 开班日期
	 */
	@ApiField("start_date")
	private String startDate;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
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

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
