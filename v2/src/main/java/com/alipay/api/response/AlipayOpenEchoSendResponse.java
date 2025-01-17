package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MyObjectDdd;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.echo.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenEchoSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8746544534584788719L;

	/** 
	 * DDDD
	 */
	@ApiField("obj")
	private MyObjectDdd obj;

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
	 * xxx
	 */
	@ApiField("out_d")
	private String outD;

	/** 
	 * hello world
	 */
	@ApiField("word")
	private String word;

	public void setObj(MyObjectDdd obj) {
		this.obj = obj;
	}
	public MyObjectDdd getObj( ) {
		return this.obj;
	}

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

	public void setOutD(String outD) {
		this.outD = outD;
	}
	public String getOutD( ) {
		return this.outD;
	}

	public void setWord(String word) {
		this.word = word;
	}
	public String getWord( ) {
		return this.word;
	}

}
