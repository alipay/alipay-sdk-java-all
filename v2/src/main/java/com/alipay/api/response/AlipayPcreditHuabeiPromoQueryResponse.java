package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.promo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:38:58
 */
public class AlipayPcreditHuabeiPromoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6794524951373995476L;

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
