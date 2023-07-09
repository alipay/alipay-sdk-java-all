package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 兑换商品信息
 *
 * @author auto create
 * @since 1.0, 2023-06-01 17:31:33
 */
public class VoucherExchangeGoodsInfo extends AlipayObject {

	private static final long serialVersionUID = 3456923786367964479L;

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
