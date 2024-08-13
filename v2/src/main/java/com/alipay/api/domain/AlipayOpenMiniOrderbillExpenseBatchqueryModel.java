package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据交易号批量查询费用信息
 *
 * @author auto create
 * @since 1.0, 2024-05-21 21:52:59
 */
public class AlipayOpenMiniOrderbillExpenseBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4828488161759598482L;

	/**
	 * 支付宝交易号列表，最多10个
	 */
	@ApiListField("trade_no_list")
	@ApiField("string")
	private List<String> tradeNoList;

	public List<String> getTradeNoList() {
		return this.tradeNoList;
	}
	public void setTradeNoList(List<String> tradeNoList) {
		this.tradeNoList = tradeNoList;
	}

}
