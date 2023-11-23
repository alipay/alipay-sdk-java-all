package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.alter.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-22 19:36:42
 */
public class AlipayCloudCloudbaseResourcepackageAlterConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7118139947548614288L;

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
 - RECEIVABLE
 - REFUNDABLE
 - CURR_SPEC_HAS_PAY
 - WAIT_DOWN_STARTED
 - CURR_SPEC_CANT_DOWN
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
