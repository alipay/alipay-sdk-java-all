package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItapResponsePayload;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.itap.states.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:19
 */
public class AlipayMsaasItapStatesSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2528133565483946596L;

	/** 
	 * Itap统一放回结果模型
	 */
	@ApiListField("payload")
	@ApiField("itap_response_payload")
	private List<ItapResponsePayload> payload;

	/** 
	 * 请求唯一ID
	 */
	@ApiField("request_id")
	private String requestId;

	public void setPayload(List<ItapResponsePayload> payload) {
		this.payload = payload;
	}
	public List<ItapResponsePayload> getPayload( ) {
		return this.payload;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
