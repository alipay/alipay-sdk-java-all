package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 费控信息
 *
 * @author auto create
 * @since 1.0, 2024-03-05 21:33:59
 */
public class ExpenseControlInfo extends AlipayObject {

	private static final long serialVersionUID = 6117468459511531961L;

	/**
	 * 费控规则id
	 */
	@ApiField("standard_id")
	private String standardId;

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

}
