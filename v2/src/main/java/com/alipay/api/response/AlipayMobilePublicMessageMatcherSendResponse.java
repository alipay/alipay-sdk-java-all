package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.message.matcher.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-10 10:53:17
 */
public class AlipayMobilePublicMessageMatcherSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5468837814559367736L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 对应toUserId，标准Alipay UserId
	 */
	@ApiField("to_alipay_user_id")
	private String toAlipayUserId;

	/** 
	 * 消息接收人的用户ID，值取的openId
	 */
	@ApiField("to_user_id")
	private String toUserId;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setToAlipayUserId(String toAlipayUserId) {
		this.toAlipayUserId = toAlipayUserId;
	}
	public String getToAlipayUserId( ) {
		return this.toAlipayUserId;
	}

	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}
	public String getToUserId( ) {
		return this.toUserId;
	}

}
