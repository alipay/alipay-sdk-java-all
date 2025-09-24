package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询设备轨迹接口
 *
 * @author auto create
 * @since 1.0, 2023-07-05 14:50:04
 */
public class AlipayCommerceIotDeviceTraceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3513287775897973754L;

	/**
	 * 设备唯一标识，设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 查询轨迹的结束时间.必须在当前时间的1小时之内
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 查询轨迹的开始时间. 必须在当前时间的1小时之内
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
