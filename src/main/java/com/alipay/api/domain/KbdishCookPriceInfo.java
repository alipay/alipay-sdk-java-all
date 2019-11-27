package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜谱价格
 *
 * @author auto create
 * @since 1.0, 2019-01-08 15:32:42
 */
public class KbdishCookPriceInfo extends AlipayObject {

	private static final long serialVersionUID = 6119172621457417579L;

	/**
	 * 菜单id
	 */
	@ApiField("cook_id")
	private String cookId;

	/**
	 * 菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 会员价，目前已废弃
	 */
	@ApiField("member_price")
	private String memberPrice;

	/**
	 * 售卖价格
	 */
	@ApiField("sell_price")
	private String sellPrice;

	/**
	 * skuid
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getCookId() {
		return this.cookId;
	}
	public void setCookId(String cookId) {
		this.cookId = cookId;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getMemberPrice() {
		return this.memberPrice;
	}
	public void setMemberPrice(String memberPrice) {
		this.memberPrice = memberPrice;
	}

	public String getSellPrice() {
		return this.sellPrice;
	}
	public void setSellPrice(String sellPrice) {
		this.sellPrice = sellPrice;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
