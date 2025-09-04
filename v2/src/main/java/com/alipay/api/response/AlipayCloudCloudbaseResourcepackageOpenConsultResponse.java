package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.resourcepackage.open.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 11:10:41
 */
public class AlipayCloudCloudbaseResourcepackageOpenConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7835686569639219294L;

	/** 
	 * 币种
 - CNY
 - USD
 - EUR
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 原始总价(分)
	 */
	@ApiField("original_total_amount")
	private String originalTotalAmount;

	/** 
	 * 原始单价(分)
	 */
	@ApiField("original_unit_amount")
	private String originalUnitAmount;

	/** 
	 * 折扣后总价(分)
	 */
	@ApiField("trade_total_amount")
	private String tradeTotalAmount;

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setOriginalTotalAmount(String originalTotalAmount) {
		this.originalTotalAmount = originalTotalAmount;
	}
	public String getOriginalTotalAmount( ) {
		return this.originalTotalAmount;
	}

	public void setOriginalUnitAmount(String originalUnitAmount) {
		this.originalUnitAmount = originalUnitAmount;
	}
	public String getOriginalUnitAmount( ) {
		return this.originalUnitAmount;
	}

	public void setTradeTotalAmount(String tradeTotalAmount) {
		this.tradeTotalAmount = tradeTotalAmount;
	}
	public String getTradeTotalAmount( ) {
		return this.tradeTotalAmount;
	}

}
