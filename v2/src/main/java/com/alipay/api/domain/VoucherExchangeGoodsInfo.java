package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换商品信息
 *
 * @author auto create
 * @since 1.0, 2023-07-21 11:25:47
 */
public class VoucherExchangeGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 2532382558177757683L;

	/**
	 * 兑换商品名称
	 */
	@ApiField("exchange_goods_name")
	private String exchangeGoodsName;

	public String getExchangeGoodsName() {
		return this.exchangeGoodsName;
	}
	public void setExchangeGoodsName(String exchangeGoodsName) {
		this.exchangeGoodsName = exchangeGoodsName;
	}

}
