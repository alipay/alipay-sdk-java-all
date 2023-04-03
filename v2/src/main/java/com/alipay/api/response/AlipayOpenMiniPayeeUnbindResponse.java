package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.payee.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:41:55
 */
public class AlipayOpenMiniPayeeUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 4359132687546829372L;

	/** 
	 * 解绑结果，true解绑成功，false解绑失败
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
