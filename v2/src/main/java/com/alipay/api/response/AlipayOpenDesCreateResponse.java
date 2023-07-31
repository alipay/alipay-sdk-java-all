package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GavintestNewLeveaOne;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.des.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:03:06
 */
public class AlipayOpenDesCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6357162451123523188L;

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
