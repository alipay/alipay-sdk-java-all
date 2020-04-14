package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * kms烘焙数据同步
 *
 * @author auto create
 * @since 1.0, 2020-04-10 11:57:17
 */
public class KoubeiCateringKmsBakingSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7632424511575298159L;

	/**
	 * 同步:sync;
	 */
	@ApiField("action")
	private String action;

	/**
	 * 烘焙库存数据，根据type选填，一次最多批量同步100条数据。
	 */
	@ApiListField("inventory_data")
	@ApiField("kms_baking_inventory_d_t_o")
	private List<KmsBakingInventoryDTO> inventoryData;

	/**
	 * 口碑门店Id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 库存：inventory
	 */
	@ApiField("type")
	private String type;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public List<KmsBakingInventoryDTO> getInventoryData() {
		return this.inventoryData;
	}
	public void setInventoryData(List<KmsBakingInventoryDTO> inventoryData) {
		this.inventoryData = inventoryData;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
