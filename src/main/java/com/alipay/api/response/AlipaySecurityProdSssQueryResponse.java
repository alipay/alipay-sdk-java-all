package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.sss.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-02 16:36:31
 */
public class AlipaySecurityProdSssQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6478468269817781272L;

	/** 
	 * 1
	 */
	@ApiField("ccc")
	private String ccc;

	/** 
	 * 1
	 */
	@ApiField("ccc_open_id")
	private String cccOpenId;

	public void setCcc(String ccc) {
		this.ccc = ccc;
	}
	public String getCcc( ) {
		return this.ccc;
	}

	public void setCccOpenId(String cccOpenId) {
		this.cccOpenId = cccOpenId;
	}
	public String getCccOpenId( ) {
		return this.cccOpenId;
	}

}
