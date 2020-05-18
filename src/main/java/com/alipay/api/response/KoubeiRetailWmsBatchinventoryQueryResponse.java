package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Inventory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.batchinventory.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiRetailWmsBatchinventoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8265123638745181714L;

	/** 
	 * 库存信息列表
	 */
	@ApiListField("inventory_list")
	@ApiField("inventory")
	private List<Inventory> inventoryList;

	public void setInventoryList(List<Inventory> inventoryList) {
		this.inventoryList = inventoryList;
	}
	public List<Inventory> getInventoryList( ) {
		return this.inventoryList;
	}

}
