package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卖进活动信息
 *
 * @author auto create
 * @since 1.0, 2025-02-27 14:31:21
 */
public class NSalesActivity extends AlipayObject {

	private static final long serialVersionUID = 6886652171172552712L;

	/**
	 * 卖进活动设备编号
	 */
	@ApiField("activity_dvc_sn")
	private String activityDvcSn;

	/**
	 * 卖进订单活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 卖进订单活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 卖进订单活动创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 卖进订单活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 卖进订单子活动列表
	 */
	@ApiListField("period_list")
	@ApiField("n_sales_sub_activity")
	private List<NSalesSubActivity> periodList;

	/**
	 * 卖进订单活动跳过日期，未配置跳过日期时不返回该字段。
	 */
	@ApiListField("skip_dates")
	@ApiField("date")
	private List<Date> skipDates;

	/**
	 * 卖进订单活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 卖进订单活动状态
	 */
	@ApiField("status")
	private String status;

	public String getActivityDvcSn() {
		return this.activityDvcSn;
	}
	public void setActivityDvcSn(String activityDvcSn) {
		this.activityDvcSn = activityDvcSn;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<NSalesSubActivity> getPeriodList() {
		return this.periodList;
	}
	public void setPeriodList(List<NSalesSubActivity> periodList) {
		this.periodList = periodList;
	}

	public List<Date> getSkipDates() {
		return this.skipDates;
	}
	public void setSkipDates(List<Date> skipDates) {
		this.skipDates = skipDates;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
