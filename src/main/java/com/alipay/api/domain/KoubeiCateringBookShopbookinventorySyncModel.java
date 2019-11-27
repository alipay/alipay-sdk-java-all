package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订座可用库存数据回流
 *
 * @author auto create
 * @since 1.0, 2019-05-13 17:36:22
 */
public class KoubeiCateringBookShopbookinventorySyncModel extends AlipayObject {

	private static final long serialVersionUID = 5734228661333852273L;

	/**
	 * 库存信息
	 */
	@ApiListField("inventory")
	@ApiField("shop_book_inventory")
	private List<ShopBookInventory> inventory;

	/**
	 * 美味门店ID
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 口碑门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 时间戳，用作数据的版本号，取系统当前时间即可
	 */
	@ApiField("sync_timestamp")
	private String syncTimestamp;

	public List<ShopBookInventory> getInventory() {
		return this.inventory;
	}
	public void setInventory(List<ShopBookInventory> inventory) {
		this.inventory = inventory;
	}

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSyncTimestamp() {
		return this.syncTimestamp;
	}
	public void setSyncTimestamp(String syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

}
