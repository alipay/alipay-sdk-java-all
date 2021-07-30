package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.mobileauth.sign.verify response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-12 14:47:25
 */
public class AlipayPcreditHuabeiMobileauthSignVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7763246114514941449L;

	/** 
	 * 模板查询返回JSON信息，参考 PcreditAuthPageSignVerifyResult
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
