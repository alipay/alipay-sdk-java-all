package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.authenticate.campuscard.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:41:58
 */
public class AlipayCommerceEducateAuthenticateCampuscardCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5553651655728424147L;

	/** 
	 * 如果学生学籍插入成功，则返回SUCCESS ， 失败返回FAIL
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
