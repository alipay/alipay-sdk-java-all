package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息订单拓展信息
 *
 * @author auto create
 * @since 1.0, 2024-04-17 12:56:02
 */
public class MsgOrderExtInfo extends AlipayObject {

	private static final long serialVersionUID = 8779833371359511819L;

	/**
	 * 办事大厅地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 办事具体附加信息
	 */
	@ApiField("attachment_info")
	private String attachmentInfo;

	/**
	 * 如果是直接取号，则赋予取号时间。【格式要求：yyyy-MM-dd HH:mm:ss】
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 调用小程序appId
	 */
	@ApiField("invoke_app_id")
	private String invokeAppId;

	/**
	 * 办事大厅名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 取号的号码【数字值】
	 */
	@ApiField("queue_number")
	private String queueNumber;

	/**
	 * 预约变更理由【发生变更后，后续状态都要传】
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 预约时间段的开始时间点，如果是直接取号，则赋予取号时间。【格式要求：yyyy-MM-dd HH:mm:ss】
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 线下取号的时间点【格式要求：yyyy-MM-dd HH:mm:ss】
	 */
	@ApiField("take_time")
	private Date takeTime;

	/**
	 * 在不同状态下可以显示相应温馨提示信息。
同时提供评价服务链接，服务链接字段为“target_url”
	 */
	@ApiField("tips")
	private String tips;

	/**
	 * 当前排队的人数【到号及办事完成等后续状态则传 0 】.
	 */
	@ApiField("wait_number")
	private String waitNumber;

	/**
	 * 办事窗口
	 */
	@ApiField("window")
	private String window;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAttachmentInfo() {
		return this.attachmentInfo;
	}
	public void setAttachmentInfo(String attachmentInfo) {
		this.attachmentInfo = attachmentInfo;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getInvokeAppId() {
		return this.invokeAppId;
	}
	public void setInvokeAppId(String invokeAppId) {
		this.invokeAppId = invokeAppId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getQueueNumber() {
		return this.queueNumber;
	}
	public void setQueueNumber(String queueNumber) {
		this.queueNumber = queueNumber;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getTakeTime() {
		return this.takeTime;
	}
	public void setTakeTime(Date takeTime) {
		this.takeTime = takeTime;
	}

	public String getTips() {
		return this.tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getWaitNumber() {
		return this.waitNumber;
	}
	public void setWaitNumber(String waitNumber) {
		this.waitNumber = waitNumber;
	}

	public String getWindow() {
		return this.window;
	}
	public void setWindow(String window) {
		this.window = window;
	}

}
