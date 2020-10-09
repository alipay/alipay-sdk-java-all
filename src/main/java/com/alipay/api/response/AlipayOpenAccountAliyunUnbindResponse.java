package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.account.aliyun.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-26 17:40:24
 */
public class AlipayOpenAccountAliyunUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8298663747722862832L;

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
