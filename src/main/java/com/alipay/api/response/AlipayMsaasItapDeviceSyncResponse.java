package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItapResponsePayload;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.itap.device.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:42:01
 */
public class AlipayMsaasItapDeviceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4358787233595997995L;

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
