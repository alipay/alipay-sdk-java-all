package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.HbmtActivityInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditbenefit.huabeijin.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-09 17:12:58
 */
public class AlipayPcreditHuabeiPcreditbenefitHuabeijinPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5674451281431646637L;

	/** 
	 * 包含了花呗金反活动信息，如活动id，开始时间结束时间，反花呗金比例等
	 */
	@ApiField("activity_info")
	private HbmtActivityInfoVO activityInfo;

	/** 
	 * already_triggered 表示该用户在当前活动中是否已经成功领取过奖品,true表示已经领取过，false反之
	 */
	@ApiField("already_triggered")
	private Boolean alreadyTriggered;

	/** 
	 * 精确可得花呗金数量，而不是可得花呗金范围，123个花呗金为1.23元，单位为分
	 */
	@ApiField("calculated_amount")
	private Long calculatedAmount;

	/** 
	 * 校验当前商户是否可享受这个活动，如果校验不可以享受该活动，不会计算可得花呗金
	 */
	@ApiField("can_participate")
	private Boolean canParticipate;

	/** 
	 * 用来说明该笔金额是否到达了单笔可反最大花呗金限制
	 */
	@ApiField("cap_applied")
	private Boolean capApplied;

	/** 
	 * 不同的业务码表示在花呗侧业务处理过程中的不同状态
	 */
	@ApiField("hb_biz_code")
	private String hbBizCode;

	/** 
	 * 模糊查询用户可得花呗金区间上限，没有开启精确预估花呗金开关时查询得到的用户可得花呗金区间上限
	 */
	@ApiField("max_calculated_amount")
	private Long maxCalculatedAmount;

	/** 
	 * 传入了试算金额但是没有打开精确预估花呗金开关时返回可得花呗金的下限
	 */
	@ApiField("min_calculated_amount")
	private Long minCalculatedAmount;

	public void setActivityInfo(HbmtActivityInfoVO activityInfo) {
		this.activityInfo = activityInfo;
	}
	public HbmtActivityInfoVO getActivityInfo( ) {
		return this.activityInfo;
	}

	public void setAlreadyTriggered(Boolean alreadyTriggered) {
		this.alreadyTriggered = alreadyTriggered;
	}
	public Boolean getAlreadyTriggered( ) {
		return this.alreadyTriggered;
	}

	public void setCalculatedAmount(Long calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}
	public Long getCalculatedAmount( ) {
		return this.calculatedAmount;
	}

	public void setCanParticipate(Boolean canParticipate) {
		this.canParticipate = canParticipate;
	}
	public Boolean getCanParticipate( ) {
		return this.canParticipate;
	}

	public void setCapApplied(Boolean capApplied) {
		this.capApplied = capApplied;
	}
	public Boolean getCapApplied( ) {
		return this.capApplied;
	}

	public void setHbBizCode(String hbBizCode) {
		this.hbBizCode = hbBizCode;
	}
	public String getHbBizCode( ) {
		return this.hbBizCode;
	}

	public void setMaxCalculatedAmount(Long maxCalculatedAmount) {
		this.maxCalculatedAmount = maxCalculatedAmount;
	}
	public Long getMaxCalculatedAmount( ) {
		return this.maxCalculatedAmount;
	}

	public void setMinCalculatedAmount(Long minCalculatedAmount) {
		this.minCalculatedAmount = minCalculatedAmount;
	}
	public Long getMinCalculatedAmount( ) {
		return this.minCalculatedAmount;
	}

}
