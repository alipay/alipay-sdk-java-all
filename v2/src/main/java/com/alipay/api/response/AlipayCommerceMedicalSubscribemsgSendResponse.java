package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.subscribemsg.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-09 21:26:47
 */
public class AlipayCommerceMedicalSubscribemsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4371622917536111998L;

	/** 
	 * 业务错误描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 消息id
	 */
	@ApiField("msg_id")
	private String msgId;

	/** 
	 * 外部消息id
	 */
	@ApiField("out_msg_id")
	private String outMsgId;

	/** 
	 * 业务结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getMsgId( ) {
		return this.msgId;
	}

	public void setOutMsgId(String outMsgId) {
		this.outMsgId = outMsgId;
	}
	public String getOutMsgId( ) {
		return this.outMsgId;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
