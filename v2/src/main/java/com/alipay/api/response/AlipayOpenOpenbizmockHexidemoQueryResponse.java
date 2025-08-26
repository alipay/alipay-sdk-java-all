package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.openbizmock.hexidemo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:43
 */
public class AlipayOpenOpenbizmockHexidemoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4644337214879621563L;

	/** 
	 * echo
	 */
	@ApiField("echo")
	private String echo;

	/** 
	 * 调用信息
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 示例结果
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setEcho(String echo) {
		this.echo = echo;
	}
	public String getEcho( ) {
		return this.echo;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
