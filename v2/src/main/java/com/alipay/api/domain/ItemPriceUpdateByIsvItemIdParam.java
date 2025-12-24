package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于外部服务商修改疫苗商品价格入参
 *
 * @author auto create
 * @since 1.0, 2025-09-26 14:24:47
 */
public class ItemPriceUpdateByIsvItemIdParam extends AlipayObject {

	private static final long serialVersionUID = 2172828186492114277L;

	/**
	 * 服务商商品id
	 */
	@ApiField("isv_item_id")
	private String isvItemId;

	/**
	 * 价格，单位元。币种 ：人民币。
	 */
	@ApiField("price")
	private String price;

	public String getIsvItemId() {
		return this.isvItemId;
	}
	public void setIsvItemId(String isvItemId) {
		this.isvItemId = isvItemId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
