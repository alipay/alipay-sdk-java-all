package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class AllergyHistory extends AlipayObject {

	private static final long serialVersionUID = 7716869791656852138L;

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
