package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 00:39:18
 */
public class MybankEcnyTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1777652165313888612L;

	/** 
	 * 买家钱包ID，支付成功时必填
	 */
	@ApiField("buyer_wallet_id")
	private String buyerWalletId;

	/** 
	 * 买家钱包名称，支付成功时必填
	 */
	@ApiField("buyer_wallet_name")
	private String buyerWalletName;

	/** 
	 * 调用方订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 运营机构交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setBuyerWalletId(String buyerWalletId) {
		this.buyerWalletId = buyerWalletId;
	}
	public String getBuyerWalletId( ) {
		return this.buyerWalletId;
	}

	public void setBuyerWalletName(String buyerWalletName) {
		this.buyerWalletName = buyerWalletName;
	}
	public String getBuyerWalletName( ) {
		return this.buyerWalletName;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
