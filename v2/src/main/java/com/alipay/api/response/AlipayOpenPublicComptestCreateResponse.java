package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.comptest.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-13 17:35:29
 */
public class AlipayOpenPublicComptestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1544965236281666679L;

	/** 
	 * 1
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 2
	 */
	@ApiField("resulttwo")
	private String resulttwo;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setResulttwo(String resulttwo) {
		this.resulttwo = resulttwo;
	}
	public String getResulttwo( ) {
		return this.resulttwo;
	}

}
