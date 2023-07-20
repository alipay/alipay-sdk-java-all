package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.kids.account.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 19:34:34
 */
public class AlipayCommerceKidsAccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1497656884569982381L;

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
