package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.account.aliyun.unbind response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-26 14:35:01
 */
public class AlipayOpenAccountAliyunUnbindResponse extends AlipayResponse {

	private static final long serialVersionUID = 3319227395132938388L;

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
