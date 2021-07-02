package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.fix.taskremark.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-09 20:56:14
 */
public class AlipayCommerceFixTaskremarkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5211685911486457731L;

	/** 
	 * 创建成功的备注id
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
