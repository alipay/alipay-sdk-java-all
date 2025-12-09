package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公积金房租支付订单查询
 *
 * @author auto create
 * @since 1.0, 2024-08-26 16:26:00
 */
public class AlipayEbppIndustryRentAccfundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1136838557798416763L;

	/**
	 * 支付宝交易订单单号
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
