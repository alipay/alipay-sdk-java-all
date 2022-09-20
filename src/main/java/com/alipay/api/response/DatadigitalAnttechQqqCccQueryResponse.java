package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.qqq.ccc.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-06 15:24:47
 */
public class DatadigitalAnttechQqqCccQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3648637983445942841L;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

}
