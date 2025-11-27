package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.alter.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-26 21:02:41
 */
public class AlipayCloudCloudbaseResourcepackageAlterConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4739254413711298649L;

	/** 
	 * 变配类型
 - ALTERATION_UP
 - ALTERATION_DOWN
	 */
	@ApiField("alter_type")
	private String alterType;

	/** 
	 * 币种
 - CNY
 - USD
 - EUR
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 支付方向 
- RECEIVABLE(应收)
- REFUNDABLE(应退)
- CURR_SPEC_HAS_PAY(当前规格已购)
- WAIT_DOWN_STARTED(降配待生效)
- CURR_SPEC_CANT_DOWN(当前规格无法降配,剩余生效周期不足一个月)
	 */
	@ApiField("original_payment_direction")
	private String originalPaymentDirection;

	/** 
	 * 原价差额(分)
	 */
	@ApiField("original_total_amount")
	private String originalTotalAmount;

	/** 
	 * 支付方向
 - RECEIVABLE
 - REFUNDABLE
 - CURR_SPEC_HAS_PAY
 - WAIT_DOWN_STARTED
 - CURR_SPEC_CANT_DOWN
 - INSTANCE_IS_BEING_AMORTIZED
	 */
	@ApiField("payment_direction")
	private String paymentDirection;

	/** 
	 * 差额价(分)
	 */
	@ApiField("trade_total_amount")
	private String tradeTotalAmount;

	public void setAlterType(String alterType) {
		this.alterType = alterType;
	}
	public String getAlterType( ) {
		return this.alterType;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setOriginalPaymentDirection(String originalPaymentDirection) {
		this.originalPaymentDirection = originalPaymentDirection;
	}
	public String getOriginalPaymentDirection( ) {
		return this.originalPaymentDirection;
	}

	public void setOriginalTotalAmount(String originalTotalAmount) {
		this.originalTotalAmount = originalTotalAmount;
	}
	public String getOriginalTotalAmount( ) {
		return this.originalTotalAmount;
	}

	public void setPaymentDirection(String paymentDirection) {
		this.paymentDirection = paymentDirection;
	}
	public String getPaymentDirection( ) {
		return this.paymentDirection;
	}

	public void setTradeTotalAmount(String tradeTotalAmount) {
		this.tradeTotalAmount = tradeTotalAmount;
	}
	public String getTradeTotalAmount( ) {
		return this.tradeTotalAmount;
	}

}
