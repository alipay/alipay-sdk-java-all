package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留学缴费-费用明细模型
 *
 * @author auto create
 * @since 1.0, 2021-08-16 15:52:26
 */
public class TuitionISVChargeDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 4788364586799488564L;

	/**
	 * 费用金额
	 */
	@ApiField("fee_amount")
	private TuitionMoneyDTO feeAmount;

	/**
	 * 费用名称
	 */
	@ApiField("fee_name")
	private String feeName;

	public TuitionMoneyDTO getFeeAmount() {
		return this.feeAmount;
	}
	public void setFeeAmount(TuitionMoneyDTO feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getFeeName() {
		return this.feeName;
	}
	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

}
