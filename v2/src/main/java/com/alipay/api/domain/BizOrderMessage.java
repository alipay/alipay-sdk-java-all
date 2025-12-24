package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务订单消息
 *
 * @author auto create
 * @since 1.0, 2024-11-08 11:42:19
 */
public class BizOrderMessage extends AlipayObject {

	private static final long serialVersionUID = 1398577616526948317L;

	/**
	 * message_type = PHONECARD_SHIPMENT 时为物流单号；
message_type = BROAD_BAND_COMPLETE 时为宽带号；
	 */
	@ApiField("biz_flow_id")
	private String bizFlowId;

	/**
	 * message_type = PHONECARD_SHIPMENT 时为物流商编码；
message_type = PHONECARD_FIRST_TOPUP 时为充值金额，单位分；
	 */
	@ApiField("biz_value")
	private String bizValue;

	/**
	 * 消息发送时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 消息唯一键
	 */
	@ApiField("message_id")
	private String messageId;

	/**
	 * 业务消息
	 */
	@ApiField("message_type")
	private String messageType;

	public String getBizFlowId() {
		return this.bizFlowId;
	}
	public void setBizFlowId(String bizFlowId) {
		this.bizFlowId = bizFlowId;
	}

	public String getBizValue() {
		return this.bizValue;
	}
	public void setBizValue(String bizValue) {
		this.bizValue = bizValue;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMessageId() {
		return this.messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageType() {
		return this.messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

}
