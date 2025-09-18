package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.promo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 17:47:41
 */
public class AlipayPcreditHuabeiPromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7635942287612869485L;

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
