package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝脱机交易结算
 *
 * @author auto create
 * @since 1.0, 2022-11-03 20:22:58
 */
public class AlipayCommerceTransportOfflinepayTradeSettleModel extends AlipayObject {

	private static final long serialVersionUID = 7357555634391122777L;

	/**
	 * 脱机交易列表
	 */
	@ApiListField("trade_list")
	@ApiField("alipay_offline_trade")
	private List<AlipayOfflineTrade> tradeList;

	public List<AlipayOfflineTrade> getTradeList() {
		return this.tradeList;
	}
	public void setTradeList(List<AlipayOfflineTrade> tradeList) {
		this.tradeList = tradeList;
	}

}
