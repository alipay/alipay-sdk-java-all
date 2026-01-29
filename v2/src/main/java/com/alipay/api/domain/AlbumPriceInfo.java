package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专辑价格信息
 *
 * @author auto create
 * @since 1.0, 2024-09-03 11:41:01
 */
public class AlbumPriceInfo extends AlipayObject {

	private static final long serialVersionUID = 7127545368599496712L;

	/**
	 * 专辑价格，单位元。已废弃。 当前字段已废弃(废弃actual_price字段，使用price字段)
	 */
	@ApiField("actual_price")
	@Deprecated
	private String actualPrice;

	/**
	 * 仅面向专辑购买时无法通过专辑ID发起的场景，无相关需求可不填。
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 专辑原价。单位元，最多两位小数。收费专辑必填。
	 */
	@ApiField("price")
	private String price;

	/**
	 * 专辑的销售方式
	 */
	@ApiField("sell_type")
	private String sellType;

	public String getActualPrice() {
		return this.actualPrice;
	}
	public void setActualPrice(String actualPrice) {
		this.actualPrice = actualPrice;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSellType() {
		return this.sellType;
	}
	public void setSellType(String sellType) {
		this.sellType = sellType;
	}

}
