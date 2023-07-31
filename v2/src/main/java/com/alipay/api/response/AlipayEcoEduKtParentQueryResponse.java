package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.parent.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 05:39:46
 */
public class AlipayEcoEduKtParentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8781959135455244279L;

	/** 
	 * 如果用户已经添加过这个孩子，则返回SUCCESS ， 失败返回FAIL。
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
