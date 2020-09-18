package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GavintestNewonline;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.data.desd.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-12 13:55:01
 */
public class KoubeiMemberDataDesdBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3222457884112147997L;

	/** 
	 * 21
	 */
	@ApiField("de")
	private GavintestNewonline de;

	public void setDe(GavintestNewonline de) {
		this.de = de;
	}
	public GavintestNewonline getDe( ) {
		return this.de;
	}

}
