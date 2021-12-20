package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云验收活动明细
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class OpenActivity extends AlipayObject {

	private static final long serialVersionUID = 7844256337356549725L;

	/**
	 * 活动结束时间
	 */
	@ApiField("activity_end_date")
	private String activityEndDate;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动开始时间
	 */
	@ApiField("activity_start_date")
	private String activityStartDate;

	/**
	 * 活动验证状态
0，未检测
1，未通过
2，已通过
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/**
	 * 门店id
	 */
	@ApiField("store_id")
	private String storeId;

	public String getActivityEndDate() {
		return this.activityEndDate;
	}
	public void setActivityEndDate(String activityEndDate) {
		this.activityEndDate = activityEndDate;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityStartDate() {
		return this.activityStartDate;
	}
	public void setActivityStartDate(String activityStartDate) {
		this.activityStartDate = activityStartDate;
	}

	public String getActivityStatus() {
		return this.activityStatus;
	}
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
