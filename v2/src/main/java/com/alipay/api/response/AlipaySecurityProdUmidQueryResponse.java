package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.umid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:18:50
 */
public class AlipaySecurityProdUmidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1576799581177542438L;

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
