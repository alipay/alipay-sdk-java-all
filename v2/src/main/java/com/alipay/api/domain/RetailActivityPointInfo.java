package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 积分活动列表
 *
 * @author auto create
 * @since 1.0, 2025-04-22 21:56:32
 */
public class RetailActivityPointInfo extends AlipayObject {

	private static final long serialVersionUID = 2833337727953869743L;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 消耗积分数量
	 */
	@ApiField("point_amount_floor")
	private String pointAmountFloor;

	/**
	 * 奖品信息
	 */
	@ApiListField("prize_info")
	@ApiField("prize_detail_info")
	private List<PrizeDetailInfo> prizeInfo;

	/**
	 * 活动id
	 */
	@ApiField("retail_activity_id")
	private String retailActivityId;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 活动状态
	 */
	@ApiField("status")
	private String status;

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getPointAmountFloor() {
		return this.pointAmountFloor;
	}
	public void setPointAmountFloor(String pointAmountFloor) {
		this.pointAmountFloor = pointAmountFloor;
	}

	public List<PrizeDetailInfo> getPrizeInfo() {
		return this.prizeInfo;
	}
	public void setPrizeInfo(List<PrizeDetailInfo> prizeInfo) {
		this.prizeInfo = prizeInfo;
	}

	public String getRetailActivityId() {
		return this.retailActivityId;
	}
	public void setRetailActivityId(String retailActivityId) {
		this.retailActivityId = retailActivityId;
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
