package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OfflinepayBaseRPCResponseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.world.cardscript.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:11:07
 */
public class AlipayCommerceTransportWorldCardscriptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3132475824928827729L;

	/** 
	 * 查询脚本的时间
	 */
	@ApiField("current_time")
	private String currentTime;

	/** 
	 * 基础的rpc响应信息
	 */
	@ApiField("offlinepay_base_rpc_response_info")
	private OfflinepayBaseRPCResponseInfo offlinepayBaseRpcResponseInfo;

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

	public void setOfflinepayBaseRpcResponseInfo(OfflinepayBaseRPCResponseInfo offlinepayBaseRpcResponseInfo) {
		this.offlinepayBaseRpcResponseInfo = offlinepayBaseRpcResponseInfo;
	}
	public OfflinepayBaseRPCResponseInfo getOfflinepayBaseRpcResponseInfo( ) {
		return this.offlinepayBaseRpcResponseInfo;
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
