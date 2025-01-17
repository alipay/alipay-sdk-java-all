package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.JhjTestNew;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.jhjtest.predoc.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-24 16:01:48
 */
public class AlipaySecurityProdJhjtestPredocCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4879289723776929427L;

	/** 
	 * 1111
	 */
	@ApiField("out_a")
	private String outA;

	/** 
	 * 基础描述
	 */
	@ApiField("out_b")
	private String outB;

	/** 
	 * 修改子参数变成字段copy
	 */
	@ApiField("out_com")
	private JhjTestNew outCom;

	public void setOutA(String outA) {
		this.outA = outA;
	}
	public String getOutA( ) {
		return this.outA;
	}

	public void setOutB(String outB) {
		this.outB = outB;
	}
	public String getOutB( ) {
		return this.outB;
	}

	public void setOutCom(JhjTestNew outCom) {
		this.outCom = outCom;
	}
	public JhjTestNew getOutCom( ) {
		return this.outCom;
	}

}
