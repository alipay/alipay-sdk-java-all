package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序离线实时通用查询
 *
 * @author auto create
 * @since 1.0, 2019-06-03 10:42:23
 */
public class AlipayOpenMiniDataCommonQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7125932184196316476L;

	/**
	 * 开始日期
当biz_type为以下值时输入：
OFFLINE_TAPP_OVERALL_VIEW_TREAND
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * REALTIME_TAPP_DAY_VISIT(实时单个小程序今日访问指标：当天访问次数，访问人数)；
OFFLINE_TAPP_VOERALL_OVERVIEW(离线单个小程序整体概况：使用次数/人数，分享次数/人数，当日新增用户数，人均/次均停留时长，7日/30日活跃，累计使用分享次数/人数)；
OFFLINE_TINYAPP_MONITOR_TABLE(小程序页面访问排名：页面url，访问次数)；
REALTIME_TAPP_HOUR_VISIT_TREND(实时单个小程序今日小时访问指标趋势图：当天访问次数/人数 小时趋势图)；
REALTIME_TAPP_MINUTE_VISIT(实时单个小程序今日分钟访问指标：当天访问次数 分钟趋势图)；
REALTIME_TAPP_MINUTE_VISIT_TREND(实时单个小程序今日分钟访问指标趋势：当天访问次数 趋势图)；
REALTIME_TAPP_PAGE_DAY_VISIT(实时小数据页面访问数据：页面维度 访问次数/人数)；
REALTIME_TAPP_HOUR_VISIT(实时单个小程序小时访问数据：访问次数，小时)；
OFFLINE_TAPP_OVERALL_VIEW_TREAND(离线单个小程序整体概况趋势：使用次数/人数，分享次数/人数，当日新增用户数，人均/次均停留时长，7日/30日活跃，累计使用分享次数/人数 趋势图):
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 结束日期
当biz_type为以下值时输入：
OFFLINE_TAPP_OVERALL_VIEW_TREAND
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 结束时间
当biz_type为以下值时输入：
REALTIME_TAPP_DAY_VISIT
REALTIME_TAPP_MINUTE_VISIT
REALTIME_TAPP_HOUR_VISIT_TREND
REALTIME_TAPP_MINUTE_VISIT_TREND
REALTIME_TAPP_PAGE_DAY_VISIT
REALTIME_TAPP_HOUR_VISIT
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 页面url地址
当biz_type为以下值时输入：REALTIME_TAPP_PAGE_DAY_VISIT
	 */
	@ApiField("page_hash")
	private String pageHash;

	/**
	 * 请求数据的日期

当biz_type是以下值时输入
: OFFLINE_TAPP_VOERALL_OVERVIEW, OFFLINE_TINYAPP_MONITOR_TABLE
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 开始时间
当biz_type为以下值时输入：
REALTIME_TAPP_DAY_VISIT
REALTIME_TAPP_MINUTE_VISIT
REALTIME_TAPP_HOUR_VISIT_TREND
REALTIME_TAPP_MINUTE_VISIT_TREND
REALTIME_TAPP_PAGE_DAY_VISIT
REALTIME_TAPP_HOUR_VISIT
	 */
	@ApiField("start_time")
	private String startTime;

	public String getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPageHash() {
		return this.pageHash;
	}
	public void setPageHash(String pageHash) {
		this.pageHash = pageHash;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
