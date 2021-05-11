package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多币种模型
 *
 * @author auto create
 * @since 1.0, 2020-01-06 14:36:17
 */
public class MutipleCurrencyDetail extends AlipayObject {

	private static final long serialVersionUID = 4416126743894314529L;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 支付金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 支付币种
	 */
	@ApiField("payment_currency")
	private String paymentCurrency;

	/**
	 * 清算金额
	 */
	@ApiField("settlement_amount")
	private String settlementAmount;

	/**
	 * 清算币种
	 */
	@ApiField("settlement_currency")
	private String settlementCurrency;

	/**
	 * 转账金额
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/**
	 * 转账币种
	 */
	@ApiField("trans_currency")
	private String transCurrency;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentCurrency() {
		return this.paymentCurrency;
	}
	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public String getSettlementAmount() {
		return this.settlementAmount;
	}
	public void setSettlementAmount(String settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public String getSettlementCurrency() {
		return this.settlementCurrency;
	}
	public void setSettlementCurrency(String settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransCurrency() {
		return this.transCurrency;
	}
	public void setTransCurrency(String transCurrency) {
		this.transCurrency = transCurrency;
	}

}
