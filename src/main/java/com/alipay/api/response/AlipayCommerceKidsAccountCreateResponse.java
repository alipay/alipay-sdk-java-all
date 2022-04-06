package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:10:05
 */
public class AlipayCommerceKidsAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7691245561798464651L;

	/** 
	 * 儿童唯一id
	 */
	@ApiField("child_id")
	private String childId;

	public void setChildId(String childId) {
		this.childId = childId;
	}
	public String getChildId( ) {
		return this.childId;
	}

}
