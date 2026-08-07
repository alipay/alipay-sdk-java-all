package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家空间报告查询
 *
 * @author auto create
 * @since 1.0, 2026-07-28 19:10:19
 */
public class AlipayCommerceMedicalHmStagereportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5196149238332682767L;

	/**
	 * 活动 ID，不传则查用户当前有效活动
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 渠道，HM_HEALTH_ACTIVITY(家空间健康活动)
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 查询结束日期
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 用户openid

	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 报告类型WEEKLY/MONTHLY/FINAL/ALL
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * 查询开始日期
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 用户2088
	 */
	@ApiField("user_uid")
	private String userUid;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getUserUid() {
		return this.userUid;
	}
	public void setUserUid(String userUid) {
		this.userUid = userUid;
	}

}
