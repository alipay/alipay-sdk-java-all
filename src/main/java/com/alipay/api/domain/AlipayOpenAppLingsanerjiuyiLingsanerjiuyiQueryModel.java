package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * lingsanerjiuyi
 *
 * @author auto create
 * @since 1.0, 2017-11-16 15:26:30
 */
public class AlipayOpenAppLingsanerjiuyiLingsanerjiuyiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2783239172229827315L;

	/**
	 * 12
	 */
	@ApiField("rucand")
	private String rucand;

	public String getRucand() {
		return this.rucand;
	}
	public void setRucand(String rucand) {
		this.rucand = rucand;
	}

}
