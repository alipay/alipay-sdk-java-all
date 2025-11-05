package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemPrizeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.item.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 16:47:41
 */
public class AlipayCommerceOperationItemListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7378461258878128211L;

	/** 
	 * 奖品列表
	 */
	@ApiListField("item_list")
	@ApiField("item_prize_info")
	private List<ItemPrizeInfo> itemList;

	public void setItemList(List<ItemPrizeInfo> itemList) {
		this.itemList = itemList;
	}
	public List<ItemPrizeInfo> getItemList( ) {
		return this.itemList;
	}

}
