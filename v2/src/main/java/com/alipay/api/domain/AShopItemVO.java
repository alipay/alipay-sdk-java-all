package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-02 11:47:51
 */
public class AShopItemVO extends AlipayObject {

	private static final long serialVersionUID = 7534859495847672824L;

	/**
	 * 平台侧编码itemId
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品子类型
	 */
	@ApiField("item_sub_type")
	private String itemSubType;

	/**
	 * 商家编码out_item_id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 价格单位
	 */
	@ApiField("price_unit")
	private String priceUnit;

	/**
	 * 售价,单位:元
	 */
	@ApiField("sale_price")
	private String salePrice;

	/**
	 * 售卖状态
AVAILABLE=出售中/DELISTING=已下架
	 */
	@ApiField("sell_status")
	private String sellStatus;

	/**
	 * 售卖结束时间
	 */
	@ApiField("sold_end_time")
	private String soldEndTime;

	/**
	 * 售卖时间
	 */
	@ApiField("sold_start_time")
	private String soldStartTime;

	/**
	 * 商品的名称
	 */
	@ApiField("title")
	private String title;

	/**
	 * 库存总量,单位:个
	 */
	@ApiField("total_quantity")
	private Long totalQuantity;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemSubType() {
		return this.itemSubType;
	}
	public void setItemSubType(String itemSubType) {
		this.itemSubType = itemSubType;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	public String getSellStatus() {
		return this.sellStatus;
	}
	public void setSellStatus(String sellStatus) {
		this.sellStatus = sellStatus;
	}

	public String getSoldEndTime() {
		return this.soldEndTime;
	}
	public void setSoldEndTime(String soldEndTime) {
		this.soldEndTime = soldEndTime;
	}

	public String getSoldStartTime() {
		return this.soldStartTime;
	}
	public void setSoldStartTime(String soldStartTime) {
		this.soldStartTime = soldStartTime;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getTotalQuantity() {
		return this.totalQuantity;
	}
	public void setTotalQuantity(Long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

}
