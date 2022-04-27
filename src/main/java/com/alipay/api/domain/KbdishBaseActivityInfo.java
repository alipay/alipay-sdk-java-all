package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品维度活动信息
 *
 * @author auto create
 * @since 1.0, 2020-12-14 14:03:17
 */
public class KbdishBaseActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 3524169751335383149L;

	/**
	 * 活动条款链接
	 */
	@ApiField("activity_clause_url")
	private String activityClauseUrl;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动说明文案
	 */
	@ApiField("activity_remark")
	private String activityRemark;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 活动值
	 */
	@ApiField("activity_value")
	private String activityValue;

	public String getActivityClauseUrl() {
		return this.activityClauseUrl;
	}
	public void setActivityClauseUrl(String activityClauseUrl) {
		this.activityClauseUrl = activityClauseUrl;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityRemark() {
		return this.activityRemark;
	}
	public void setActivityRemark(String activityRemark) {
		this.activityRemark = activityRemark;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getActivityValue() {
		return this.activityValue;
	}
	public void setActivityValue(String activityValue) {
		this.activityValue = activityValue;
	}

}
