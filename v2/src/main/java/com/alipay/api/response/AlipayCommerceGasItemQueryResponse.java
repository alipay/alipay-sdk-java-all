package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FuelItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-10 11:52:40
 */
public class AlipayCommerceGasItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4358491175726813181L;

	/** 
	 * null
	 */
	@ApiListField("item_list")
	@ApiField("fuel_item_info")
	private List<FuelItemInfo> itemList;

	public void setItemList(List<FuelItemInfo> itemList) {
		this.itemList = itemList;
	}
	public List<FuelItemInfo> getItemList( ) {
		return this.itemList;
	}

}
