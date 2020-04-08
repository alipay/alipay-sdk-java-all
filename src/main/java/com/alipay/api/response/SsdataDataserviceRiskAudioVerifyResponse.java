package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.audio.verify response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-29 16:05:58
 */
public class SsdataDataserviceRiskAudioVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7575963235556882675L;

	/** 
	 * 请求提交结果对应的音频唯一id，用于后续通过ssdata.dataservice.risk.audio.query接口查询结果的入参
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 业务唯一识别码
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
