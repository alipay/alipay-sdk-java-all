package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AccountDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.saas.payment.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-25 22:26:45
 */
public class AnttechBlockchainDefinSaasPaymentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7176949114949397522L;

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
	 * 收款方外部业务平台会员ID，收单场景表示卖家，纯资金场景表示收款方
	 */
	@ApiField("out_payee_id")
	private String outPayeeId;

	/** 
	 * 付款方在外部业务平台的用户ID
	 */
	@ApiField("out_payer_id")
	private String outPayerId;

	/** 
	 * 收款方账号
	 */
	@ApiField("payee_account")
	private AccountDTO payeeAccount;

	/** 
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

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

	public void setOutPayeeId(String outPayeeId) {
		this.outPayeeId = outPayeeId;
	}
	public String getOutPayeeId( ) {
		return this.outPayeeId;
	}

	public void setOutPayerId(String outPayerId) {
		this.outPayerId = outPayerId;
	}
	public String getOutPayerId( ) {
		return this.outPayerId;
	}

	public void setPayeeAccount(AccountDTO payeeAccount) {
		this.payeeAccount = payeeAccount;
	}
	public AccountDTO getPayeeAccount( ) {
		return this.payeeAccount;
	}

	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}
	public String getPlatformMemberId( ) {
		return this.platformMemberId;
	}

}
