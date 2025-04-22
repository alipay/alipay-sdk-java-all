package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户券详情
 *
 * @author auto create
 * @since 1.0, 2023-07-21 11:25:40
 */
public class UserVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 8613255641741312681L;

	/**
	 * 活动基础信息。
	 */
	@ApiField("activity_base_info")
	private ActivityBaseInfo activityBaseInfo;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 券可用开始时间。
	 */
	@ApiField("available_begin_time")
	private Date availableBeginTime;

	/**
	 * 券可用结束时间。
	 */
	@ApiField("available_end_time")
	private Date availableEndTime;

	/**
	 * 归属商户PID
	 */
	@ApiField("belong_merchant_id")
	private String belongMerchantId;

	/**
	 * 用户领券时间。
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 用户券实例信息。
	 */
	@ApiField("user_voucher_base_info")
	private UserVoucherBaseInfo userVoucherBaseInfo;

	/**
	 * 券可用范围。
	 */
	@ApiField("voucher_available_scope_info")
	private VoucherAvailableScopeInfo voucherAvailableScopeInfo;

	/**
	 * 券引导信息
	 */
	@ApiField("voucher_customer_guide_info")
	private VoucherCustomerGuideInfo voucherCustomerGuideInfo;

	/**
	 * 券优惠信息。
	 */
	@ApiField("voucher_deduct_info")
	private VoucherDeductInfo voucherDeductInfo;

	/**
	 * 券展示信息。
	 */
	@ApiField("voucher_display_lite_info")
	private CommonVoucherDisplayLiteInfo voucherDisplayLiteInfo;

	/**
	 * 券展示信息。
	 */
	@ApiField("voucher_display_pattern_info")
	private VoucherDisplayPatternInfo voucherDisplayPatternInfo;

	/**
	 * 用户券 id。支付宝为用户优惠券唯一分配的 id。
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 对消费者展示的券(商品)名称。
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券发放信息。
	 */
	@ApiField("voucher_send_mode_info")
	private VoucherSendModeInfo voucherSendModeInfo;

	/**
	 * 券状态。
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	/**
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券核销规则
	 */
	@ApiField("voucher_use_rule_info")
	private VoucherUseRuleInfo voucherUseRuleInfo;

	/**
	 * 券核销规则。
	 */
	@ApiField("voucher_use_rule_lite_info")
	private CommonVoucherUseRuleLiteInfo voucherUseRuleLiteInfo;

	public ActivityBaseInfo getActivityBaseInfo() {
		return this.activityBaseInfo;
	}
	public void setActivityBaseInfo(ActivityBaseInfo activityBaseInfo) {
		this.activityBaseInfo = activityBaseInfo;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
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

	public UserVoucherBaseInfo getUserVoucherBaseInfo() {
		return this.userVoucherBaseInfo;
	}
	public void setUserVoucherBaseInfo(UserVoucherBaseInfo userVoucherBaseInfo) {
		this.userVoucherBaseInfo = userVoucherBaseInfo;
	}

	public VoucherAvailableScopeInfo getVoucherAvailableScopeInfo() {
		return this.voucherAvailableScopeInfo;
	}
	public void setVoucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
		this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
	}

	public VoucherCustomerGuideInfo getVoucherCustomerGuideInfo() {
		return this.voucherCustomerGuideInfo;
	}
	public void setVoucherCustomerGuideInfo(VoucherCustomerGuideInfo voucherCustomerGuideInfo) {
		this.voucherCustomerGuideInfo = voucherCustomerGuideInfo;
	}

	public VoucherDeductInfo getVoucherDeductInfo() {
		return this.voucherDeductInfo;
	}
	public void setVoucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
		this.voucherDeductInfo = voucherDeductInfo;
	}

	public CommonVoucherDisplayLiteInfo getVoucherDisplayLiteInfo() {
		return this.voucherDisplayLiteInfo;
	}
	public void setVoucherDisplayLiteInfo(CommonVoucherDisplayLiteInfo voucherDisplayLiteInfo) {
		this.voucherDisplayLiteInfo = voucherDisplayLiteInfo;
	}

	public VoucherDisplayPatternInfo getVoucherDisplayPatternInfo() {
		return this.voucherDisplayPatternInfo;
	}
	public void setVoucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
		this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
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

	public VoucherSendModeInfo getVoucherSendModeInfo() {
		return this.voucherSendModeInfo;
	}
	public void setVoucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
		this.voucherSendModeInfo = voucherSendModeInfo;
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

	public VoucherUseRuleInfo getVoucherUseRuleInfo() {
		return this.voucherUseRuleInfo;
	}
	public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
		this.voucherUseRuleInfo = voucherUseRuleInfo;
	}

	public CommonVoucherUseRuleLiteInfo getVoucherUseRuleLiteInfo() {
		return this.voucherUseRuleLiteInfo;
	}
	public void setVoucherUseRuleLiteInfo(CommonVoucherUseRuleLiteInfo voucherUseRuleLiteInfo) {
		this.voucherUseRuleLiteInfo = voucherUseRuleLiteInfo;
	}

}
