package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ddd
 *
 * @author auto create
 * @since 1.0, 2016-03-01 14:45:19
 */
public class AlipaySecurityProdDddddModel extends AlipayObject {

	private static final long serialVersionUID = 3267534983925819219L;

	/**
	 * aa
	 */
	@ApiListField("aaa")
	@ApiField("string")
	private List<String> aaa;

	/**
	 * dd
	 */
	@ApiField("aaade")
	private AAATest aaade;

	/**
	 * ddde
dde
dde
	 */
	@ApiListField("ddd")
	@ApiField("string")
	private List<String> ddd;

	public List<String> getAaa() {
		return this.aaa;
	}
	public void setAaa(List<String> aaa) {
		this.aaa = aaa;
	}

	public AAATest getAaade() {
		return this.aaade;
	}
	public void setAaade(AAATest aaade) {
		this.aaade = aaade;
	}

	public List<String> getDdd() {
		return this.ddd;
	}
	public void setDdd(List<String> ddd) {
		this.ddd = ddd;
	}

}
