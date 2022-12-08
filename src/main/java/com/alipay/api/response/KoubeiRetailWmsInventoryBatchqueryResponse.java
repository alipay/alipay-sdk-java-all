package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Inventory;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.inventory.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 13:17:14
 */
public class KoubeiRetailWmsInventoryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4796638651191874599L;

	/** 
	 * 库存列表
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
