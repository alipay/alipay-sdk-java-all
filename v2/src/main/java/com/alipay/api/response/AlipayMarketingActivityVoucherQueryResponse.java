package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ActivityBaseInfo;
import com.alipay.api.domain.PaymentVoucherBelongMerchantInfo;
import com.alipay.api.domain.VoucherSummary;
import com.alipay.api.domain.VoucherAvailableScopeInfo;
import com.alipay.api.domain.PaymentVoucherBudgetInfo;
import com.alipay.api.domain.VoucherBudgetSupplyInfo;
import com.alipay.api.domain.VoucherCustomerGuideInfo;
import com.alipay.api.domain.VoucherDeductInfo;
import com.alipay.api.domain.PaymentVoucherDisplayInfo;
import com.alipay.api.domain.VoucherDisplayPatternInfo;
import com.alipay.api.domain.VoucherInventoryInfo;
import com.alipay.api.domain.VoucherSendModeInfo;
import com.alipay.api.domain.PaymentVoucherSendRule;
import com.alipay.api.domain.PaymentVoucherUseRuleDetail;
import com.alipay.api.domain.VoucherUseRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.voucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-25 16:07:05
 */
public class AlipayMarketingActivityVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1232475365781769625L;

	/** 
	 * 活动基础信息
	 */
	@ApiField("activity_base_info")
	private ActivityBaseInfo activityBaseInfo;

	/** 
	 * 活动 ID
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 活动名称。 不对用户进行展示，仅供商家在后台管理活动使用。
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * 活动状态。
如果该值为空，说明活动还未创建成功。
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 归属商户信息
	 */
	@ApiField("belong_merchant_info")
	private PaymentVoucherBelongMerchantInfo belongMerchantInfo;

	/** 
	 * 券发放结束时间。 格式为：yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/** 
	 * 券发放开始时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/** 
	 * 券汇总信息
	 */
	@ApiField("summary")
	private VoucherSummary summary;

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
	 * 券库存信息
	 */
	@ApiField("voucher_inventory_info")
	private VoucherInventoryInfo voucherInventoryInfo;

	/** 
	 * 券发放详情
	 */
	@ApiField("voucher_send_mode_info")
	private VoucherSendModeInfo voucherSendModeInfo;

	/** 
	 * 券发放规则
	 */
	@ApiField("voucher_send_rule")
	private PaymentVoucherSendRule voucherSendRule;

	/** 
	 * 优惠类型。
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/** 
	 * 支付券核销规则
	 */
	@ApiField("voucher_use_rule")
	private PaymentVoucherUseRuleDetail voucherUseRule;

	/** 
	 * 券核销限制
	 */
	@ApiField("voucher_use_rule_info")
	private VoucherUseRuleInfo voucherUseRuleInfo;

	public void setActivityBaseInfo(ActivityBaseInfo activityBaseInfo) {
		this.activityBaseInfo = activityBaseInfo;
	}
	public ActivityBaseInfo getActivityBaseInfo( ) {
		return this.activityBaseInfo;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityName( ) {
		return this.activityName;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setBelongMerchantInfo(PaymentVoucherBelongMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}
	public PaymentVoucherBelongMerchantInfo getBelongMerchantInfo( ) {
		return this.belongMerchantInfo;
	}

	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}
	public Date getPublishEndTime( ) {
		return this.publishEndTime;
	}

	public void setPublishStartTime(Date publishStartTime) {
		this.publishStartTime = publishStartTime;
	}
	public Date getPublishStartTime( ) {
		return this.publishStartTime;
	}

	public void setSummary(VoucherSummary summary) {
		this.summary = summary;
	}
	public VoucherSummary getSummary( ) {
		return this.summary;
	}

	public void setVoucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
		this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
	}
	public VoucherAvailableScopeInfo getVoucherAvailableScopeInfo( ) {
		return this.voucherAvailableScopeInfo;
	}

	public void setVoucherBudgetInfo(PaymentVoucherBudgetInfo voucherBudgetInfo) {
		this.voucherBudgetInfo = voucherBudgetInfo;
	}
	public PaymentVoucherBudgetInfo getVoucherBudgetInfo( ) {
		return this.voucherBudgetInfo;
	}

	public void setVoucherBudgetSupplyInfo(VoucherBudgetSupplyInfo voucherBudgetSupplyInfo) {
		this.voucherBudgetSupplyInfo = voucherBudgetSupplyInfo;
	}
	public VoucherBudgetSupplyInfo getVoucherBudgetSupplyInfo( ) {
		return this.voucherBudgetSupplyInfo;
	}

	public void setVoucherCustomerGuideInfo(VoucherCustomerGuideInfo voucherCustomerGuideInfo) {
		this.voucherCustomerGuideInfo = voucherCustomerGuideInfo;
	}
	public VoucherCustomerGuideInfo getVoucherCustomerGuideInfo( ) {
		return this.voucherCustomerGuideInfo;
	}

	public void setVoucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
		this.voucherDeductInfo = voucherDeductInfo;
	}
	public VoucherDeductInfo getVoucherDeductInfo( ) {
		return this.voucherDeductInfo;
	}

	public void setVoucherDisplayInfo(PaymentVoucherDisplayInfo voucherDisplayInfo) {
		this.voucherDisplayInfo = voucherDisplayInfo;
	}
	public PaymentVoucherDisplayInfo getVoucherDisplayInfo( ) {
		return this.voucherDisplayInfo;
	}

	public void setVoucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
		this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
	}
	public VoucherDisplayPatternInfo getVoucherDisplayPatternInfo( ) {
		return this.voucherDisplayPatternInfo;
	}

	public void setVoucherInventoryInfo(VoucherInventoryInfo voucherInventoryInfo) {
		this.voucherInventoryInfo = voucherInventoryInfo;
	}
	public VoucherInventoryInfo getVoucherInventoryInfo( ) {
		return this.voucherInventoryInfo;
	}

	public void setVoucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
		this.voucherSendModeInfo = voucherSendModeInfo;
	}
	public VoucherSendModeInfo getVoucherSendModeInfo( ) {
		return this.voucherSendModeInfo;
	}

	public void setVoucherSendRule(PaymentVoucherSendRule voucherSendRule) {
		this.voucherSendRule = voucherSendRule;
	}
	public PaymentVoucherSendRule getVoucherSendRule( ) {
		return this.voucherSendRule;
	}

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	public String getVoucherType( ) {
		return this.voucherType;
	}

	public void setVoucherUseRule(PaymentVoucherUseRuleDetail voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}
	public PaymentVoucherUseRuleDetail getVoucherUseRule( ) {
		return this.voucherUseRule;
	}

	public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
		this.voucherUseRuleInfo = voucherUseRuleInfo;
	}
	public VoucherUseRuleInfo getVoucherUseRuleInfo( ) {
		return this.voucherUseRuleInfo;
	}

}
