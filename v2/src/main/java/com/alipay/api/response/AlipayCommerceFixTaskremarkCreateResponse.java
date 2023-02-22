package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.fix.taskremark.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:13:09
 */
public class AlipayCommerceFixTaskremarkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7664965935822173364L;

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
