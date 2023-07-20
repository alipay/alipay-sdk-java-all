package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建订单券
 *
 * @author auto create
 * @since 1.0, 2023-07-16 21:25:18
 */
public class AlipayMarketingActivityOrdervoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3523781343915545179L;

	/**
	 * 活动基础信息
	 */
	@ApiField("activity_base_info")
	private ActivityBaseInfo activityBaseInfo;

	/**
	 * 活动名称。不对用户进行展示，仅供商家在后台管理活动使用。
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 商家券活动归属的商户信息。说明：如果该复杂对象不填。则默认为该商家券活动的归属者是调用者本人。如果填写，则认为该商家券活动的归属者是该商户。
	 */
	@ApiField("belong_merchant_info")
	private BelongMerchantInfo belongMerchantInfo;

	/**
	 * 该字段废弃！后续不要使用该字段！商家券业务标签，影响商家券对C端用户的展示形式。
	 */
	@ApiField("biz_tag")
	private String bizTag;

	/**
	 * 码模式。MERCHANT_UPLOAD：商户上传自定义code，发券时系统随机选取上传的券code发放。MERCHANT_API：发奖时指定券码发奖，此模式无须提前上传券码。
	 */
	@ApiField("code_mode")
	private String codeMode;

	/**
	 * 自定义入口
	 */
	@ApiField("customer_guide")
	private CustomerGuide customerGuide;

	/**
	 * 商户接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 外部业务单号，用作幂等控制。
幂等作用：参数不变的情况下，再次请求返回与上一次相同的结果。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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
	 * 券可用范围
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
	private VoucherDisplayInfo voucherDisplayInfo;

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
	private VoucherSendRuleDetail voucherSendRule;

	/**
	 * 券类型。
兑换券仅支持一类券类型：EXCHANGE_VOUCHER: 兑换券；
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券核销规则
	 */
	@ApiField("voucher_use_rule")
	private VoucherUseRule voucherUseRule;

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

	public BelongMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(BelongMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public String getBizTag() {
		return this.bizTag;
	}
	public void setBizTag(String bizTag) {
		this.bizTag = bizTag;
	}

	public String getCodeMode() {
		return this.codeMode;
	}
	public void setCodeMode(String codeMode) {
		this.codeMode = codeMode;
	}

	public CustomerGuide getCustomerGuide() {
		return this.customerGuide;
	}
	public void setCustomerGuide(CustomerGuide customerGuide) {
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

	public VoucherDisplayInfo getVoucherDisplayInfo() {
		return this.voucherDisplayInfo;
	}
	public void setVoucherDisplayInfo(VoucherDisplayInfo voucherDisplayInfo) {
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

	public VoucherSendRuleDetail getVoucherSendRule() {
		return this.voucherSendRule;
	}
	public void setVoucherSendRule(VoucherSendRuleDetail voucherSendRule) {
		this.voucherSendRule = voucherSendRule;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public VoucherUseRule getVoucherUseRule() {
		return this.voucherUseRule;
	}
	public void setVoucherUseRule(VoucherUseRule voucherUseRule) {
		this.voucherUseRule = voucherUseRule;
	}

	public VoucherUseRuleInfo getVoucherUseRuleInfo() {
		return this.voucherUseRuleInfo;
	}
	public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
		this.voucherUseRuleInfo = voucherUseRuleInfo;
	}

}
