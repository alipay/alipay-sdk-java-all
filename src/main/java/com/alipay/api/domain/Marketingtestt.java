package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * miao
 *
 * @author auto create
 * @since 1.0, 2022-08-01 17:04:42
 */
public class Marketingtestt extends AlipayObject {

	private static final long serialVersionUID = 1788131883161471457L;

	/**
	 * sasa
	 */
	@ApiField("test_22")
	private Marketingtest test22;

	public Marketingtest getTest22() {
		return this.test22;
	}
	public void setTest22(Marketingtest test22) {
		this.test22 = test22;
	}

}
