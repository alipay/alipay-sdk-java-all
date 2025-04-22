package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ManjiangTestabc;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.techrisk.tt.y.online response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:12
 */
public class TechriskTechriskTtYOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 6558516693938353491L;

	/** 
	 * 1
	 */
	@ApiField("s")
	private ManjiangTestabc s;

	/** 
	 * 1
	 */
	@ApiField("test")
	private String test;

	/** 
	 * 1
	 */
	@ApiField("test_open_id")
	private String testOpenId;

	public void setS(ManjiangTestabc s) {
		this.s = s;
	}
	public ManjiangTestabc getS( ) {
		return this.s;
	}

	public void setTest(String test) {
		this.test = test;
	}
	public String getTest( ) {
		return this.test;
	}

	public void setTestOpenId(String testOpenId) {
		this.testOpenId = testOpenId;
	}
	public String getTestOpenId( ) {
		return this.testOpenId;
	}

}
