package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.test.zdpo response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserCertifyTestZdpoResponse extends AlipayResponse {

	private static final long serialVersionUID = 3856118935885256543L;

	/** 
	 * 99
	 */
	@ApiField("hkhikuuuu")
	private String hkhikuuuu;

	/** 
	 * 111
	 */
	@ApiField("result")
	private String result;

	public void setHkhikuuuu(String hkhikuuuu) {
		this.hkhikuuuu = hkhikuuuu;
	}
	public String getHkhikuuuu( ) {
		return this.hkhikuuuu;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
