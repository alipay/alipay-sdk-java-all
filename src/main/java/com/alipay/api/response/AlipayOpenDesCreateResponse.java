package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GavintestNewLeveaOne;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.des.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-13 11:00:00
 */
public class AlipayOpenDesCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6638257191636867936L;

	/** 
	 * 1
	 */
	@ApiField("ces")
	private GavintestNewLeveaOne ces;

	public void setCes(GavintestNewLeveaOne ces) {
		this.ces = ces;
	}
	public GavintestNewLeveaOne getCes( ) {
		return this.ces;
	}

}
