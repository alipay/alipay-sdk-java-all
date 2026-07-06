package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.immessage.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-17 14:57:46
 */
public class AlipayCommerceMedicalHdfImmessageSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3899964681836393991L;

	/** 
	 * 来源去重ID
	 */
	@ApiField("app_msg_id")
	private String appMsgId;

	/** 
	 * 消息ID
	 */
	@ApiField("msg_id")
	private Long msgId;

	/** 
	 * 发送时间
	 */
	@ApiField("send_time")
	private Date sendTime;

	public void setAppMsgId(String appMsgId) {
		this.appMsgId = appMsgId;
	}
	public String getAppMsgId( ) {
		return this.appMsgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
	public Long getMsgId( ) {
		return this.msgId;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public Date getSendTime( ) {
		return this.sendTime;
	}

}
