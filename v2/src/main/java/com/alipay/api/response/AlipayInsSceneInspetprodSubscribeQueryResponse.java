package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.inspetprod.subscribe.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:58
 */
public class AlipayInsSceneInspetprodSubscribeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2391529377514172487L;

	/** 
	 * 是否订阅公众号
	 */
	@ApiField("subscribe")
	private Boolean subscribe;

	public void setSubscribe(Boolean subscribe) {
		this.subscribe = subscribe;
	}
	public Boolean getSubscribe( ) {
		return this.subscribe;
	}

}
