package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建支付券
 *
 * @author auto create
 * @since 1.0, 2023-07-21 20:35:32
 */
public class AlipayMarketingActivityVoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1399658866173153471L;

	/**
	 * 活动基础信息
	 */
	@ApiField("activity_base_info")
	private ActivityBaseInfo activityBaseInfo;

	/**
	 * 活动名称。 不对用户进行展示，仅供商家在后台管理活动使用。
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 归属商户信息，默认归属商户为当前请求商户
	 */
	@ApiField("belong_merchant_info")
	private PaymentVoucherBelongMerchantInfo belongMerchantInfo;

	/**
	 * 商户接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 用作幂等控制。

幂等作用：
参数不变的情况下，再次请求返回与上一次相同的结果。

外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券发放结束时间。 格式为：yyyy-MM-dd HH:mm:ss 限制： 券发放结束时间 publish_end_time 与 券发放开始时间 publish_start_time 间隔必须小于等于180天
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
	 * 营销资金预算
	 */
	@ApiField("voucher_budget_info")
	private PaymentVoucherBudgetInfo voucherBudgetInfo;

	/**
	 * 资金信息
	 */
	@ApiField("voucher_budget_supply_info")
	private VoucherBudgetSupplyInfo voucherBudgetSupplyInfo;

	/**
	 * 券引导信息
	 */
	@ApiField("voucher_customer_guide_info")
	private VoucherCustomerGuideInfo voucherCustomerGuideInfo;

	/**
	 * 券优惠抵扣信息
	 */
	@ApiField("voucher_deduct_info")
	private VoucherDeductInfo voucherDeductInfo;

	/**
	 * 券详情页
	 */
	@ApiField("voucher_display_info")
	private PaymentVoucherDisplayInfo voucherDisplayInfo;

	/**
	 * 券展示信息
	 */
	@ApiField("voucher_display_pattern_info")
	private VoucherDisplayPatternInfo voucherDisplayPatternInfo;

	/**
	 * 券发放信息
	 */
	@ApiField("voucher_send_mode_info")
	private VoucherSendModeInfo voucherSendModeInfo;

	/**
	 * 券发放规则
	 */
	@ApiField("voucher_send_rule")
	private PaymentVoucherSendRule voucherSendRule;

	/**
	 * 优惠类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券核销规则
	 */
	@ApiField("voucher_use_rule")
	private PaymentVoucherUseRule voucherUseRule;

	/**
	 * 券核销限制
	 */
	@ApiField("voucher_use_rule_info")
	private VoucherUseRuleInfo voucherUseRuleInfo;

	public ActivityBaseInfo getActivityBaseInfo() {
		return this.activityBaseInfo;
	}
	public void setActivityBaseInfo(ActivityBaseInfo activityBaseInfo) {
		this.activityBaseInfo = activityBaseInfo;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public PaymentVoucherBelongMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(PaymentVoucherBelongMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
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

	public PaymentVoucherBudgetInfo getVoucherBudgetInfo() {
		return this.voucherBudgetInfo;
	}
	public void setVoucherBudgetInfo(PaymentVoucherBudgetInfo voucherBudgetInfo) {
		this.voucherBudgetInfo = voucherBudgetInfo;
	}

	public VoucherBudgetSupplyInfo getVoucherBudgetSupplyInfo() {
		return this.voucherBudgetSupplyInfo;
	}
	public void setVoucherBudgetSupplyInfo(VoucherBudgetSupplyInfo voucherBudgetSupplyInfo) {
		this.voucherBudgetSupplyInfo = voucherBudgetSupplyInfo;
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

	public PaymentVoucherDisplayInfo getVoucherDisplayInfo() {
		return this.voucherDisplayInfo;
	}
	public void setVoucherDisplayInfo(PaymentVoucherDisplayInfo voucherDisplayInfo) {
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

	public PaymentVoucherSendRule getVoucherSendRule() {
		return this.voucherSendRule;
	}
	public void setVoucherSendRule(PaymentVoucherSendRule voucherSendRule) {
		this.voucherSendRule = voucherSendRule;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public PaymentVoucherUseRule getVoucherUseRule() {
		return this.voucherUseRule;
	}
	public void setVoucherUseRule(PaymentVoucherUseRule voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}

	public VoucherUseRuleInfo getVoucherUseRuleInfo() {
		return this.voucherUseRuleInfo;
	}
	public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
		this.voucherUseRuleInfo = voucherUseRuleInfo;
	}

}
