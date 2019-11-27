package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.world.cardscript.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-18 14:46:49
 */
public class AlipayCommerceTransportWorldCardscriptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4394845873354183173L;

	/** 
	 * 查询脚本的时间
	 */
	@ApiField("current_time")
	private String currentTime;

	/** 
	 * 生码脚本
	 */
	@ApiField("script_code")
	private String scriptCode;

	/** 
	 * 脚本签名
	 */
	@ApiField("script_mac")
	private String scriptMac;

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	public String getCurrentTime( ) {
		return this.currentTime;
	}

	public void setScriptCode(String scriptCode) {
		this.scriptCode = scriptCode;
	}
	public String getScriptCode( ) {
		return this.scriptCode;
	}

	public void setScriptMac(String scriptMac) {
		this.scriptMac = scriptMac;
	}
	public String getScriptMac( ) {
		return this.scriptMac;
	}

}
