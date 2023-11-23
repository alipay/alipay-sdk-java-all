package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.authenticate.campuscard.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:24:32
 */
public class AlipayCommerceEducateAuthenticateCampuscardModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6274426561683366724L;

	/** 
	 * 如果学生学籍更新成功，则返回SUCCESS ， 失败返回FAIL。
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
