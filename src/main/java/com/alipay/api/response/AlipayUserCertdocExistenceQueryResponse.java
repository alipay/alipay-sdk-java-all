package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certdoc.existence.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 19:17:52
 */
public class AlipayUserCertdocExistenceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8837662396476874548L;

	/** 
	 * 证件类型是否存在，可选值 true/false
	 */
	@ApiField("exist")
	private String exist;

	public void setExist(String exist) {
		this.exist = exist;
	}
	public String getExist( ) {
		return this.exist;
	}

}
