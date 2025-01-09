package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.royalty.seller.append response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-09 11:17:24
 */
public class AlipayCommerceRentRoyaltySellerAppendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8793413632736194411L;

	/** 
	 * 单位：元。补分账金额执行的实际金额
	 */
	@ApiField("execute_amount")
	private String executeAmount;

	/** 
	 * 当前履约号
	 */
	@ApiField("installment_id")
	private String installmentId;

	/** 
	 * 执行后的代偿资金订单号，也是交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setExecuteAmount(String executeAmount) {
		this.executeAmount = executeAmount;
	}
	public String getExecuteAmount( ) {
		return this.executeAmount;
	}

	public void setInstallmentId(String installmentId) {
		this.installmentId = installmentId;
	}
	public String getInstallmentId( ) {
		return this.installmentId;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
