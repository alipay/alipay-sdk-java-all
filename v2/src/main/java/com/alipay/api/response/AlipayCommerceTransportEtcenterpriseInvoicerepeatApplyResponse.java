package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EtcInoviceRepeatTradeList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etcenterprise.invoicerepeat.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:05
 */
public class AlipayCommerceTransportEtcenterpriseInvoicerepeatApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1469524796491882592L;

	/** 
	 * 匹配到的交易
	 */
	@ApiListField("trade_list")
	@ApiField("etc_inovice_repeat_trade_list")
	private List<EtcInoviceRepeatTradeList> tradeList;

	public void setTradeList(List<EtcInoviceRepeatTradeList> tradeList) {
		this.tradeList = tradeList;
	}
	public List<EtcInoviceRepeatTradeList> getTradeList( ) {
		return this.tradeList;
	}

}
