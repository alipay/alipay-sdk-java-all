package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.quest.instance.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:07
 */
public class AlipaySocialBaseQuestInstanceSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 4232647889352159274L;

	/** 
	 * 今日打卡次数
	 */
	@ApiField("daily_count")
	private Long dailyCount;

	/** 
	 * 打卡总天数
	 */
	@ApiField("mark_amount")
	private Long markAmount;

	/** 
	 * 打卡时间戳
	 */
	@ApiField("mark_time")
	private Long markTime;

	/** 
	 * 打卡成功文案
	 */
	@ApiField("mark_tip")
	private String markTip;

	public void setDailyCount(Long dailyCount) {
		this.dailyCount = dailyCount;
	}
	public Long getDailyCount( ) {
		return this.dailyCount;
	}

	public void setMarkAmount(Long markAmount) {
		this.markAmount = markAmount;
	}
	public Long getMarkAmount( ) {
		return this.markAmount;
	}

	public void setMarkTime(Long markTime) {
		this.markTime = markTime;
	}
	public Long getMarkTime( ) {
		return this.markTime;
	}

	public void setMarkTip(String markTip) {
		this.markTip = markTip;
	}
	public String getMarkTip( ) {
		return this.markTip;
	}

}
