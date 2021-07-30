package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GavintestNewLeveaOne;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.des.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-05 20:00:01
 */
public class AlipaySecurityProdDesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2786237274233765244L;

	/** 
	 * 11
	 */
	@ApiField("dee")
	private GavintestNewLeveaOne dee;

	/** 
	 * 1
	 */
	@ApiField("string")
	private String string;

	public void setDee(GavintestNewLeveaOne dee) {
		this.dee = dee;
	}
	public GavintestNewLeveaOne getDee( ) {
		return this.dee;
	}

	public void setString(String string) {
		this.string = string;
	}
	public String getString( ) {
		return this.string;
	}

}
