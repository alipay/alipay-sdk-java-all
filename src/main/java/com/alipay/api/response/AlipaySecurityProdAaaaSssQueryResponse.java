package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayKeyanClass;
import com.alipay.api.domain.LtPlayThree;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.aaaa.sss.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-07 15:30:31
 */
public class AlipaySecurityProdAaaaSssQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1786486878685886663L;

	/** 
	 * 333
	 */
	@ApiField("a_id")
	private AlipayKeyanClass aId;

	/** 
	 * 3333
	 */
	@ApiField("b_ids")
	private LtPlayThree bIds;

	public void setaId(AlipayKeyanClass aId) {
		this.aId = aId;
	}
	public AlipayKeyanClass getaId( ) {
		return this.aId;
	}

	public void setbIds(LtPlayThree bIds) {
		this.bIds = bIds;
	}
	public LtPlayThree getbIds( ) {
		return this.bIds;
	}

}
