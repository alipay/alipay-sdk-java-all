package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动基本信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class ActivityDto extends AlipayObject {

	private static final long serialVersionUID = 2722476218758774293L;

	/**
	 * 活动别名
	 */
	@ApiField("activity_alias")
	private String activityAlias;

	/**
	 * 活动描述
	 */
	@ApiField("activity_desc")
	private String activityDesc;

	/**
	 * 活动结束时间
	 */
	@ApiField("activity_end_time")
	private String activityEndTime;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动开始时间
	 */
	@ApiField("activity_start_time")
	private String activityStartTime;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 发放时间规则
	 */
	@ApiListField("participate_count_limit")
	@ApiField("participate_count_dto")
	private List<ParticipateCountDto> participateCountLimit;

	/**
	 * 发放模式
	 */
	@ApiField("send_mode")
	private String sendMode;

	/**
	 * 适用门店
	 */
	@ApiListField("suitable_shops")
	@ApiField("string")
	private List<String> suitableShops;

	public String getActivityAlias() {
		return this.activityAlias;
	}
	public void setActivityAlias(String activityAlias) {
		this.activityAlias = activityAlias;
	}

	public String getActivityDesc() {
		return this.activityDesc;
	}
	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}

	public String getActivityEndTime() {
		return this.activityEndTime;
	}
	public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityStartTime() {
		return this.activityStartTime;
	}
	public void setActivityStartTime(String activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public List<ParticipateCountDto> getParticipateCountLimit() {
		return this.participateCountLimit;
	}
	public void setParticipateCountLimit(List<ParticipateCountDto> participateCountLimit) {
		this.participateCountLimit = participateCountLimit;
	}

	public String getSendMode() {
		return this.sendMode;
	}
	public void setSendMode(String sendMode) {
		this.sendMode = sendMode;
	}

	public List<String> getSuitableShops() {
		return this.suitableShops;
	}
	public void setSuitableShops(List<String> suitableShops) {
		this.suitableShops = suitableShops;
	}

}
