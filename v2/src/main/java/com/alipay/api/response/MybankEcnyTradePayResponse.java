package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.trade.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-25 17:44:15
 */
public class MybankEcnyTradePayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4424848689861567944L;

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
	 * 交易支付时间，支付成功时必填
	 */
	@ApiField("gmt_payment")
	private Date gmtPayment;

	/** 
	 * 调用方订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 交易金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 运营机构交易号，支付成功时必填
	 */
	@ApiField("trade_no")
	private String tradeNo;

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

	public void setGmtPayment(Date gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public Date getGmtPayment( ) {
		return this.gmtPayment;
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

}
