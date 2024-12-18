package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询核销订单详情
 *
 * @author auto create
 * @since 1.0, 2024-11-15 16:02:20
 */
public class AlipayCommerceMoneycardRecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5872596939871687674L;

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
