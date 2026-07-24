package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代扣查询明细
 *
 * @author auto create
 * @since 1.0, 2026-07-21 17:02:51
 */
public class TransferQueryResult extends AlipayObject {

	private static final long serialVersionUID = 2734478351593743427L;

	/**
	 * 支付单支付宝交易号
	 */
	@ApiField("pay_order_trade_no")
	private String payOrderTradeNo;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 转支付结果
	 */
	@ApiField("transfer_pay_results")
	private String transferPayResults;

	public String getPayOrderTradeNo() {
		return this.payOrderTradeNo;
	}
	public void setPayOrderTradeNo(String payOrderTradeNo) {
		this.payOrderTradeNo = payOrderTradeNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTransferPayResults() {
		return this.transferPayResults;
	}
	public void setTransferPayResults(String transferPayResults) {
		this.transferPayResults = transferPayResults;
	}

}
