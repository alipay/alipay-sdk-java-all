package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品列表
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:19:05
 */
public class ItemPrizeInfo extends AlipayObject {

	private static final long serialVersionUID = 6424852811232695833L;

	/**
	 * 奖品是否能兑换
	 */
	@ApiField("item_can_exchange")
	private Boolean itemCanExchange;

	/**
	 * 奖品code,唯一标识
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 奖品图标链接
	 */
	@ApiField("item_icon_url")
	private String itemIconUrl;

	/**
	 * 奖品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 奖品价格
	 */
	@ApiField("item_price")
	private String itemPrice;

	public Boolean getItemCanExchange() {
		return this.itemCanExchange;
	}
	public void setItemCanExchange(Boolean itemCanExchange) {
		this.itemCanExchange = itemCanExchange;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemIconUrl() {
		return this.itemIconUrl;
	}
	public void setItemIconUrl(String itemIconUrl) {
		this.itemIconUrl = itemIconUrl;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

}
