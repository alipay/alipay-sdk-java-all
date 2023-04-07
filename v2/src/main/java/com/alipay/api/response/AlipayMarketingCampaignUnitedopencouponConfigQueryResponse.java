package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UnitedVoucherDigest;
import com.alipay.api.domain.UnitedCountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.unitedopencoupon.config.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 00:21:43
 */
public class AlipayMarketingCampaignUnitedopencouponConfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5768697647112953636L;

	/** 
	 * 是否绑定手机号。（只有活动规则上配置要求绑定手机号且当前用户未绑定手机号情况下该字段才会返回false，其余情况下不返回或者返回为空（null）
	 */
	@ApiField("bind_phone")
	private Boolean bindPhone;

	/** 
	 * 活动结束时间
	 */
	@ApiField("camp_end_time")
	private Date campEndTime;

	/** 
	 * 活动开始时间
	 */
	@ApiField("camp_start_time")
	private Date campStartTime;

	/** 
	 * 活动状态
	 */
	@ApiField("camp_status")
	private String campStatus;

	/** 
	 * 是否已经领取过
	 */
	@ApiField("has_receive")
	private Boolean hasReceive;

	/** 
	 * 用户支付宝登录号（脱敏）
	 */
	@ApiField("login_id")
	private String loginId;

	/** 
	 * 有预算情况下是否必中奖，即区分抽奖模式还是领奖模式 true为抽奖模式（有预算情况下不是必中奖），false为领奖模式（有预算情况下必中奖）
	 */
	@ApiField("lottery_mode")
	private Boolean lotteryMode;

	/** 
	 * 是否实名认证（只有活动规则上配置需要验证实名，且当前用户不满足该规则时才会返回false，其余情况默认不返回或者返回为null）
	 */
	@ApiField("real_name_auth")
	private Boolean realNameAuth;

	/** 
	 * 是否剩余预算
	 */
	@ApiField("remain_budget")
	private Boolean remainBudget;

	/** 
	 * 是否是风险用户
	 */
	@ApiField("risk_user")
	private Boolean riskUser;

	/** 
	 * 今日是否已领取过
	 */
	@ApiField("today_has_receive")
	private Boolean todayHasReceive;

	/** 
	 * 券配置信息列表
	 */
	@ApiField("voucher_digests")
	private UnitedVoucherDigest voucherDigests;

	/** 
	 * 用户支付宝账号(UID)维度的中奖计次信息
	 */
	@ApiField("win_count_info")
	private UnitedCountInfo winCountInfo;

	/** 
	 * 支付宝账号(UID)维度是否可领奖
	 */
	@ApiField("win_enable")
	private Boolean winEnable;

	public void setBindPhone(Boolean bindPhone) {
		this.bindPhone = bindPhone;
	}
	public Boolean getBindPhone( ) {
		return this.bindPhone;
	}

	public void setCampEndTime(Date campEndTime) {
		this.campEndTime = campEndTime;
	}
	public Date getCampEndTime( ) {
		return this.campEndTime;
	}

	public void setCampStartTime(Date campStartTime) {
		this.campStartTime = campStartTime;
	}
	public Date getCampStartTime( ) {
		return this.campStartTime;
	}

	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}
	public String getCampStatus( ) {
		return this.campStatus;
	}

	public void setHasReceive(Boolean hasReceive) {
		this.hasReceive = hasReceive;
	}
	public Boolean getHasReceive( ) {
		return this.hasReceive;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginId( ) {
		return this.loginId;
	}

	public void setLotteryMode(Boolean lotteryMode) {
		this.lotteryMode = lotteryMode;
	}
	public Boolean getLotteryMode( ) {
		return this.lotteryMode;
	}

	public void setRealNameAuth(Boolean realNameAuth) {
		this.realNameAuth = realNameAuth;
	}
	public Boolean getRealNameAuth( ) {
		return this.realNameAuth;
	}

	public void setRemainBudget(Boolean remainBudget) {
		this.remainBudget = remainBudget;
	}
	public Boolean getRemainBudget( ) {
		return this.remainBudget;
	}

	public void setRiskUser(Boolean riskUser) {
		this.riskUser = riskUser;
	}
	public Boolean getRiskUser( ) {
		return this.riskUser;
	}

	public void setTodayHasReceive(Boolean todayHasReceive) {
		this.todayHasReceive = todayHasReceive;
	}
	public Boolean getTodayHasReceive( ) {
		return this.todayHasReceive;
	}

	public void setVoucherDigests(UnitedVoucherDigest voucherDigests) {
		this.voucherDigests = voucherDigests;
	}
	public UnitedVoucherDigest getVoucherDigests( ) {
		return this.voucherDigests;
	}

	public void setWinCountInfo(UnitedCountInfo winCountInfo) {
		this.winCountInfo = winCountInfo;
	}
	public UnitedCountInfo getWinCountInfo( ) {
		return this.winCountInfo;
	}

	public void setWinEnable(Boolean winEnable) {
		this.winEnable = winEnable;
	}
	public Boolean getWinEnable( ) {
		return this.winEnable;
	}

}
