package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.dfasfdas.fdfds.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-17 17:47:11
 */
public class AlipaySecurityProdDfasfdasFdfdsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8772284288974591733L;

	/** 
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

}
