package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商圈的交易的统计信息（行业粒度）
 *
 * @author auto create
 * @since 1.0, 2016-09-01 13:14:46
 */
public class MallIndustryTradeStatistics extends AlipayObject {

	private static final long serialVersionUID = 5326361829774693629L;

	/**
	 * 业务日期
	 */
	@ApiField("biz_date")
	private String bizDate;

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
	 * 最近30天行业活动收益金额
	 */
	@ApiField("recent_30d_campaign_trade_amt")
	private String recent30dCampaignTradeAmt;

	/**
	 * 最近30天行业活动交易笔数
	 */
	@ApiField("recent_30d_campaign_trade_cnt")
	private String recent30dCampaignTradeCnt;

	/**
	 * 最近30天行业收益金额
	 */
	@ApiField("recent_30d_trade_amt")
	private String recent30dTradeAmt;

	/**
	 * 最近30天行业交易笔数
	 */
	@ApiField("recent_30d_trade_user_cnt")
	private String recent30dTradeUserCnt;

	/**
	 * 最近7天行业活动收益金额
	 */
	@ApiField("recent_7d_campaign_trade_amt")
	private String recent7dCampaignTradeAmt;

	/**
	 * 最近7天行业活动交易笔数
	 */
	@ApiField("recent_7d_campaign_trade_cnt")
	private String recent7dCampaignTradeCnt;

	/**
	 * 最近7天行业收益金额
	 */
	@ApiField("recent_7d_trade_amt")
	private String recent7dTradeAmt;

	/**
	 * 最近7天行业交易会员数
	 */
	@ApiField("recent_7d_trade_user_cnt")
	private String recent7dTradeUserCnt;

	/**
	 * 最近90天行业活动收益金额
	 */
	@ApiField("recent_90d_campaign_trade_amt")
	private String recent90dCampaignTradeAmt;

	/**
	 * 最近90天行业活动交易笔数
	 */
	@ApiField("recent_90d_campaign_trade_cnt")
	private String recent90dCampaignTradeCnt;

	/**
	 * 最近90天行业收益金额
	 */
	@ApiField("recent_90d_trade_amt")
	private String recent90dTradeAmt;

	/**
	 * 最近90天行业交易笔数
	 */
	@ApiField("recent_90d_trade_cnt")
	private String recent90dTradeCnt;

	/**
	 * 行业活动收益金额
	 */
	@ApiField("today_campaign_trade_amt")
	private String todayCampaignTradeAmt;

	/**
	 * 行业活动交易笔数
	 */
	@ApiListField("today_campaign_trade_cnt")
	@ApiField("string")
	private List<String> todayCampaignTradeCnt;

	/**
	 * 行业收益金额
	 */
	@ApiField("today_trade_amt")
	private String todayTradeAmt;

	/**
	 * 行业交易笔数
	 */
	@ApiField("today_trade_cnt")
	private String todayTradeCnt;

	/**
	 * 今日交易会员数
	 */
	@ApiField("today_trade_user_cnt")
	private String todayTradeUserCnt;

	/**
	 * 累计行业活动收益金额
	 */
	@ApiField("total_campaign_trade_amt")
	private String totalCampaignTradeAmt;

	/**
	 * 累计行业活动交易笔数
	 */
	@ApiField("total_campaign_trade_cnt")
	private String totalCampaignTradeCnt;

	/**
	 * 累计行业收益金额
	 */
	@ApiField("total_trade_amt")
	private String totalTradeAmt;

	/**
	 * 累计行业交易笔数
	 */
	@ApiField("total_trade_cnt")
	private String totalTradeCnt;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
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

	public String getRecent30dCampaignTradeAmt() {
		return this.recent30dCampaignTradeAmt;
	}
	public void setRecent30dCampaignTradeAmt(String recent30dCampaignTradeAmt) {
		this.recent30dCampaignTradeAmt = recent30dCampaignTradeAmt;
	}

	public String getRecent30dCampaignTradeCnt() {
		return this.recent30dCampaignTradeCnt;
	}
	public void setRecent30dCampaignTradeCnt(String recent30dCampaignTradeCnt) {
		this.recent30dCampaignTradeCnt = recent30dCampaignTradeCnt;
	}

	public String getRecent30dTradeAmt() {
		return this.recent30dTradeAmt;
	}
	public void setRecent30dTradeAmt(String recent30dTradeAmt) {
		this.recent30dTradeAmt = recent30dTradeAmt;
	}

