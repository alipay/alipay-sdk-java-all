package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解语花直播审核结果查询
 *
 * @author auto create
 * @since 1.0, 2022-10-28 10:39:41
 */
public class AlipayFincoreComplianceRcsmartLivecontentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3648548898577589362L;

	/**
	 * app_name为调用方系统名称(英文)，与分配的app_token一起做调用系统合法性校验
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * app_token为系统分配的密钥，与app_name一起做调用系统合法性校验
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * 审核完成时间开始
	 */
	@ApiField("live_audit_time_begain")
	private Date liveAuditTimeBegain;

	/**
	 * 审核完成结束时间
	 */
	@ApiField("live_audit_time_end")
	private Date liveAuditTimeEnd;

	/**
	 * 直播开始时间的维度-起始查询时间
	 */
	@ApiField("live_start_time_begain")
	private Date liveStartTimeBegain;

	/**
	 * 直播开始时间的维度-截止查询时间
	 */
	@ApiField("live_start_time_end")
	private Date liveStartTimeEnd;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppToken() {
		return this.appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public Date getLiveAuditTimeBegain() {
		return this.liveAuditTimeBegain;
	}
	public void setLiveAuditTimeBegain(Date liveAuditTimeBegain) {
		this.liveAuditTimeBegain = liveAuditTimeBegain;
	}

	public Date getLiveAuditTimeEnd() {
		return this.liveAuditTimeEnd;
	}
	public void setLiveAuditTimeEnd(Date liveAuditTimeEnd) {
		this.liveAuditTimeEnd = liveAuditTimeEnd;
	}

	public Date getLiveStartTimeBegain() {
		return this.liveStartTimeBegain;
	}
	public void setLiveStartTimeBegain(Date liveStartTimeBegain) {
		this.liveStartTimeBegain = liveStartTimeBegain;
	}

	public Date getLiveStartTimeEnd() {
		return this.liveStartTimeEnd;
	}
	public void setLiveStartTimeEnd(Date liveStartTimeEnd) {
		this.liveStartTimeEnd = liveStartTimeEnd;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
