package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 物流仓库供应商推送实时仓库库存数据接口
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:22:50
 */
public class KoubeiSalesKbassetStuffInventoryrealtimeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6682661695137963852L;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 库存时间
	 */
	@ApiField("inventory_time")
	private String inventoryTime;

	/**
	 * 库存明细
	 */
	@ApiListField("items")
	@ApiField("inventory_item")
	private List<InventoryItem> items;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getInventoryTime() {
		return this.inventoryTime;
	}
	public void setInventoryTime(String inventoryTime) {
		this.inventoryTime = inventoryTime;
	}

	public List<InventoryItem> getItems() {
		return this.items;
	}
	public void setItems(List<InventoryItem> items) {
		this.items = items;
	}

}
