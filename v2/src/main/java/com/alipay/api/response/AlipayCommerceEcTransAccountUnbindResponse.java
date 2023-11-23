package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.trans.account.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-23 17:56:50
 */
public class AlipayCommerceEcTransAccountUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8413765727452964774L;

	/** 
	 * 解绑结果
成功-SUCCESS
失败-FAIL
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
