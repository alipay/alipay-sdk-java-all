package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主服务营销活动发布接口
 *
 * @author auto create
 * @since 1.0, 2020-01-10 17:35:09
 */
public class AlipayCommerceTransportVehicleownerCampaignPublishModel extends AlipayObject {

	private static final long serialVersionUID = 6186279854283446446L;

	/**
	 * 0.优惠券（目前仅提供一种后续增加）。必选项，单选。
	 */
	@ApiField("activity_icon")
	private String activityIcon;

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
	 * 业务类型
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 活动截止时间(备注：除下架外其它场景类型必填)
	 */
	@ApiField("effective_end")
	private String effectiveEnd;

	/**
	 * 活动生效开始时间(备注：除下架外其它场景类型必填)
	 */
	@ApiField("effective_start")
	private String effectiveStart;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 上架平台：0 代表支付宝APP端
	 */
	@ApiField("last_platform")
	private String lastPlatform;

	/**
	 * 上架门店id，逗号分隔开(备注：除上架外其它操作场景类型选填)
	 */
	@ApiField("last_store_id")
	private String lastStoreId;

	/**
	 * 外部订单号,商户端唯一
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 展位优先级，整数，必填。同一门店多个活动时，优先级数值小优先展示
	 */
	@ApiField("priority_booth")
	private String priorityBooth;

	public String getActivityIcon() {
		return this.activityIcon;
	}
	public void setActivityIcon(String activityIcon) {
		this.activityIcon = activityIcon;
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

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
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

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getPriorityBooth() {
		return this.priorityBooth;
	}
	public void setPriorityBooth(String priorityBooth) {
		this.priorityBooth = priorityBooth;
	}

}
