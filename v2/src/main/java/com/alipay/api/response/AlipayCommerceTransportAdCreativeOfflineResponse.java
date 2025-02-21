package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.creative.offline response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-05 10:36:26
 */
public class AlipayCommerceTransportAdCreativeOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 5421897134465595297L;

	/** 
	 * 创意下线结果 + 根据创意id操作创意下线，成功返回true，失败返回false
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
