package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceTradeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.user.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 15:41:58
 */
public class AlipayEbppInvoiceUserTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3285929276799433634L;

	/** 
	 * 发票管家发票交易信息
	 */
	@ApiField("trade_info")
	private InvoiceTradeInfo tradeInfo;

	public void setTradeInfo(InvoiceTradeInfo tradeInfo) {
		this.tradeInfo = tradeInfo;
	}
	public InvoiceTradeInfo getTradeInfo( ) {
		return this.tradeInfo;
	}

}
