package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业活动统计信息
 *
 * @author auto create
 * @since 1.0, 2016-09-01 13:14:46
 */
public class MallIndustryEventStatistics extends AlipayObject {

	private static final long serialVersionUID = 7375345933158623895L;

	/**
	 * 业务日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 活动名称
	 */
	@ApiField("camp_name")
	private String campName;

	/**
	 * 行业ID
	 */
	@ApiField("cate_1_id")
	private String cate1Id;

	/**
	 * 行业名称
	 */
	@ApiField("cate_1_name")
	private String cate1Name;

	/**
	 * 30天新增会员数
	 */
	@ApiField("recent_30d_campaign_new_user_cnt")
	private String recent30dCampaignNewUserCnt;

	/**
	 * 30天活动收益金额
	 */
	@ApiField("recent_30d_campaign_trade_amt")
	private String recent30dCampaignTradeAmt;

	/**
	 * 30天核券量
	 */
	@ApiField("recent_30d_used_cnt")
	private String recent30dUsedCnt;

	/**
	 * 30天核券人数
	 */
	@ApiField("recent_30d_used_user_cnt")
	private String recent30dUsedUserCnt;

	/**
	 * 7天新增会员数
	 */
	@ApiField("recent_7d_campaign_new_user_cnt")
	private String recent7dCampaignNewUserCnt;

	/**
	 * 7天活动收益金额
	 */
	@ApiField("recent_7d_campaign_trade_amt")
	private String recent7dCampaignTradeAmt;

	/**
	 * 7天核券量
	 */
	@ApiField("recent_7d_used_cnt")
	private String recent7dUsedCnt;

	/**
	 * 7天核券人数
	 */
	@ApiField("recent_7d_used_user_cnt")
	private String recent7dUsedUserCnt;

	/**
	 * 90天新增会员数
	 */
	@ApiField("recent_90d_campaign_new_user_cnt")
	private String recent90dCampaignNewUserCnt;

	/**
	 * 90天活动收益金额
	 */
	@ApiField("recent_90d_campaign_trade_amt")
	private String recent90dCampaignTradeAmt;

	/**
	 * 90天核券量
	 */
	@ApiField("recent_90d_used_cnt")
	private String recent90dUsedCnt;

	/**
	 * 90天核券人数
	 */
	@ApiField("recent_90d_used_user_cnt")
	private String recent90dUsedUserCnt;

	/**
	 * 新增会员数
	 */
	@ApiField("today_campaign_new_user_cnt")
	private String todayCampaignNewUserCnt;

	/**
	 * 活动收益金额
	 */
	@ApiField("today_campaign_trade_amt")
	private String todayCampaignTradeAmt;

	/**
	 * 核券量
	 */
	@ApiField("today_used_cnt")
	private String todayUsedCnt;

	/**
	 * 核券人数
	 */
	@ApiField("today_used_user_cnt")
	private String todayUsedUserCnt;

	/**
	 * 累计行业增会员数
	 */
	@ApiField("total_campaign_new_user_cnt")
	private String totalCampaignNewUserCnt;

	/**
	 * 累计行业收益金额
	 */
	@ApiField("total_campaign_trade_amt")
	private String totalCampaignTradeAmt;

	/**
	 * 累计行业核券量
	 */
	@ApiField("total_used_cnt")
	private String totalUsedCnt;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getCampName() {
		return this.campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}

	public String getCate1Id() {
		return this.cate1Id;
	}
	public void setCate1Id(String cate1Id) {
		this.cate1Id = cate1Id;
	}

	public String getCate1Name() {
		return this.cate1Name;
	}
	public void setCate1Name(String cate1Name) {
		this.cate1Name = cate1Name;
	}

	public String getRecent30dCampaignNewUserCnt() {
		return this.recent30dCampaignNewUserCnt;
	}
	public void setRecent30dCampaignNewUserCnt(String recent30dCampaignNewUserCnt) {
		this.recent30dCampaignNewUserCnt = recent30dCampaignNewUserCnt;
	}

	public String getRecent30dCampaignTradeAmt() {
		return this.recent30dCampaignTradeAmt;
	}
	public void setRecent30dCampaignTradeAmt(String recent30dCampaignTradeAmt) {
		this.recent30dCampaignTradeAmt = recent30dCampaignTradeAmt;
	}

	public String getRecent30dUsedCnt() {
		return this.recent30dUsedCnt;
	}
	public void setRecent30dUsedCnt(String recent30dUsedCnt) {
		this.recent30dUsedCnt = recent30dUsedCnt;
	}

