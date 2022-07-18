package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动信息
 *
 * @author auto create
 * @since 1.0, 2019-12-23 10:10:04
 */
public class MarketInfo extends AlipayObject {

	private static final long serialVersionUID = 7121867663956489257L;

	/**
	 * 活动图标。0.优惠券（目前仅提供一种后续增加）。必选项，单选。
	 */
	@ApiField("activity_icon")
	private String activityIcon;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动文案字符串，必填项，在加油小程序门店展位对用户展示
	 */
	@ApiField("activity_record")
	private String activityRecord;

	/**
	 * 活动链接URL地址字符串，必填项，需符合规范要求
	 */
	@ApiField("activity_url")
	private String activityUrl;

	/**
	 * 活动截止时间
	 */
	@ApiField("effective_end")
	private String effectiveEnd;

	/**
	 * 活动生效开始时间
	 */
	@ApiField("effective_start")
	private String effectiveStart;

	/**
	 * 上架平台：0 代表支付宝APP端
	 */
	@ApiField("last_platform")
	private String lastPlatform;

	/**
	 * 上架门店id，逗号分隔开
	 */
	@ApiField("last_store_id")
	private String lastStoreId;

	/**
	 * 展位优先级，整数，必填。同一门店多个活动时，优先级数值小优先展示
	 */
	@ApiField("priority_booth")
	private String priorityBooth;

	/**
	 * processed：发布，on：上架，off：下架
	 */
	@ApiField("status")
	private String status;

	public String getActivityIcon() {
		return this.activityIcon;
	}
	public void setActivityIcon(String activityIcon) {
		this.activityIcon = activityIcon;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityRecord() {
		return this.activityRecord;
	}
	public void setActivityRecord(String activityRecord) {
		this.activityRecord = activityRecord;
	}

	public String getActivityUrl() {
		return this.activityUrl;
	}
	public void setActivityUrl(String activityUrl) {
		this.activityUrl = activityUrl;
	}

	public String getEffectiveEnd() {
		return this.effectiveEnd;
	}
	public void setEffectiveEnd(String effectiveEnd) {
		this.effectiveEnd = effectiveEnd;
	}

	public String getEffectiveStart() {
		return this.effectiveStart;
	}
	public void setEffectiveStart(String effectiveStart) {
		this.effectiveStart = effectiveStart;
	}

	public String getLastPlatform() {
		return this.lastPlatform;
	}
	public void setLastPlatform(String lastPlatform) {
		this.lastPlatform = lastPlatform;
	}

	public String getLastStoreId() {
		return this.lastStoreId;
	}
	public void setLastStoreId(String lastStoreId) {
		this.lastStoreId = lastStoreId;
	}

	public String getPriorityBooth() {
		return this.priorityBooth;
	}
	public void setPriorityBooth(String priorityBooth) {
		this.priorityBooth = priorityBooth;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
