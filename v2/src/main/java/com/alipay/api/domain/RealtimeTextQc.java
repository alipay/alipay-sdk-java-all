package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实时文本质检
 *
 * @author auto create
 * @since 1.0, 2025-06-06 11:34:43
 */
public class RealtimeTextQc extends AlipayObject {

	private static final long serialVersionUID = 6163946388773235898L;

	/**
	 * 当前时间
	 */
	@ApiField("current_time")
	private Date currentTime;

	/**
	 * 用于表示唯一请求单句话唯一标识 6位数字,前序不足的数位补0
	 */
	@ApiField("dialog_id")
	private String dialogId;

	/**
	 * 角色id
	 */
	@ApiField("role")
	private String role;

	/**
	 * 服务来源，枚举，会影响质检适用的规则
	 */
	@ApiField("service_source")
	private String serviceSource;

	/**
	 * 服务开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 当前待检文本角色
	 */
	@ApiField("text")
	private String text;

	public Date getCurrentTime() {
		return this.currentTime;
	}
	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	public String getDialogId() {
		return this.dialogId;
	}
	public void setDialogId(String dialogId) {
		this.dialogId = dialogId;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getServiceSource() {
		return this.serviceSource;
	}
	public void setServiceSource(String serviceSource) {
		this.serviceSource = serviceSource;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
