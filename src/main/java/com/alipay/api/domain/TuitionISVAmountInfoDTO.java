package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 留学缴费-金额信息
 *
 * @author auto create
 * @since 1.0, 2021-08-16 15:52:26
 */
public class TuitionISVAmountInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3661233138755753291L;

	/**
	 * 费用明细
	 */
	@ApiListField("charge_details")
	@ApiField("tuition_i_s_v_charge_detail_d_t_o")
	private List<TuitionISVChargeDetailDTO> chargeDetails;

	/**
	 * 汇率（精确到小数点后8位）
	 */
	@ApiField("exchange_rate")
	private String exchangeRate;

	/**
	 * 原金额
	 */
	@ApiField("original_amount")
	private TuitionMoneyDTO originalAmount;

	/**
	 * 目标金额
	 */
	@ApiField("target_amount")
	private TuitionMoneyDTO targetAmount;

	/**
	 * 总金额
	 */
	@ApiField("total_amount")
	private TuitionMoneyDTO totalAmount;

	public List<TuitionISVChargeDetailDTO> getChargeDetails() {
		return this.chargeDetails;
	}
	public void setChargeDetails(List<TuitionISVChargeDetailDTO> chargeDetails) {
		this.chargeDetails = chargeDetails;
	}

	public String getExchangeRate() {
		return this.exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public TuitionMoneyDTO getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(TuitionMoneyDTO originalAmount) {
		this.originalAmount = originalAmount;
	}

	public TuitionMoneyDTO getTargetAmount() {
		return this.targetAmount;
	}
	public void setTargetAmount(TuitionMoneyDTO targetAmount) {
		this.targetAmount = targetAmount;
	}

	public TuitionMoneyDTO getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(TuitionMoneyDTO totalAmount) {
		this.totalAmount = totalAmount;
	}

}
