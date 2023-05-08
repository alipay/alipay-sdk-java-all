package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.twenty.two.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 10:06:57
 */
public class AlipayDataTwentyTwoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2347461919922516535L;

	/** 
	 * 出参id基础描述
	 */
	@ApiField("return_id")
	private String returnId;

	/** 
	 * 出参open_id基础描述
	 */
	@ApiField("return_open_id")
	private String returnOpenId;

	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}
	public String getReturnId( ) {
		return this.returnId;
	}

	public void setReturnOpenId(String returnOpenId) {
		this.returnOpenId = returnOpenId;
	}
	public String getReturnOpenId( ) {
		return this.returnOpenId;
	}

}
