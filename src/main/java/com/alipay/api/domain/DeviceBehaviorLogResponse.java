package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Iot设备日志信息
 *
 * @author auto create
 * @since 1.0, 2019-02-25 16:47:11
 */
public class DeviceBehaviorLogResponse extends AlipayObject {

	private static final long serialVersionUID = 4681431843187179842L;

	/**
	 * 行为日志类型，SCAN_CDOE:扫码/HEARTBEAT:心跳
	 */
	@ApiField("behavior_type")
	private String behaviorType;

	/**
	 * 日志对应的设备信息
	 */
	@ApiField("log_content")
	private String logContent;

	/**
	 * 日志时间
	 */
	@ApiField("log_time")
	private Date logTime;

	public String getBehaviorType() {
		return this.behaviorType;
	}
	public void setBehaviorType(String behaviorType) {
		this.behaviorType = behaviorType;
	}

	public String getLogContent() {
		return this.logContent;
	}
	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}

	public Date getLogTime() {
		return this.logTime;
	}
	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

}
