package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈的会员的统计信息（行业粒度）
 *
 * @author auto create
 * @since 1.0, 2016-09-01 13:14:46
 */
public class MallIndustryMemberStatistics extends AlipayObject {

	private static final long serialVersionUID = 5621373136868719175L;

	/**
	 * 业务日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 行业id
	 */
	@ApiField("cate_1_id")
	private String cate1Id;

	/**
	 * 行业名称
	 */
	@ApiField("cate_1_name")
	private String cate1Name;

	/**
	 * 最近30天新增会员数
	 */
	@ApiField("recent_30d_new_user_cnt")
	private String recent30dNewUserCnt;

	/**
	 * 最近7天新增会员数
	 */
	@ApiField("recent_7d_new_user_cnt")
	private String recent7dNewUserCnt;

	/**
	 * 最近90天新增会员数
	 */
	@ApiField("recent_90d_new_user_cnt")
	private String recent90dNewUserCnt;

	/**
	 * 活动新增会员数
	 */
	@ApiField("today_campaign_new_user_cnt")
	private String todayCampaignNewUserCnt;

	/**
	 * 行业新增会员数
	 */
	@ApiField("today_new_user_cnt")
	private String todayNewUserCnt;

	/**
	 * 累计会员数
	 */
	@ApiField("total_user_cnt")
	private String totalUserCnt;

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

	public String getRecent30dNewUserCnt() {
		return this.recent30dNewUserCnt;
	}
	public void setRecent30dNewUserCnt(String recent30dNewUserCnt) {
		this.recent30dNewUserCnt = recent30dNewUserCnt;
	}

	public String getRecent7dNewUserCnt() {
		return this.recent7dNewUserCnt;
	}
	public void setRecent7dNewUserCnt(String recent7dNewUserCnt) {
		this.recent7dNewUserCnt = recent7dNewUserCnt;
	}

	public String getRecent90dNewUserCnt() {
		return this.recent90dNewUserCnt;
	}
	public void setRecent90dNewUserCnt(String recent90dNewUserCnt) {
		this.recent90dNewUserCnt = recent90dNewUserCnt;
	}

	public String getTodayCampaignNewUserCnt() {
		return this.todayCampaignNewUserCnt;
	}
	public void setTodayCampaignNewUserCnt(String todayCampaignNewUserCnt) {
		this.todayCampaignNewUserCnt = todayCampaignNewUserCnt;
	}

	public String getTodayNewUserCnt() {
		return this.todayNewUserCnt;
	}
	public void setTodayNewUserCnt(String todayNewUserCnt) {
		this.todayNewUserCnt = todayNewUserCnt;
	}

	public String getTotalUserCnt() {
		return this.totalUserCnt;
	}
	public void setTotalUserCnt(String totalUserCnt) {
		this.totalUserCnt = totalUserCnt;
	}

}
