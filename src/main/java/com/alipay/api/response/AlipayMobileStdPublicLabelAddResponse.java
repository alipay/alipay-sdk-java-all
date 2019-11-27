package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.label.add response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobileStdPublicLabelAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8536719381628619711L;

	/** 
	 * 标签编码
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 标签名称
	 */
	@ApiField("name")
	private String name;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
