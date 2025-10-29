package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.content.community.open.secuai.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:17
 */
public class AntfortuneContentCommunityOpenSecuaiQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8615647339774477563L;

	/** 
	 * 存储json序列化后的业务结果
	 */
	@ApiField("secuai_open_result")
	private String secuaiOpenResult;

	/** 
	 * trace信息，方便排查问题
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setSecuaiOpenResult(String secuaiOpenResult) {
		this.secuaiOpenResult = secuaiOpenResult;
	}
	public String getSecuaiOpenResult( ) {
		return this.secuaiOpenResult;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
