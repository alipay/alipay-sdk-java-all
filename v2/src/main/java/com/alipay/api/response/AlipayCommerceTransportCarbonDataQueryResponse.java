package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.carbon.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 18:56:46
 */
public class AlipayCommerceTransportCarbonDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8262988534531813838L;

	/** 
	 * 返回碳积分记录数量
	 */
	@ApiField("count")
	private Long count;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

}
