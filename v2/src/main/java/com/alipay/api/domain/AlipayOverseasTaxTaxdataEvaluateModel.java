package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户退税评估
 *
 * @author auto create
 * @since 1.0, 2025-11-19 10:43:58
 */
public class AlipayOverseasTaxTaxdataEvaluateModel extends AlipayObject {

	private static final long serialVersionUID = 6876871982874285499L;

	/**
	 * 评估类型，可选值：
BY_PHONE   手机号
BY_USER_ID  用户uid
BY_CODE  码值
BY_UNIFIED_ID  统一Id
	 */
	@ApiField("evaluation_type")
	private String evaluationType;

	/**
	 * 实际退给用户的退税金额
	 */
	@ApiField("final_refund_amount")
	private String finalRefundAmount;

	/**
	 * 实际退给用户的币种(仅支持CNY )
	 */
	@ApiField("final_refund_currency")
	private String finalRefundCurrency;

	/**
	 * 手机号或者支付宝uid
	 */
	@ApiField("payment_method_id")
	private String paymentMethodId;

	/**
	 * 退税金额，数值，最多两位小数，例如人民币，单位为元 Example:1400.00
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退税币种
	 */
	@ApiField("refund_currency")
	private String refundCurrency;

	public String getEvaluationType() {
		return this.evaluationType;
	}
	public void setEvaluationType(String evaluationType) {
		this.evaluationType = evaluationType;
	}

	public String getFinalRefundAmount() {
		return this.finalRefundAmount;
	}
	public void setFinalRefundAmount(String finalRefundAmount) {
		this.finalRefundAmount = finalRefundAmount;
	}

	public String getFinalRefundCurrency() {
		return this.finalRefundCurrency;
	}
	public void setFinalRefundCurrency(String finalRefundCurrency) {
		this.finalRefundCurrency = finalRefundCurrency;
	}

	public String getPaymentMethodId() {
		return this.paymentMethodId;
	}
	public void setPaymentMethodId(String paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundCurrency() {
		return this.refundCurrency;
	}
	public void setRefundCurrency(String refundCurrency) {
		this.refundCurrency = refundCurrency;
	}

}
