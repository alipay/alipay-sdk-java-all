package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TransportAuthStatusData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.auth.binding.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-25 15:17:46
 */
public class AlipayCommerceTransportAuthBindingGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2429679743865113978L;

	/** 
	 * 授权状态数据。当接口调用成功时，需要返回该字段。
	 */
	@ApiField("data")
	private TransportAuthStatusData data;

	public void setData(TransportAuthStatusData data) {
		this.data = data;
	}
	public TransportAuthStatusData getData( ) {
		return this.data;
	}

}
