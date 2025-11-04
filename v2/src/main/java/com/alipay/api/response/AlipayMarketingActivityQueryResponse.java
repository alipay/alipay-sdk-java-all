package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ActivityBaseInfo;
import com.alipay.api.domain.VoucherAvailableScopeInfo;
import com.alipay.api.domain.VoucherCustomerGuideInfo;
import com.alipay.api.domain.VoucherDeductInfo;
import com.alipay.api.domain.CommonVoucherDisplayInfo;
import com.alipay.api.domain.VoucherDisplayPatternInfo;
import com.alipay.api.domain.VoucherSendModeInfo;
import com.alipay.api.domain.CommonVoucherSendRule;
import com.alipay.api.domain.CommonVoucherUseRule;
import com.alipay.api.domain.VoucherUseRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-06 15:17:09
 */
public class AlipayMarketingActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8519497866936892941L;

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
	 * 活动名称。 不对用户进行展示，仅供商家在后台管理活动使用。
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * 活动状态。活动已激活，表示活动已经生效，等到活动开始(publish_start_time)之后用户就可以参与活动。活动已暂停，表示商户临时暂停该活动，该状态下用户不能参与活动。活动已结束，表示商户主动停止活动或活动到期结束(publish_end_time)不能再进行领取或修改等操作。
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/** 
	 * 归属商户PID
	 */
	@ApiField("belong_merchant_id")
	private String belongMerchantId;

	/** 
	 * 券发放结束时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	/** 
	 * 券发放开始时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("publish_start_time")
	private Date publishStartTime;

	/** 
	 * 可用范围
	 */
	@ApiField("voucher_available_scope_info")
	private VoucherAvailableScopeInfo voucherAvailableScopeInfo;

	/** 
	 * 券引导详情
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
	private CommonVoucherDisplayInfo voucherDisplayInfo;

	/** 
	 * 券展示信息
	 */
	@ApiField("voucher_display_pattern_info")
	private VoucherDisplayPatternInfo voucherDisplayPatternInfo;

	/** 
	 * 券发放模式
	 */
	@ApiField("voucher_send_mode_info")
	private VoucherSendModeInfo voucherSendModeInfo;

	/** 
	 * 券发放规则
	 */
	@ApiField("voucher_send_rule")
	private CommonVoucherSendRule voucherSendRule;

	/** 
	 * 券类型。
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/** 
	 * 券核销规则
	 */
	@ApiField("voucher_use_rule")
	private CommonVoucherUseRule voucherUseRule;

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

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}
	public String getActivityStatus( ) {
		return this.activityStatus;
	}

	public void setBelongMerchantId(String belongMerchantId) {
		this.belongMerchantId = belongMerchantId;
	}
	public String getBelongMerchantId( ) {
		return this.belongMerchantId;
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

	public void setVoucherDisplayInfo(CommonVoucherDisplayInfo voucherDisplayInfo) {
		this.voucherDisplayInfo = voucherDisplayInfo;
	}
	public CommonVoucherDisplayInfo getVoucherDisplayInfo( ) {
		return this.voucherDisplayInfo;
	}

	public void setVoucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
		this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
	}
	public VoucherDisplayPatternInfo getVoucherDisplayPatternInfo( ) {
		return this.voucherDisplayPatternInfo;
	}

	public void setVoucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
		this.voucherSendModeInfo = voucherSendModeInfo;
	}
	public VoucherSendModeInfo getVoucherSendModeInfo( ) {
		return this.voucherSendModeInfo;
	}

	public void setVoucherSendRule(CommonVoucherSendRule voucherSendRule) {
		this.voucherSendRule = voucherSendRule;
	}
	public CommonVoucherSendRule getVoucherSendRule( ) {
		return this.voucherSendRule;
	}

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	public String getVoucherType( ) {
		return this.voucherType;
	}

	public void setVoucherUseRule(CommonVoucherUseRule voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}
	public CommonVoucherUseRule getVoucherUseRule( ) {
		return this.voucherUseRule;
	}

	public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
		this.voucherUseRuleInfo = voucherUseRuleInfo;
	}
	public VoucherUseRuleInfo getVoucherUseRuleInfo( ) {
		return this.voucherUseRuleInfo;
	}

}
