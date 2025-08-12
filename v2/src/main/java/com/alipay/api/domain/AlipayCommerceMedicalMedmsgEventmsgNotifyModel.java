package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗事件消息通知
 *
 * @author auto create
 * @since 1.0, 2025-07-16 15:19:06
 */
public class AlipayCommerceMedicalMedmsgEventmsgNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 6126842577986285861L;

	/**
	 * 关联业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务来源
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 消息事件触发的事件类型，由服务端指定。
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 发送事件消息的参数
	 */
	@ApiListField("medical_medmsg_arg")
	@ApiField("medical_medmsg_arg")
	private List<MedicalMedmsgArg> medicalMedmsgArg;

	/**
	 * 消息创建时间
	 */
	@ApiField("msg_create_time")
	private Date msgCreateTime;

	/**
	 * 事件消息的唯一消息ID
	 */
	@ApiField("msg_id")
	private String msgId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 推送标志位
	 */
	@ApiField("push")
	private String push;

	/**
	 * 目标支付宝用户ID
	 */
	@ApiField("to_user_id")
	private String toUserId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public List<MedicalMedmsgArg> getMedicalMedmsgArg() {
		return this.medicalMedmsgArg;
	}
	public void setMedicalMedmsgArg(List<MedicalMedmsgArg> medicalMedmsgArg) {
		this.medicalMedmsgArg = medicalMedmsgArg;
	}

	public Date getMsgCreateTime() {
		return this.msgCreateTime;
	}
	public void setMsgCreateTime(Date msgCreateTime) {
		this.msgCreateTime = msgCreateTime;
	}

	public String getMsgId() {
		return this.msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPush() {
		return this.push;
	}
	public void setPush(String push) {
		this.push = push;
	}

	public String getToUserId() {
		return this.toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}

}
