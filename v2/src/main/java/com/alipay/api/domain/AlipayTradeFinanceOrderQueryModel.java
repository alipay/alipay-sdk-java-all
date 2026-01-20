package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融服务订单查询
 *
 * @author auto create
 * @since 1.0, 2025-12-17 16:57:34
 */
public class AlipayTradeFinanceOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1394435139691148631L;

	/**
	 * 支付宝金融服务订单号（alipay.trade.finance.precreate接口返回settlement_no）
	 */
	@ApiField("settlement_no")
	private String settlementNo;

	public String getSettlementNo() {
		return this.settlementNo;
	}
	public void setSettlementNo(String settlementNo) {
		this.settlementNo = settlementNo;
	}

}
