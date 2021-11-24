package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动摘要信息
 *
 * @author auto create
 * @since 1.0, 2021-11-22 15:38:40
 */
public class ActivityLiteInfo extends AlipayObject {

	private static final long serialVersionUID = 8113666278967649965L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称。 不对支付宝用户进行展示，仅供商家在后台管理活动使用。
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动状态
枚举值： 
ACTIVE:已激活，表示活动已经激活但未到发放时间
SEND:可发放，表示活动已激活且已到活动发放时间，用户可以正常领取
PAUSE:已暂停，表示商户临时暂停该活动，用户不能领取
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
	 * 券展示规则
	 */
	@ApiField("voucher_display_lite_info")
	private CommonVoucherDisplayLiteInfo voucherDisplayLiteInfo;

	/**
	 * 券类型。 
枚举值： FIX_VOUCHER：满减券； DISCOUNT_VOUCHER：折扣券； SPECIAL_VOUCHER：特价券； EXCHANGE_VOUCHER: 兑换券；
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券核销规则
	 */
	@ApiField("voucher_use_rule_lite_info")
	private CommonVoucherUseRuleLiteInfo voucherUseRuleLiteInfo;

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

	public CommonVoucherDisplayLiteInfo getVoucherDisplayLiteInfo() {
		return this.voucherDisplayLiteInfo;
	}
	public void setVoucherDisplayLiteInfo(CommonVoucherDisplayLiteInfo voucherDisplayLiteInfo) {
		this.voucherDisplayLiteInfo = voucherDisplayLiteInfo;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public CommonVoucherUseRuleLiteInfo getVoucherUseRuleLiteInfo() {
		return this.voucherUseRuleLiteInfo;
	}
	public void setVoucherUseRuleLiteInfo(CommonVoucherUseRuleLiteInfo voucherUseRuleLiteInfo) {
		this.voucherUseRuleLiteInfo = voucherUseRuleLiteInfo;
	}

}
