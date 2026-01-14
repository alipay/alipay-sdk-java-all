package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FinanceBillInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.finance.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-17 17:02:41
 */
public class AlipayTradeFinanceOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1735975636193142769L;

	/** 
	 * 金融服务子单列表
	 */
	@ApiListField("finance_bill_list")
	@ApiField("finance_bill_info")
	private List<FinanceBillInfo> financeBillList;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 支付宝金融服务订单号
	 */
	@ApiField("settlement_no")
	private String settlementNo;

	public void setFinanceBillList(List<FinanceBillInfo> financeBillList) {
		this.financeBillList = financeBillList;
	}
	public List<FinanceBillInfo> getFinanceBillList( ) {
		return this.financeBillList;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setSettlementNo(String settlementNo) {
		this.settlementNo = settlementNo;
	}
	public String getSettlementNo( ) {
		return this.settlementNo;
	}

}
