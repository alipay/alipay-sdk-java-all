package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-30 10:15:39
 */
public class AllergyHistory extends AlipayObject {

	private static final long serialVersionUID = 4451419257175267451L;

	/**
	 * 名称
	 */
	@ApiField("allergen")
	private String allergen;

	public String getAllergen() {
		return this.allergen;
	}
	public void setAllergen(String allergen) {
		this.allergen = allergen;
	}

}
