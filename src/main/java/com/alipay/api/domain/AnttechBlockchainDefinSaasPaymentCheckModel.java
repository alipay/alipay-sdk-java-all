package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链B2B资金服务交易前检查
 *
 * @author auto create
 * @since 1.0, 2022-08-25 21:01:26
 */
public class AnttechBlockchainDefinSaasPaymentCheckModel extends AlipayObject {

	private static final long serialVersionUID = 1822597646968663658L;

	/**
	 * 资金模式，SALE销售模式用于即时到账业务；AUTH_CAPTURE预授权模式用于担保交易业务；
	 */
	@ApiField("fund_mode")
	private String fundMode;

	/**
	 * 交易类型。ACQUIRE 收单业务；DEPOSIT 纯资金充值业务；TRANSFER 纯资金转账业务；WITHDRAW 纯资金提现业务
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 收款方外部业务平台会员
	 */
	@ApiField("payee_out_member_id")
	private ReferenceId payeeOutMemberId;

	/**
	 * 付款方外部业务平台会员
	 */
	@ApiField("payer_out_member_id")
	private ReferenceId payerOutMemberId;

	/**
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	public String getFundMode() {
		return this.fundMode;
	}
	public void setFundMode(String fundMode) {
		this.fundMode = fundMode;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public ReferenceId getPayeeOutMemberId() {
		return this.payeeOutMemberId;
	}
	public void setPayeeOutMemberId(ReferenceId payeeOutMemberId) {
		this.payeeOutMemberId = payeeOutMemberId;
	}

	public ReferenceId getPayerOutMemberId() {
		return this.payerOutMemberId;
	}
	public void setPayerOutMemberId(ReferenceId payerOutMemberId) {
		this.payerOutMemberId = payerOutMemberId;
	}

	public String getPlatformMemberId() {
		return this.platformMemberId;
	}
	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}

}
