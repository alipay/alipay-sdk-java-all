package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BoxiuTestDSTwo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.telmo.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdTelmoPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7629759289783139992L;

	/** 
	 * aaa
	 */
	@ApiField("out_1")
	private BoxiuTestDSTwo out1;

	public void setOut1(BoxiuTestDSTwo out1) {
		this.out1 = out1;
	}
	public BoxiuTestDSTwo getOut1( ) {
		return this.out1;
	}

}
