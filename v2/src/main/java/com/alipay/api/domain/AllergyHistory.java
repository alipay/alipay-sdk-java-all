package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-04 11:28:52
 */
public class AllergyHistory extends AlipayObject {

	private static final long serialVersionUID = 2674348876254842185L;

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
