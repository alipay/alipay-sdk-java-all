package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通知记录查询的返回体复杂类型
 *
 * @author auto create
 * @since 1.0, 2025-10-23 09:43:17
 */
public class NotifyRecord extends AlipayObject {

	private static final long serialVersionUID = 3258973787678223293L;

	/**
	 * 通话的唯一ID
	 */
	@ApiField("acid")
	private String acid;

	/**
	 * 关联数据表单编码
	 */
	@ApiField("belong_data_code")
	private String belongDataCode;

	/**
	 * 关联数据ID
	 */
	@ApiField("belong_data_id")
	private String belongDataId;

	/**
	 * 发送内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 客户ID
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 客户姓名
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 接收方
	 */
	@ApiField("receiver")
	private String receiver;

	/**
	 * 发送时间
	 */
	@ApiField("send_time")
	private Date sendTime;

	/**
	 * 字段透传
	 */
	@ApiField("send_type")
	private String sendType;

	/**
	 * 发送方
	 */
	@ApiField("sender")
	private String sender;

	/**
	 * 任务编码
	 */
	@ApiField("task_code")
	private String taskCode;

	public String getAcid() {
		return this.acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}

	public String getBelongDataCode() {
		return this.belongDataCode;
	}
	public void setBelongDataCode(String belongDataCode) {
		this.belongDataCode = belongDataCode;
	}

	public String getBelongDataId() {
		return this.belongDataId;
	}
	public void setBelongDataId(String belongDataId) {
		this.belongDataId = belongDataId;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getReceiver() {
		return this.receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public Date getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getSendType() {
		return this.sendType;
	}
	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public String getSender() {
		return this.sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getTaskCode() {
		return this.taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

}
