package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * MlmParamTestDemo
 *
 * @author auto create
 * @since 1.0, 2023-11-16 10:36:40
 */
public class MlmParamTestDemo extends AlipayObject {

	private static final long serialVersionUID = 1662918253459464165L;

	/**
	 * 基础描述
	 */
	@ApiField("param_a")
	private String paramA;

	/**
	 * 基础描述
	 */
	@ApiField("param_a_openid")
	private String paramAOpenid;

	/**
	 * 1
	 */
	@ApiField("param_complex")
	private MlmParamTest paramComplex;

	public String getParamA() {
		return this.paramA;
	}
	public void setParamA(String paramA) {
		this.paramA = paramA;
	}

	public String getParamAOpenid() {
		return this.paramAOpenid;
	}
	public void setParamAOpenid(String paramAOpenid) {
		this.paramAOpenid = paramAOpenid;
	}

	public MlmParamTest getParamComplex() {
		return this.paramComplex;
	}
	public void setParamComplex(MlmParamTest paramComplex) {
		this.paramComplex = paramComplex;
	}

}
