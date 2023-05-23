package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ActivityBaseInfo;
import com.alipay.api.domain.UserVoucherBaseInfo;
import com.alipay.api.domain.VoucherDeductInfo;
import com.alipay.api.domain.CommonVoucherDisplayInfo;
import com.alipay.api.domain.VoucherDisplayPatternInfo;
import com.alipay.api.domain.VoucherSendModeInfo;
import com.alipay.api.domain.CommonVoucherSendRule;
import com.alipay.api.domain.CommonVoucherUseRule;
import com.alipay.api.domain.VoucherUseRuleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.user.queryvoucher response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-19 17:11:59
 */
public class AlipayMarketingActivityUserQueryvoucherResponse extends AlipayResponse {

	private static final long serialVersionUID = 5834197553445775258L;

	/** 
	 * 活动基础信息
	 */
	@ApiField("activity_base_info")
	private ActivityBaseInfo activityBaseInfo;

	/** 
	 * 活动 id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 若商家券操作过关联商户订单信息，则该字段返回商家券已关联的商户订单号。
	 */
	@ApiField("associate_trade_no")
	private String associateTradeNo;

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
	 * 券归属 pid
	 */
	@ApiField("belong_merchant_id")
	private String belongMerchantId;

	/** 
	 * 领券时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 券实例基础信息
	 */
	@ApiField("user_voucher_base_info")
	private UserVoucherBaseInfo userVoucherBaseInfo;

	/** 
	 * 券优惠信息
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
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/** 
	 * 券发放
	 */
	@ApiField("voucher_send_mode_info")
	private VoucherSendModeInfo voucherSendModeInfo;

	/** 
	 * 券发放规则
	 */
	@ApiField("voucher_send_rule")
	private CommonVoucherSendRule voucherSendRule;

	/** 
	 * 券状态。
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

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

	public void setAssociateTradeNo(String associateTradeNo) {
		this.associateTradeNo = associateTradeNo;
	}
	public String getAssociateTradeNo( ) {
		return this.associateTradeNo;
	}

	public void setAvailableBeginTime(Date availableBeginTime) {
		this.availableBeginTime = availableBeginTime;
	}
	public Date getAvailableBeginTime( ) {
		return this.availableBeginTime;
	}

	public void setAvailableEndTime(Date availableEndTime) {
		this.availableEndTime = availableEndTime;
	}
	public Date getAvailableEndTime( ) {
		return this.availableEndTime;
	}

	public void setBelongMerchantId(String belongMerchantId) {
		this.belongMerchantId = belongMerchantId;
	}
	public String getBelongMerchantId( ) {
		return this.belongMerchantId;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setUserVoucherBaseInfo(UserVoucherBaseInfo userVoucherBaseInfo) {
		this.userVoucherBaseInfo = userVoucherBaseInfo;
	}
	public UserVoucherBaseInfo getUserVoucherBaseInfo( ) {
		return this.userVoucherBaseInfo;
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

	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}
	public String getVoucherName( ) {
		return this.voucherName;
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

	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}
	public String getVoucherStatus( ) {
		return this.voucherStatus;
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
