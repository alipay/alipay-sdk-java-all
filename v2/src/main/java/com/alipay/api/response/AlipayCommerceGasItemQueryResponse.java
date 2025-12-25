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
 * @since 1.0, 2025-12-03 14:49:27
 */
public class AlipayCommerceGasItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5297458813656298835L;

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
