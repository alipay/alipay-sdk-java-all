package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.promo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 09:47:48
 */
public class AlipayPcreditHuabeiPromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1514856196758284328L;

	/** 
	 * 花呗颜值分
	 */
	@ApiField("facescore")
	private String facescore;

	public void setFacescore(String facescore) {
		this.facescore = facescore;
	}
	public String getFacescore( ) {
		return this.facescore;
	}

}
