package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单券修改
 *
 * @author auto create
 * @since 1.0, 2023-07-04 21:28:22
 */
public class AlipayMarketingActivityOrdervoucherModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1457558379985958877L;

	/**
	 * 活动基础信息
	 */
	@ApiField("activity_base_info")
	private ActivityBaseInfo activityBaseInfo;

	/**
	 * 活动id1
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称。
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 引导用户配置。该值为空表示不修改。
	 */
	@ApiField("customer_guide")
	private CustomerGuideModify customerGuide;

	/**
	 * 商户接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 外部业务单号，用作幂等控制。
幂等作用：
参数不变的情况下，再次请求返回与上一次相同的结果。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券发放结束时间。该值为空表示不修改
格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

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
	 * 可用范围修改类型。
	 */
	@ApiField("voucher_available_scope_modify_type")
	private String voucherAvailableScopeModifyType;

	/**
	 * 券引导详情
	 */
	@ApiField("voucher_customer_guide_info")
	private VoucherCustomerGuideInfo voucherCustomerGuideInfo;

	/**
	 * 券展示信息。该值为空表示不修改。
	 */
	@ApiField("voucher_display_info")
	private VoucherDisplayInfoModify voucherDisplayInfo;

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
	 * 券发放规则
	 */
	@ApiField("voucher_send_rule")
	private VoucherSendRuleDetailModify voucherSendRule;

	/**
	 * 券使用规则。该值为空表示不修改。
	 */
	@ApiField("voucher_use_rule")
	private VoucherUseRuleModify voucherUseRule;

	/**
	 * 券核销规则
	 */
	@ApiField("voucher_use_rule_info")
	private VoucherUseRuleInfo voucherUseRuleInfo;

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

	public CustomerGuideModify getCustomerGuide() {
		return this.customerGuide;
	}
	public void setCustomerGuide(CustomerGuideModify customerGuide) {
		this.customerGuide = customerGuide;
	}

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getPublishEndTime() {
		return this.publishEndTime;
	}
	public void setPublishEndTime(Date publishEndTime) {
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

	public String getVoucherAvailableScopeModifyType() {
		return this.voucherAvailableScopeModifyType;
	}
	public void setVoucherAvailableScopeModifyType(String voucherAvailableScopeModifyType) {
		this.voucherAvailableScopeModifyType = voucherAvailableScopeModifyType;
	}

	public VoucherCustomerGuideInfo getVoucherCustomerGuideInfo() {
		return this.voucherCustomerGuideInfo;
	}
	public void setVoucherCustomerGuideInfo(VoucherCustomerGuideInfo voucherCustomerGuideInfo) {
		this.voucherCustomerGuideInfo = voucherCustomerGuideInfo;
	}

	public VoucherDisplayInfoModify getVoucherDisplayInfo() {
		return this.voucherDisplayInfo;
	}
	public void setVoucherDisplayInfo(VoucherDisplayInfoModify voucherDisplayInfo) {
		this.voucherDisplayInfo = voucherDisplayInfo;
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

	public VoucherSendRuleDetailModify getVoucherSendRule() {
		return this.voucherSendRule;
	}
	public void setVoucherSendRule(VoucherSendRuleDetailModify voucherSendRule) {
		this.voucherSendRule = voucherSendRule;
	}

	public VoucherUseRuleModify getVoucherUseRule() {
		return this.voucherUseRule;
	}
	public void setVoucherUseRule(VoucherUseRuleModify voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}

	public VoucherUseRuleInfo getVoucherUseRuleInfo() {
		return this.voucherUseRuleInfo;
	}
	public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
		this.voucherUseRuleInfo = voucherUseRuleInfo;
	}

}
