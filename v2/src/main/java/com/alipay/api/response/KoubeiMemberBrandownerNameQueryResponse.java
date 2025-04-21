package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.brandowner.name.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 21:36:01
 */
public class KoubeiMemberBrandownerNameQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2244684959614126925L;

	/** 
	 * 品牌商名称
	 */
	@ApiField("name")
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
