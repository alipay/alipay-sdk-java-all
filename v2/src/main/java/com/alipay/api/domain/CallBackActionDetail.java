package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外呼回执触达明细
 *
 * @author auto create
 * @since 1.0, 2024-11-25 17:41:49
 */
public class CallBackActionDetail extends AlipayObject {

	private static final long serialVersionUID = 2437294387788832574L;

	/**
	 * 发起语音外呼动作程序编码
	 */
	@ApiField("action_driver_code")
	private Long actionDriverCode;

	/**
	 * 外呼回执时间
	 */
	@ApiField("call_back_time")
	private Date callBackTime;

	/**
	 * 外呼回执内容明细信息
	 */
	@ApiField("message_detail")
	private CallBackMessageDetail messageDetail;

	/**
	 * 外呼回执消息类型
	 */
	@ApiField("message_type")
	private String messageType;

	public Long getActionDriverCode() {
		return this.actionDriverCode;
	}
	public void setActionDriverCode(Long actionDriverCode) {
		this.actionDriverCode = actionDriverCode;
	}

	public Date getCallBackTime() {
		return this.callBackTime;
	}
	public void setCallBackTime(Date callBackTime) {
		this.callBackTime = callBackTime;
	}

	public CallBackMessageDetail getMessageDetail() {
		return this.messageDetail;
	}
	public void setMessageDetail(CallBackMessageDetail messageDetail) {
		this.messageDetail = messageDetail;
	}

	public String getMessageType() {
		return this.messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

}
