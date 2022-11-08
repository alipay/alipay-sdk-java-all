package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO模板开通配置
 *
 * @author auto create
 * @since 1.0, 2022-09-13 11:30:44
 */
public class ZMGOOpenConfig extends AlipayObject {

	private static final long serialVersionUID = 3717589196811254914L;

	/**
	 * 固定到期时间或每月的第几日。 （1）当period_mode为APPOINT_DATE时，取值固定日期，如"2022-06-01 00:00:00"，表示协议在6月1号0点到期; （2）当period_mode为FIX_DATE，取值"3"，表示协议在period_time个月后的3号到期。
	 */
	@ApiField("appoint_date")
	private String appointDate;

	/**
	 * 芝麻GO卡颜色。 C_BLACK("C_BLACK", "黑色"), C_RED("C_RED", "红色"), C_GREEN("C_GREEN", "绿色"), C_LIGHT_BLUE("C_LIGHT_BLUE", "浅蓝色"), C_BLUE("C_BLUE", "蓝色"), C_ORANGE("C_ORANGE","橙色"), C_PURPLE("C_PURPLE", "紫色");
	 */
	@ApiField("card_color_scheme")
	private String cardColorScheme;

	/**
	 * 未完成任务规则详情
	 */
	@ApiField("custom_open_tip_list")
	private String customOpenTipList;

	/**
	 * 规则详情
	 */
	@ApiField("custom_open_tips")
	private String customOpenTips;

	/**
	 * 担保金额额度
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 用户签约间隔时间
	 */
	@ApiField("min_sign_interval")
	private String minSignInterval;

	/**
	 * 芝麻GO义务到期的计算方式。包括： RELATIVE_DATE("RELATIVE_DATE", "相对日期"), ABSOLATE_DATE("ABSOLATE_DATE", "绝对日期(当日开始计算)"), ABSOLUTE_PLUS_1_DATE("ABSOLUTE_PLUS_1_DATE", "绝对日期(次日开始计算)"), FIX_DATE("FIX_DATE", "固定日期"), APPOINT_DATE("APPOINT_DATE", "指定日期"),
	 */
	@ApiField("period_mode")
	private String periodMode;

	/**
	 * 周期时长
当period_mode为RELATIVE_DATE、ABSOLATE_DATE、ABSOLUTE_PLUS_1_DATE、FIX_DATE时必填
	 */
	@ApiField("period_time")
	private String periodTime;

	/**
	 * 是否展示签约完成页
	 */
	@ApiField("show_sign_success_page")
	private Boolean showSignSuccessPage;

	/**
	 * 签约完成页任务按钮描述，当展示签约完成页=true的时候 改内容必填
	 */
	@ApiField("sign_success_task_button_desc")
	private String signSuccessTaskButtonDesc;

	/**
	 * 是否支持延期特权
	 */
	@ApiField("support_expire_deferral")
	private Boolean supportExpireDeferral;

	public String getAppointDate() {
		return this.appointDate;
	}
	public void setAppointDate(String appointDate) {
		this.appointDate = appointDate;
	}

	public String getCardColorScheme() {
		return this.cardColorScheme;
	}
	public void setCardColorScheme(String cardColorScheme) {
		this.cardColorScheme = cardColorScheme;
	}

	public String getCustomOpenTipList() {
		return this.customOpenTipList;
	}
	public void setCustomOpenTipList(String customOpenTipList) {
		this.customOpenTipList = customOpenTipList;
	}

	public String getCustomOpenTips() {
		return this.customOpenTips;
	}
	public void setCustomOpenTips(String customOpenTips) {
		this.customOpenTips = customOpenTips;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public String getMinSignInterval() {
		return this.minSignInterval;
	}
	public void setMinSignInterval(String minSignInterval) {
		this.minSignInterval = minSignInterval;
	}

	public String getPeriodMode() {
		return this.periodMode;
	}
	public void setPeriodMode(String periodMode) {
		this.periodMode = periodMode;
	}

	public String getPeriodTime() {
		return this.periodTime;
	}
	public void setPeriodTime(String periodTime) {
		this.periodTime = periodTime;
	}

	public Boolean getShowSignSuccessPage() {
		return this.showSignSuccessPage;
	}
	public void setShowSignSuccessPage(Boolean showSignSuccessPage) {
		this.showSignSuccessPage = showSignSuccessPage;
	}

	public String getSignSuccessTaskButtonDesc() {
		return this.signSuccessTaskButtonDesc;
	}
	public void setSignSuccessTaskButtonDesc(String signSuccessTaskButtonDesc) {
		this.signSuccessTaskButtonDesc = signSuccessTaskButtonDesc;
	}

	public Boolean getSupportExpireDeferral() {
		return this.supportExpireDeferral;
	}
	public void setSupportExpireDeferral(Boolean supportExpireDeferral) {
		this.supportExpireDeferral = supportExpireDeferral;
	}

}
