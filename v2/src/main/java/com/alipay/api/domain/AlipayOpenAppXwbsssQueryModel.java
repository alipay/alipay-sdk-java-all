package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * xwbsss
 *
 * @author auto create
 * @since 1.0, 2018-01-12 14:06:20
 */
public class AlipayOpenAppXwbsssQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1524425158935383992L;

	/**
	 * 1
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
	@ApiListField("c")
	@ApiField("number")
	private List<Long> c;

	/**
	 * 描述描述描述描述
	 */
	@ApiField("effect_date")
	private String effectDate;

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

	public List<Long> getC() {
		return this.c;
	}
	public void setC(List<Long> c) {
		this.c = c;
	}

	public String getEffectDate() {
		return this.effectDate;
	}
	public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}

}
