package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.alusdp.chat.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:00
 */
public class AlipayBossProdAlusdpChatQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8655414449649881481L;

	/** 
	 * 返回数据
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 状态码对应的信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 状态码
	 */
	@ApiField("status_code")
	private String statusCode;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusCode( ) {
		return this.statusCode;
	}

}
