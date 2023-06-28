package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 臻晨测试专用，他人勿动
 *
 * @author auto create
 * @since 1.0, 2023-06-20 16:44:11
 */
public class AlipayOpenOperationOpenbizmockTestdcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3861685226589155191L;

	/**
	 * 详细地址
	 */
	@ApiField("a")
	private String a;

	/**
	 * 1
	 */
	@ApiField("b")
	private String b;

	/**
	 * 1
	 */
	@ApiField("c")
	private String c;

	/**
	 * 1
	 */
	@ApiField("d")
	private String d;

	/**
	 * 1 当前字段已废弃(1234567891011121314151617182)
	 */
	@ApiField("e")
	@Deprecated
	private Boolean e;

	/**
	 * 1 当前字段已废弃(111111111111)
	 */
	@ApiField("g")
	@Deprecated
	private AAAAAtest g;

	/**
	 * 1
	 */
	@ApiListField("i")
	@ApiField("string")
	private List<String> i;

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

	public String getD() {
		return this.d;
	}
	public void setD(String d) {
		this.d = d;
	}

	public Boolean getE() {
		return this.e;
	}
	public void setE(Boolean e) {
		this.e = e;
	}

	public AAAAAtest getG() {
		return this.g;
	}
	public void setG(AAAAAtest g) {
		this.g = g;
	}

	public List<String> getI() {
		return this.i;
	}
	public void setI(List<String> i) {
		this.i = i;
	}

}
