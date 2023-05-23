package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV金额信息DTO
 *
 * @author auto create
 * @since 1.0, 2023-05-06 16:05:07
 */
public class IndrISVAmountInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2469252688324749285L;

	/**
	 * 费用明细。（目前费用明细包含支付宝手续费、足额到账费，费用名称分别为hanlding_fee、full_value_fee）
	 */
	@ApiField("charge_details")
	private IndrISVChargeDetailDTO chargeDetails;

	/**
	 * 汇率（精确到小数点后8位）
	 */
	@ApiField("exchange_rate")
	private String exchangeRate;

	/**
	 * 原金额
	 */
	@ApiField("original_amount")
	private IndrMoneyDTO originalAmount;

	/**
	 * 目标金额
	 */
	@ApiField("target_amount")
	private IndrMoneyDTO targetAmount;

	/**
	 * 总金额
	 */
	@ApiField("total_amount")
	private IndrMoneyDTO totalAmount;

	public IndrISVChargeDetailDTO getChargeDetails() {
		return this.chargeDetails;
	}
	public void setChargeDetails(IndrISVChargeDetailDTO chargeDetails) {
		this.chargeDetails = chargeDetails;
	}

	public String getExchangeRate() {
		return this.exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public IndrMoneyDTO getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(IndrMoneyDTO originalAmount) {
		this.originalAmount = originalAmount;
	}

	public IndrMoneyDTO getTargetAmount() {
		return this.targetAmount;
	}
	public void setTargetAmount(IndrMoneyDTO targetAmount) {
		this.targetAmount = targetAmount;
	}

	public IndrMoneyDTO getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(IndrMoneyDTO totalAmount) {
		this.totalAmount = totalAmount;
	}

}
