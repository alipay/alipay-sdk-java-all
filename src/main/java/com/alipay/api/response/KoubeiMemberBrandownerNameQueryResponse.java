package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.brandowner.name.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-06 11:14:14
 */
public class KoubeiMemberBrandownerNameQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4786271236965191331L;

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
