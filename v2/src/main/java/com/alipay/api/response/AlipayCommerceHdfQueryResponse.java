package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.hdf.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-17 14:17:42
 */
public class AlipayCommerceHdfQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5779234757652355778L;

	/** 
	 * 好大夫的用户id
	 */
	@ApiField("hdf_user_id")
	private String hdfUserId;

	public void setHdfUserId(String hdfUserId) {
		this.hdfUserId = hdfUserId;
	}
	public String getHdfUserId( ) {
		return this.hdfUserId;
	}

}
