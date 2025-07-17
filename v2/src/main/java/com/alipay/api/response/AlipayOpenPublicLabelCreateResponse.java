package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.label.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 12:03:30
 */
public class AlipayOpenPublicLabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8718393312664775677L;

	/** 
	 * 支付宝返回的标签ID，开发者后续通过该ID进行标签的查询、修改、删除等操作
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 开发者传入name的值
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
