package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜谱价格
 *
 * @author auto create
 * @since 1.0, 2018-09-11 14:28:14
 */
public class KbdishCookPriceInfo extends AlipayObject {

	private static final long serialVersionUID = 7852755865741411249L;

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
	 * 会员价
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
