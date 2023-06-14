package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antpaas.addtesttag.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:57:26
 */
public class AlipayUserAntpaasAddtesttagModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6668632461886691643L;

	/** 
	 * 返回是否有标记或者是否达标成功，success，msg
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
