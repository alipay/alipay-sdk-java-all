package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 1
 *
 * @author auto create
 * @since 1.0, 2023-02-02 22:58:20
 */
public class AlipayOpenAppTestTestChargeModel extends AlipayObject {

	private static final long serialVersionUID = 4686381862772594573L;

	/**
	 * 11
	 */
	@ApiField("a")
	private String a;

	/**
	 * 1
	 */
	@ApiField("b")
	private String b;

	/**
	 * a
	 */
	@ApiField("c")
	private String c;

	/**
	 * 复杂类型参数
	 */
	@ApiField("complex_param")
	private OpenidComplex complexParam;

	/**
	 * das
	 */
	@ApiField("d")
	private String d;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return this.b;
	}
	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return this.c;
	}
	public void setC(String c) {
		this.c = c;
	}

	public OpenidComplex getComplexParam() {
		return this.complexParam;
	}
	public void setComplexParam(OpenidComplex complexParam) {
		this.complexParam = complexParam;
	}

	public String getD() {
		return this.d;
	}
	public void setD(String d) {
		this.d = d;
	}

}
