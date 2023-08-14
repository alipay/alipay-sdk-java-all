package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.umid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-20 09:48:53
 */
public class AlipaySecurityProdUmidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5646288118575159451L;

	/** 
	 * umid:客户端对应的UMID值，从UMID系统获取。
	 */
	@ApiField("umid")
	private String umid;

	public void setUmid(String umid) {
		this.umid = umid;
	}
	public String getUmid( ) {
		return this.umid;
	}

}
