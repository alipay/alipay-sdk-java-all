package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CommonVoucherDisplayInfo;
import com.alipay.api.domain.CommonVoucherSendRule;
import com.alipay.api.domain.CommonVoucherUseRule;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.user.queryvoucher response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 23:35:39
 */
public class AlipayMarketingActivityUserQueryvoucherResponse extends AlipayResponse {

	private static final long serialVersionUID = 8531915463823647195L;

	/** 
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 可用开始时间
	 */
	@ApiField("available_begin_time")
	private Date availableBeginTime;

	/** 
	 * 可用结束时间
	 */
	@ApiField("available_end_time")
	private Date availableEndTime;

	/** 
	 * 券归属pid
	 */
	@ApiField("belong_merchant_id")
	private String belongMerchantId;

	/** 
	 * 领券时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 券展示信息
	 */
	@ApiField("voucher_display_info")
	private CommonVoucherDisplayInfo voucherDisplayInfo;

	/** 
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/** 
	 * 券发放规则
	 */
	@ApiField("voucher_send_rule")
	private CommonVoucherSendRule voucherSendRule;

	/** 
	 * 券状态： 
枚举值:
SENDED:可用
USED:已核销(即完全使用),
EXPIRED:已过期(只能查询6个月内数据)
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	/** 
	 * 券类型。 枚举值： FIX_VOUCHER：满减券； DISCOUNT_VOUCHER：折扣券； SPECIAL_VOUCHER：特价券； EXCHANGE_VOUCHER: 兑换券；
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/** 
	 * 券核销规则
	 */
	@ApiField("voucher_use_rule")
	private CommonVoucherUseRule voucherUseRule;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
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

	public void setVoucherDisplayInfo(CommonVoucherDisplayInfo voucherDisplayInfo) {
		this.voucherDisplayInfo = voucherDisplayInfo;
	}
	public CommonVoucherDisplayInfo getVoucherDisplayInfo( ) {
		return this.voucherDisplayInfo;
	}

	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}
	public String getVoucherName( ) {
		return this.voucherName;
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

}
