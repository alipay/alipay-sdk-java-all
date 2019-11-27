package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.che.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-23 17:09:51
 */
public class AlipayInsAutoCheTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8373512361433727912L;

	/** 
	 * fdsjfkdsjfkjs
	 */
	@ApiField("c_nam")
	private String cNam;

	public void setcNam(String cNam) {
		this.cNam = cNam;
	}
	public String getcNam( ) {
		return this.cNam;
	}

}
