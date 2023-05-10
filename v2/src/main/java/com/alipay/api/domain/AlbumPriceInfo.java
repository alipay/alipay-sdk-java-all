package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专辑价格信息
 *
 * @author auto create
 * @since 1.0, 2023-04-12 20:10:14
 */
public class AlbumPriceInfo extends AlipayObject {

	private static final long serialVersionUID = 8221257324782236358L;

	/**
	 * 已废弃。营销活动实际价格填写在promo_info中的discount_price
	 */
	@ApiField("actual_price")
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
	 * 销售方式：ALBUM（专辑整本售卖）、SINGLE_SOUND（单集售卖）；
收费专辑必填。
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
