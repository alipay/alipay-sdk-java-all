package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * voyager营销活动券信息
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:41:32
 */
public class VoyagerVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 7166834214129572669L;

	/**
	 * 行动按钮跳转地址
	 */
	@ApiField("action_url")
	private String actionUrl;

	/**
	 * 券详情地址（T&C 条款等在详情页展示）
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 优惠单位：金额类为币种（ISO 4217），非金额权益为 折/次 等
	 */
	@ApiField("discount_unit")
	private String discountUnit;

	/**
	 * 优惠值（纯数值字符串）：金额券 500（分）、折扣券 8（8 折）、次数券 3
	 */
	@ApiField("discount_value")
	private String discountValue;

	/**
	 * 券背景图 URL
	 */
	@ApiField("gift_icon")
	private String giftIcon;

	/**
	 * 最大优惠金额单位（ISO 4217 币种）
	 */
	@ApiField("max_discount_unit")
	private String maxDiscountUnit;

	/**
	 * 最大优惠金额（折扣券封顶场景，可选）
	 */
	@ApiField("max_discount_value")
	private String maxDiscountValue;

	/**
	 * 门槛单位（一般为 ISO 4217 币种），展示如"满20可用"
	 */
	@ApiField("threshold_unit")
	private String thresholdUnit;

	/**
	 * 门槛值（如满 100 可用传 10000）
	 */
	@ApiField("threshold_value")
	private String thresholdValue;

	/**
	 * 券使用条件（对客展示）
	 */
	@ApiField("usage_condition")
	private String usageCondition;

	/**
	 * 券有效期结束时间，根据类型而定，可能为具体的时间，也可能为妙
	 */
	@ApiField("valid_end_time")
	private String validEndTime;

	/**
	 * 券有效期开始时间，根据类型而定，可能为具体的时间，也可能为妙
	 */
	@ApiField("valid_start_time")
	private String validStartTime;

	/**
	 * 有效类型：ABSOLUTE 绝对时间 / RELATIVE 相对时间
	 */
	@ApiField("valid_type")
	private String validType;

	/**
	 * 券图标 URL
	 */
	@ApiField("voucher_icon")
	private String voucherIcon;

	/**
	 * 券的对外名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券状态（用户视角）：NOT_CLAIMED（未领）/ CLAIMED（已领，存在可用券）/ USED（已使用，领取的券已全部核销）
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getActionUrl() {
		return this.actionUrl;
	}
	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getDiscountUnit() {
		return this.discountUnit;
	}
	public void setDiscountUnit(String discountUnit) {
		this.discountUnit = discountUnit;
	}

	public String getDiscountValue() {
		return this.discountValue;
	}
	public void setDiscountValue(String discountValue) {
		this.discountValue = discountValue;
	}

	public String getGiftIcon() {
		return this.giftIcon;
	}
	public void setGiftIcon(String giftIcon) {
		this.giftIcon = giftIcon;
	}

	public String getMaxDiscountUnit() {
		return this.maxDiscountUnit;
	}
	public void setMaxDiscountUnit(String maxDiscountUnit) {
		this.maxDiscountUnit = maxDiscountUnit;
	}

	public String getMaxDiscountValue() {
		return this.maxDiscountValue;
	}
	public void setMaxDiscountValue(String maxDiscountValue) {
		this.maxDiscountValue = maxDiscountValue;
	}

	public String getThresholdUnit() {
		return this.thresholdUnit;
	}
	public void setThresholdUnit(String thresholdUnit) {
		this.thresholdUnit = thresholdUnit;
	}

	public String getThresholdValue() {
		return this.thresholdValue;
	}
	public void setThresholdValue(String thresholdValue) {
		this.thresholdValue = thresholdValue;
	}

	public String getUsageCondition() {
		return this.usageCondition;
	}
	public void setUsageCondition(String usageCondition) {
		this.usageCondition = usageCondition;
	}

	public String getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(String validEndTime) {
		this.validEndTime = validEndTime;
	}

	public String getValidStartTime() {
		return this.validStartTime;
	}
	public void setValidStartTime(String validStartTime) {
		this.validStartTime = validStartTime;
	}

	public String getValidType() {
		return this.validType;
	}
	public void setValidType(String validType) {
		this.validType = validType;
	}

	public String getVoucherIcon() {
		return this.voucherIcon;
	}
	public void setVoucherIcon(String voucherIcon) {
		this.voucherIcon = voucherIcon;
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