	public String getRecent30dUsedUserCnt() {
		return this.recent30dUsedUserCnt;
	}
	public void setRecent30dUsedUserCnt(String recent30dUsedUserCnt) {
		this.recent30dUsedUserCnt = recent30dUsedUserCnt;
	}

	public String getRecent7dCampaignNewUserCnt() {
		return this.recent7dCampaignNewUserCnt;
	}
	public void setRecent7dCampaignNewUserCnt(String recent7dCampaignNewUserCnt) {
		this.recent7dCampaignNewUserCnt = recent7dCampaignNewUserCnt;
	}

	public String getRecent7dCampaignTradeAmt() {
		return this.recent7dCampaignTradeAmt;
	}
	public void setRecent7dCampaignTradeAmt(String recent7dCampaignTradeAmt) {
		this.recent7dCampaignTradeAmt = recent7dCampaignTradeAmt;
	}

	public String getRecent7dUsedCnt() {
		return this.recent7dUsedCnt;
	}
	public void setRecent7dUsedCnt(String recent7dUsedCnt) {
		this.recent7dUsedCnt = recent7dUsedCnt;
	}

	public String getRecent7dUsedUserCnt() {
		return this.recent7dUsedUserCnt;
	}
	public void setRecent7dUsedUserCnt(String recent7dUsedUserCnt) {
		this.recent7dUsedUserCnt = recent7dUsedUserCnt;
	}

	public String getRecent90dCampaignNewUserCnt() {
		return this.recent90dCampaignNewUserCnt;
	}
	public void setRecent90dCampaignNewUserCnt(String recent90dCampaignNewUserCnt) {
		this.recent90dCampaignNewUserCnt = recent90dCampaignNewUserCnt;
	}

	public String getRecent90dCampaignTradeAmt() {
		return this.recent90dCampaignTradeAmt;
	}
	public void setRecent90dCampaignTradeAmt(String recent90dCampaignTradeAmt) {
		this.recent90dCampaignTradeAmt = recent90dCampaignTradeAmt;
	}

	public String getRecent90dUsedCnt() {
		return this.recent90dUsedCnt;
	}
	public void setRecent90dUsedCnt(String recent90dUsedCnt) {
		this.recent90dUsedCnt = recent90dUsedCnt;
	}

	public String getRecent90dUsedUserCnt() {
		return this.recent90dUsedUserCnt;
	}
	public void setRecent90dUsedUserCnt(String recent90dUsedUserCnt) {
		this.recent90dUsedUserCnt = recent90dUsedUserCnt;
	}

	public String getTodayCampaignNewUserCnt() {
		return this.todayCampaignNewUserCnt;
	}
	public void setTodayCampaignNewUserCnt(String todayCampaignNewUserCnt) {
		this.todayCampaignNewUserCnt = todayCampaignNewUserCnt;
	}

	public String getTodayCampaignTradeAmt() {
		return this.todayCampaignTradeAmt;
	}
	public void setTodayCampaignTradeAmt(String todayCampaignTradeAmt) {
		this.todayCampaignTradeAmt = todayCampaignTradeAmt;
	}

	public String getTodayUsedCnt() {
		return this.todayUsedCnt;
	}
	public void setTodayUsedCnt(String todayUsedCnt) {
		this.todayUsedCnt = todayUsedCnt;
	}

	public String getTodayUsedUserCnt() {
		return this.todayUsedUserCnt;
	}
	public void setTodayUsedUserCnt(String todayUsedUserCnt) {
		this.todayUsedUserCnt = todayUsedUserCnt;
	}

	public String getTotalCampaignNewUserCnt() {
		return this.totalCampaignNewUserCnt;
	}
	public void setTotalCampaignNewUserCnt(String totalCampaignNewUserCnt) {
		this.totalCampaignNewUserCnt = totalCampaignNewUserCnt;
	}

	public String getTotalCampaignTradeAmt() {
		return this.totalCampaignTradeAmt;
	}
	public void setTotalCampaignTradeAmt(String totalCampaignTradeAmt) {
		this.totalCampaignTradeAmt = totalCampaignTradeAmt;
	}

	public String getTotalUsedCnt() {
		return this.totalUsedCnt;
	}
	public void setTotalUsedCnt(String totalUsedCnt) {
		this.totalUsedCnt = totalUsedCnt;
	}

}
