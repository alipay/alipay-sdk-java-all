package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.qqq.ccc.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-20 14:46:49
 */
public class DatadigitalAnttechQqqCccQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1828479484191686362L;

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
