package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询核销订单详情
 *
 * @author auto create
 * @since 1.0, 2025-07-07 09:48:08
 */
public class AlipayCommerceMoneycardRecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5492971847967517978L;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
