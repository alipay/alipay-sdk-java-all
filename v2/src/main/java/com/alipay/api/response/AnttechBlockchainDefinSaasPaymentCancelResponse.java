package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.saas.payment.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-22 14:52:15
 */
public class AnttechBlockchainDefinSaasPaymentCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1649473412684566421L;

	/** 
	 * 可用金额，单位为元。可用金额=总金额-已请款金额-已撤销金额。精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
	 */
	@ApiField("available_currency")
	private String availableCurrency;

	/** 
	 * 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
	 */
	@ApiField("fund_mode")
	private String fundMode;

	/** 
	 * 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败);
CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败);
REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败);
CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
	 */
	@ApiField("order_state")
	private String orderState;

	/** 
	 * 外部业务平台原始交易号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 外部请求ID，需要支持部分请款/退款的平台必填
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	/** 
	 * 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
	 */
	@ApiField("state")
	private String state;

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setAvailableCurrency(String availableCurrency) {
		this.availableCurrency = availableCurrency;
	}
	public String getAvailableCurrency( ) {
		return this.availableCurrency;
	}

	public void setFundMode(String fundMode) {
		this.fundMode = fundMode;
	}
	public String getFundMode( ) {
		return this.fundMode;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public String getOrderState( ) {
		return this.orderState;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setOutRequestId(String outRequestId) {
		this.outRequestId = outRequestId;
	}
	public String getOutRequestId( ) {
		return this.outRequestId;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

}
