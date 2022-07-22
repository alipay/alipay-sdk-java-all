package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动摘要信息
 *
 * @author auto create
 * @since 1.0, 2022-07-20 17:45:37
 */
public class ActivityLiteInfo extends AlipayObject {

	private static final long serialVersionUID = 2536531282841628934L;

	/**
	 * 活动基础信息
	 */
	@ApiField("activity_base_info")
	private ActivityBaseInfo activityBaseInfo;

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
ACTIVE:活动已激活，表示活动已经生效，等到活动开始(publish_start_time)之后用户就可以参与活动。
PAUSE:活动已暂停，表示商户临时暂停该活动，该状态下用户不能参与活动
FINISHED:活动已结束，表示商户主动停止活动或活动到期结束(publish_end_time)不能再进行领取或修改等操作。
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
	 * 券可用范围
	 */
	@ApiField("voucher_available_scope_info")
	private VoucherAvailableScopeInfo voucherAvailableScopeInfo;

	/**
	 * 券优惠信息
	 */
	@ApiField("voucher_deduct_info")
	private VoucherDeductInfo voucherDeductInfo;

	/**
	 * 券展示规则
	 */
	@ApiField("voucher_display_lite_info")
	private CommonVoucherDisplayLiteInfo voucherDisplayLiteInfo;

	/**
	 * 券展示信息
	 */
	@ApiField("voucher_display_pattern_info")
	private VoucherDisplayPatternInfo voucherDisplayPatternInfo;

	/**
	 * 券发放
	 */
	@ApiField("voucher_send_mode_info")
	private VoucherSendModeInfo voucherSendModeInfo;

	/**
	 * 券类型。 
枚举值： FIX_VOUCHER：满减券； DISCOUNT_VOUCHER：折扣券； SPECIAL_VOUCHER：特价券； EXCHANGE_VOUCHER: 兑换券；
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券核销
	 */
	@ApiField("voucher_use_rule_info")
	private VoucherUseRuleInfo voucherUseRuleInfo;

	/**
	 * 券核销规则
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

	public VoucherAvailableScopeInfo getVoucherAvailableScopeInfo() {
		return this.voucherAvailableScopeInfo;
	}
	public void setVoucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
		this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
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

	public VoucherSendModeInfo getVoucherSendModeInfo() {
		return this.voucherSendModeInfo;
	}
	public void setVoucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
		this.voucherSendModeInfo = voucherSendModeInfo;
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
