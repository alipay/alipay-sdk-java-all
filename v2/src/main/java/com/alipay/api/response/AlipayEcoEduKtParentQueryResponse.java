package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.parent.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayEcoEduKtParentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3629632715156799811L;

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
