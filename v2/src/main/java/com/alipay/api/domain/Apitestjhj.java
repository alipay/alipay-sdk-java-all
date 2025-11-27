package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * jhj的测试复杂类型
 *
 * @author auto create
 * @since 1.0, 2023-09-14 21:45:16
 */
public class Apitestjhj extends AlipayObject {

	private static final long serialVersionUID = 5168344792362374634L;

	/**
	 * a
	 */
	@ApiField("para_a")
	private String paraA;

	/**
	 * a
	 */
	@ApiField("para_b")
	private String paraB;

	/**
	 * aa
	 */
	@ApiField("para_c")
	private String paraC;

	/**
	 * aa
	 */
	@ApiField("para_d")
	private String paraD;

	/**
	 * aa
	 */
	@ApiField("para_e")
	private String paraE;

	public String getParaA() {
		return this.paraA;
	}
	public void setParaA(String paraA) {
		this.paraA = paraA;
	}

	public String getParaB() {
		return this.paraB;
	}
	public void setParaB(String paraB) {
		this.paraB = paraB;
	}

	public String getParaC() {
		return this.paraC;
	}
	public void setParaC(String paraC) {
		this.paraC = paraC;
	}

	public String getParaD() {
		return this.paraD;
	}
	public void setParaD(String paraD) {
		this.paraD = paraD;
	}

	public String getParaE() {
		return this.paraE;
	}
	public void setParaE(String paraE) {
		this.paraE = paraE;
	}

}
