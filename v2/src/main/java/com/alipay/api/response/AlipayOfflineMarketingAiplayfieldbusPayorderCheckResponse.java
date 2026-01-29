package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.marketing.aiplayfieldbus.payorder.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:07:37
 */
public class AlipayOfflineMarketingAiplayfieldbusPayorderCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 1152662351287133418L;

	/** 
	 * 校验结果
	 */
	@ApiField("allow")
	private Boolean allow;

	/** 
	 * 用户补充
	 */
	@ApiField("ext_text")
	private String extText;

	/** 
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public void setAllow(Boolean allow) {
		this.allow = allow;
	}
	public Boolean getAllow( ) {
		return this.allow;
	}

	public void setExtText(String extText) {
		this.extText = extText;
	}
	public String getExtText( ) {
		return this.extText;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
