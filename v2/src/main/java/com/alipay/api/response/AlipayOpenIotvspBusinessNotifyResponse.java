package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.business.notify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-21 14:27:01
 */
public class AlipayOpenIotvspBusinessNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7312797592239899988L;

	/** 
	 * 业务操作执行状态，不包含消息发送状态
	 */
	@ApiField("biz_success")
	private String bizSuccess;

	/** 
	 * 消息错误编码
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 消息发送状态，只有当biz_success为true时，才会发送消息。
	 */
	@ApiField("msg_success")
	private String msgSuccess;

	public void setBizSuccess(String bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public String getBizSuccess( ) {
		return this.bizSuccess;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setMsgSuccess(String msgSuccess) {
		this.msgSuccess = msgSuccess;
	}
	public String getMsgSuccess( ) {
		return this.msgSuccess;
	}

}
