package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV计费详情DTO
 *
 * @author auto create
 * @since 1.0, 2023-05-06 14:26:46
 */
public class IndrISVChargeDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 6689235693496781487L;

	/**
	 * 费用金额
	 */
	@ApiField("fee_amount")
	private IndrMoneyDTO feeAmount;

	/**
	 * 费用名称
	 */
	@ApiField("fee_name")
	private String feeName;

	public IndrMoneyDTO getFeeAmount() {
		return this.feeAmount;
	}
	public void setFeeAmount(IndrMoneyDTO feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getFeeName() {
		return this.feeName;
	}
	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}

}
