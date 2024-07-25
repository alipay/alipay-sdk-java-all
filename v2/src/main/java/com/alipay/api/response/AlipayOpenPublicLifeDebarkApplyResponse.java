package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.debark.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class AlipayOpenPublicLifeDebarkApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5552131452876847688L;

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
