package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户券详情
 *
 * @author auto create
 * @since 1.0, 2021-11-16 17:03:10
 */
public class UserVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 5873968168535517653L;

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
	 * 券可用开始时间
	 */
	@ApiField("available_begin_time")
	private Date availableBeginTime;

	/**
	 * 券可用结束时间
	 */
	@ApiField("available_end_time")
	private Date availableEndTime;

	/**
	 * 券归属商户pid
	 */
	@ApiField("belong_merchant_id")
	private String belongMerchantId;

	/**
	 * 用户领券时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 用户券id。支付宝为用户优惠券唯一分配的id。
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称。展示在支付宝卡包中的券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券状态
枚举值
SENDED：可用
USED：已核销
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	/**
	 * 券类型。
 枚举值： 
FIX_VOUCHER：满减券； 
DISCOUNT_VOUCHER：折扣券； SPECIAL_VOUCHER：特价券； EXCHANGE_VOUCHER: 兑换券；
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

	public Date getAvailableBeginTime() {
		return this.availableBeginTime;
	}
	public void setAvailableBeginTime(Date availableBeginTime) {
		this.availableBeginTime = availableBeginTime;
	}

	public Date getAvailableEndTime() {
		return this.availableEndTime;
	}
	public void setAvailableEndTime(Date availableEndTime) {
		this.availableEndTime = availableEndTime;
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

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
