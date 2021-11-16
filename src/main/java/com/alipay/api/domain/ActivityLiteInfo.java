package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动摘要信息
 *
 * @author auto create
 * @since 1.0, 2021-11-16 17:02:58
 */
public class ActivityLiteInfo extends AlipayObject {

	private static final long serialVersionUID = 2222429124338681616L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 展示信息
	 */
	@ApiField("activity_lite_display_info")
	private ActivityLiteDisplayInfo activityLiteDisplayInfo;

	/**
	 * 核销规则
	 */
	@ApiField("activity_lite_use_rule")
	private ActivityLiteUseRule activityLiteUseRule;

	/**
	 * 活动名称。 不对支付宝用户进行展示，仅供商家在后台管理活动使用。
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动状态，只有激活状态的活动可以领券
枚举值： 
ACTIVE:已激活
PAUSE:已暂停 
FINISHED:已停止
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/**
	 * 归属商户PID
	 */
	@ApiField("belong_merchant_id")
	private String belongMerchantId;

	/**
	 * 活动创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 券发放结束时间。 格式为：yyyy-MM-dd HH:mm:ss 限制： 券发放结束时间 publish_end_time 与 券发放开始时间 publish_start_time 间隔必须小于等于180天
	 */
	@ApiField("publish_end_time")
	private String publishEndTime;

	/**
	 * 券发放开始时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/**
	 * 券类型。 
枚举值： FIX_VOUCHER：满减券； DISCOUNT_VOUCHER：折扣券； SPECIAL_VOUCHER：特价券； EXCHANGE_VOUCHER: 兑换券；
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public ActivityLiteDisplayInfo getActivityLiteDisplayInfo() {
		return this.activityLiteDisplayInfo;
	}
	public void setActivityLiteDisplayInfo(ActivityLiteDisplayInfo activityLiteDisplayInfo) {
		this.activityLiteDisplayInfo = activityLiteDisplayInfo;
	}

	public ActivityLiteUseRule getActivityLiteUseRule() {
		return this.activityLiteUseRule;
	}
	public void setActivityLiteUseRule(ActivityLiteUseRule activityLiteUseRule) {
		this.activityLiteUseRule = activityLiteUseRule;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityStatus() {
		return this.activityStatus;
	}
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public String getBelongMerchantId() {
		return this.belongMerchantId;
	}
	public void setBelongMerchantId(String belongMerchantId) {
		this.belongMerchantId = belongMerchantId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(String publishEndTime) {
		this.publishEndTime = publishEndTime;
	}

	public Date getPublishStartTime() {
		return this.publishStartTime;
	}
	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
