package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 语音播报报表查询
 *
 * @author auto create
 * @since 1.0, 2025-11-05 21:04:57
 */
public class AlipayOfflineProviderBroadcastQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7831714895748859715L;

	/**
	 * 设备绑定开始时间与设备绑定结束时间间隔不得超过6个月，并且要么同时为空或者同时不为空
	 */
	@ApiField("bind_end_date")
	private Date bindEndDate;

	/**
	 * 设备绑定开始时间与设备绑定结束时间间隔不得超过6个月，并且要么同时为空或者同时不为空。当设备绑定开始与结束时间、激活开始与结束时间、碰激活开始与结束时间都为空时，默认查询绑定时间为六个月内的数据
	 */
	@ApiField("bind_start_date")
	private Date bindStartDate;

	/**
	 * 激活开始时间与激活结束时间间隔不得超过6个月，并且要么同时为空或者同时不为空
	 */
	@ApiField("biz_active_end_time")
	private Date bizActiveEndTime;

	/**
	 * 激活开始时间与激活结束时间间隔不得超过6个月，并且要么同时为空或者同时不为空
	 */
	@ApiField("biz_active_start_time")
	private Date bizActiveStartTime;

	/**
	 * 碰激活开始时间与碰激活结束时间间隔不得超过6个月，并且要么同时为空或者同时不为空
	 */
	@ApiField("biz_touch_active_end_time")
	private Date bizTouchActiveEndTime;

	/**
	 * 碰激活开始时间与碰激活结束时间间隔不得超过6个月，并且要么同时为空或者同时不为空
	 */
	@ApiField("biz_touch_active_start_time")
	private Date bizTouchActiveStartTime;

	/**
	 * 查询的作业截止日期，要求最近60天以内 当前字段已废弃(此字段已经废弃，传值不再生效，默认查询最新作业截止日期)
	 */
	@ApiField("end_date")
	@Deprecated
	private String endDate;

	/**
	 * 间联商户id
	 */
	@ApiField("smid")
	private String smid;

	public Date getBindEndDate() {
		return this.bindEndDate;
	}
	public void setBindEndDate(Date bindEndDate) {
		this.bindEndDate = bindEndDate;
	}

	public Date getBindStartDate() {
		return this.bindStartDate;
	}
	public void setBindStartDate(Date bindStartDate) {
		this.bindStartDate = bindStartDate;
	}

	public Date getBizActiveEndTime() {
		return this.bizActiveEndTime;
	}
	public void setBizActiveEndTime(Date bizActiveEndTime) {
		this.bizActiveEndTime = bizActiveEndTime;
	}

	public Date getBizActiveStartTime() {
		return this.bizActiveStartTime;
	}
	public void setBizActiveStartTime(Date bizActiveStartTime) {
		this.bizActiveStartTime = bizActiveStartTime;
	}

	public Date getBizTouchActiveEndTime() {
		return this.bizTouchActiveEndTime;
	}
	public void setBizTouchActiveEndTime(Date bizTouchActiveEndTime) {
		this.bizTouchActiveEndTime = bizTouchActiveEndTime;
	}

	public Date getBizTouchActiveStartTime() {
		return this.bizTouchActiveStartTime;
	}
	public void setBizTouchActiveStartTime(Date bizTouchActiveStartTime) {
		this.bizTouchActiveStartTime = bizTouchActiveStartTime;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
