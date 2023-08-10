package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ActivityBaseInfo;
import com.alipay.api.domain.BelongMerchantInfo;
import com.alipay.api.domain.CustomerGuide;
import com.alipay.api.domain.VoucherSummary;
import com.alipay.api.domain.VoucherAvailableScopeInfo;
import com.alipay.api.domain.VoucherCustomerGuideInfo;
import com.alipay.api.domain.VoucherDeductInfo;
import com.alipay.api.domain.VoucherDisplayInfo;
import com.alipay.api.domain.VoucherDisplayPatternInfo;
import com.alipay.api.domain.VoucherInventoryInfo;
import com.alipay.api.domain.VoucherSendModeInfo;
import com.alipay.api.domain.VoucherSendRuleDetail;
import com.alipay.api.domain.VoucherUseRule;
import com.alipay.api.domain.VoucherUseRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-18 22:22:03
 */
public class AlipayMarketingActivityOrdervoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1525521277988779835L;

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
	 * 活动名称。不对用户进行展示，仅供商家在后台管理活动使用。
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * 活动操作状态
	 */
	@ApiField("activity_operation_status")
	private String activityOperationStatus;

	/** 
	 * 活动状态。已激活状态代表活动正常运行，已终止状态代表商家终止活动，不可再发放。
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 活动所属的商户信息
	 */
	@ApiField("belong_merchant_info")
	private BelongMerchantInfo belongMerchantInfo;

	/** 
	 * 商家券业务标签，影响商家券对C端用户的展示形式。
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/** 
	 * 用户引导相关配置
	 */
	@ApiField("customer_guide")
	private CustomerGuide customerGuide;

	/** 
	 * 券发放结束时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/** 
	 * 券发放开始时间。格式为：yyyy-MM-dd HH:mm:ss
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
	 * 券展示信息
	 */
	@ApiField("voucher_display_info")
	private VoucherDisplayInfo voucherDisplayInfo;

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
	 * 券发放
	 */
	@ApiField("voucher_send_mode_info")
	private VoucherSendModeInfo voucherSendModeInfo;

	/** 
	 * 券发放规则
	 */
	@ApiField("voucher_send_rule")
	private VoucherSendRuleDetail voucherSendRule;

	/** 
	 * 券类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/** 
	 * 券使用规则
	 */
	@ApiField("voucher_use_rule")
	private VoucherUseRule voucherUseRule;

	/** 
	 * 券核销规则
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

	public void setActivityOperationStatus(String activityOperationStatus) {
		this.activityOperationStatus = activityOperationStatus;
	}
	public String getActivityOperationStatus( ) {
		return this.activityOperationStatus;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setBelongMerchantInfo(BelongMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}
	public BelongMerchantInfo getBelongMerchantInfo( ) {
		return this.belongMerchantInfo;
	}

	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}
	public String getBizTag( ) {
		return this.bizTag;
	}

	public void setCustomerGuide(CustomerGuide customerGuide) {
		this.customerGuide = customerGuide;
	}
	public CustomerGuide getCustomerGuide( ) {
		return this.customerGuide;
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

	public void setVoucherDisplayInfo(VoucherDisplayInfo voucherDisplayInfo) {
		this.voucherDisplayInfo = voucherDisplayInfo;
	}
	public VoucherDisplayInfo getVoucherDisplayInfo( ) {
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

	public void setVoucherSendRule(VoucherSendRuleDetail voucherSendRule) {
		this.voucherSendRule = voucherSendRule;
	}
	public VoucherSendRuleDetail getVoucherSendRule( ) {
		return this.voucherSendRule;
	}

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	public String getVoucherType( ) {
		return this.voucherType;
	}

	public void setVoucherUseRule(VoucherUseRule voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}
	public VoucherUseRule getVoucherUseRule( ) {
		return this.voucherUseRule;
	}

	public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
		this.voucherUseRuleInfo = voucherUseRuleInfo;
	}
	public VoucherUseRuleInfo getVoucherUseRuleInfo( ) {
		return this.voucherUseRuleInfo;
	}

}
