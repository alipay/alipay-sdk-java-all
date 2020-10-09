package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.debark.apply response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-24 17:03:53
 */
public class AlipayOpenPublicLifeDebarkApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6658672639252981931L;

	/** 
	 * 下架成功后返回的提示
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
