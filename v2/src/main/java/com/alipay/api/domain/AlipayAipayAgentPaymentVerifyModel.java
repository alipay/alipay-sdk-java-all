package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * A2A商户支付凭证验证
 *
 * @author auto create
 * @since 1.0, 2026-07-07 12:22:55
 */
public class AlipayAipayAgentPaymentVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 4154575412235838896L;

	/**
	 * 客户端会话标识，用于校验买家安全性、真实性
	 */
	@ApiField("client_session")
	private String clientSession;

	/**
	 * 支付凭证
	 */
	@ApiField("payment_proof")
	private String paymentProof;

	/**
	 * 支付宝交易号，交易的唯一标识
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getClientSession() {
		return this.clientSession;
	}
	public void setClientSession(String clientSession) {
		this.clientSession = clientSession;
	}

	public String getPaymentProof() {
		return this.paymentProof;
	}
	public void setPaymentProof(String paymentProof) {
		this.paymentProof = paymentProof;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