	public String getRecent30dTradeUserCnt() {
		return this.recent30dTradeUserCnt;
	}
	public void setRecent30dTradeUserCnt(String recent30dTradeUserCnt) {
		this.recent30dTradeUserCnt = recent30dTradeUserCnt;
	}

	public String getRecent7dCampaignTradeAmt() {
		return this.recent7dCampaignTradeAmt;
	}
	public void setRecent7dCampaignTradeAmt(String recent7dCampaignTradeAmt) {
		this.recent7dCampaignTradeAmt = recent7dCampaignTradeAmt;
	}

	public String getRecent7dCampaignTradeCnt() {
		return this.recent7dCampaignTradeCnt;
	}
	public void setRecent7dCampaignTradeCnt(String recent7dCampaignTradeCnt) {
		this.recent7dCampaignTradeCnt = recent7dCampaignTradeCnt;
	}

	public String getRecent7dTradeAmt() {
		return this.recent7dTradeAmt;
	}
	public void setRecent7dTradeAmt(String recent7dTradeAmt) {
		this.recent7dTradeAmt = recent7dTradeAmt;
	}

	public String getRecent7dTradeUserCnt() {
		return this.recent7dTradeUserCnt;
	}
	public void setRecent7dTradeUserCnt(String recent7dTradeUserCnt) {
		this.recent7dTradeUserCnt = recent7dTradeUserCnt;
	}

	public String getRecent90dCampaignTradeAmt() {
		return this.recent90dCampaignTradeAmt;
	}
	public void setRecent90dCampaignTradeAmt(String recent90dCampaignTradeAmt) {
		this.recent90dCampaignTradeAmt = recent90dCampaignTradeAmt;
	}

	public String getRecent90dCampaignTradeCnt() {
		return this.recent90dCampaignTradeCnt;
	}
	public void setRecent90dCampaignTradeCnt(String recent90dCampaignTradeCnt) {
		this.recent90dCampaignTradeCnt = recent90dCampaignTradeCnt;
	}

	public String getRecent90dTradeAmt() {
		return this.recent90dTradeAmt;
	}
	public void setRecent90dTradeAmt(String recent90dTradeAmt) {
		this.recent90dTradeAmt = recent90dTradeAmt;
	}

	public String getRecent90dTradeCnt() {
		return this.recent90dTradeCnt;
	}
	public void setRecent90dTradeCnt(String recent90dTradeCnt) {
		this.recent90dTradeCnt = recent90dTradeCnt;
	}

	public String getTodayCampaignTradeAmt() {
		return this.todayCampaignTradeAmt;
	}
	public void setTodayCampaignTradeAmt(String todayCampaignTradeAmt) {
		this.todayCampaignTradeAmt = todayCampaignTradeAmt;
	}

	public List<String> getTodayCampaignTradeCnt() {
		return this.todayCampaignTradeCnt;
	}
	public void setTodayCampaignTradeCnt(List<String> todayCampaignTradeCnt) {
		this.todayCampaignTradeCnt = todayCampaignTradeCnt;
	}

	public String getTodayTradeAmt() {
		return this.todayTradeAmt;
	}
	public void setTodayTradeAmt(String todayTradeAmt) {
		this.todayTradeAmt = todayTradeAmt;
	}

	public String getTodayTradeCnt() {
		return this.todayTradeCnt;
	}
	public void setTodayTradeCnt(String todayTradeCnt) {
		this.todayTradeCnt = todayTradeCnt;
	}

	public String getTodayTradeUserCnt() {
		return this.todayTradeUserCnt;
	}
	public void setTodayTradeUserCnt(String todayTradeUserCnt) {
		this.todayTradeUserCnt = todayTradeUserCnt;
	}

	public String getTotalCampaignTradeAmt() {
		return this.totalCampaignTradeAmt;
	}
	public void setTotalCampaignTradeAmt(String totalCampaignTradeAmt) {
		this.totalCampaignTradeAmt = totalCampaignTradeAmt;
	}

	public String getTotalCampaignTradeCnt() {
		return this.totalCampaignTradeCnt;
	}
	public void setTotalCampaignTradeCnt(String totalCampaignTradeCnt) {
		this.totalCampaignTradeCnt = totalCampaignTradeCnt;
	}

	public String getTotalTradeAmt() {
		return this.totalTradeAmt;
	}
	public void setTotalTradeAmt(String totalTradeAmt) {
		this.totalTradeAmt = totalTradeAmt;
	}

	public String getTotalTradeCnt() {
		return this.totalTradeCnt;
	}
	public void setTotalTradeCnt(String totalTradeCnt) {
		this.totalTradeCnt = totalTradeCnt;
	}

}
