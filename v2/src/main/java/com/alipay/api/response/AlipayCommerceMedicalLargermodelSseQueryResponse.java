package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StreamMessage;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.largermodel.sse.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-11 20:35:12
 */
public class AlipayCommerceMedicalLargermodelSseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1123259848857667491L;

	/** 
	 * 流式内容数据
	 */
	@ApiField("data")
	private StreamMessage data;

	/** 
	 * true：业务执行成功
	 */
	@ApiField("succes")
	private Boolean succes;

	public void setData(StreamMessage data) {
		this.data = data;
	}
	public StreamMessage getData( ) {
		return this.data;
	}

	public void setSucces(Boolean succes) {
		this.succes = succes;
	}
	public Boolean getSucces( ) {
		return this.succes;
	}

}
