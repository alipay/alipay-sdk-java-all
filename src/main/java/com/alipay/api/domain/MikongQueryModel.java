package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * MikongQueryModel
 *
 * @author auto create
 * @since 1.0, 2017-07-14 10:30:26
 */
public class MikongQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1159868964524773165L;

	/**
	 * name
	 */
	@ApiField("name")
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
