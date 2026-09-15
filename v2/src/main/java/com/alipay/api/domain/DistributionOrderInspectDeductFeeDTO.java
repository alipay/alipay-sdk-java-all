package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-04 17:07:56
 */
public class DistributionOrderInspectDeductFeeDTO extends AlipayObject {

	private static final long serialVersionUID = 4173853763539915213L;

	/**
	 * 费用金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 费用类型
	 */
	@ApiField("type")
	private String type;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
