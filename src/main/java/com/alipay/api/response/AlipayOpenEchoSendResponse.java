package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.echo.send response.
 * 
 * @author auto create
 * @since 1.0, 2018-04-17 19:35:00
 */
public class AlipayOpenEchoSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 2218875218148849553L;

	/** 
	 * hello world
	 */
	@ApiField("out_a")
	private String outA;

	/** 
	 * Number
	 */
	@ApiField("out_b")
	private Long outB;

	/** 
	 * Price
	 */
	@ApiField("out_c")
	private String outC;

	/** 
	 * hello world
	 */
	@ApiField("word")
	private String word;

	public void setOutA(String outA) {
		this.outA = outA;
	}
	public String getOutA( ) {
		return this.outA;
	}

	public void setOutB(Long outB) {
		this.outB = outB;
	}
	public Long getOutB( ) {
		return this.outB;
	}

	public void setOutC(String outC) {
		this.outC = outC;
	}
	public String getOutC( ) {
		return this.outC;
	}

	public void setWord(String word) {
		this.word = word;
	}
	public String getWord( ) {
		return this.word;
	}

}
