package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AccountDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.saas.payment.pay response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-22 14:49:31
 */
public class AnttechBlockchainDefinSaasPaymentPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3893329862428759238L;

	/** 
	 * 资金流模型
	 */
	@ApiField("fund_mode")
	private String fundMode;

	/** 
	 * 交易单状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
	 */
	@ApiField("order_state")
	private String orderState;

	/** 
	 * 外部业务平台原始交易号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 收款方账号
	 */
	@ApiField("payee_account")
	private AccountDTO payeeAccount;

	/** 
	 * 银行或其他支付服务提供方支付结果描述
	 */
	@ApiField("payment_error_message")
	private String paymentErrorMessage;

	/** 
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	/** 
	 * 支付提交状态
支付处理中: INIT（一般为提交银行超时导致）
支付提交成功: SUBMIT_SUCCESS
支付提交失败: SUBMIT_FAIL
	 */
	@ApiField("state")
	private String state;

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

	public void setPayeeAccount(AccountDTO payeeAccount) {
		this.payeeAccount = payeeAccount;
	}
	public AccountDTO getPayeeAccount( ) {
		return this.payeeAccount;
	}

	public void setPaymentErrorMessage(String paymentErrorMessage) {
		this.paymentErrorMessage = paymentErrorMessage;
	}
	public String getPaymentErrorMessage( ) {
		return this.paymentErrorMessage;
	}

	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}
	public String getPlatformMemberId( ) {
		return this.platformMemberId;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

}
