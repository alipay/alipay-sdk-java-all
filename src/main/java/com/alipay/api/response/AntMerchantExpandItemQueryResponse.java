package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 17:02:28
 */
public class AntMerchantExpandItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4252954881224575916L;

	/** 
	 * 商品列表
	 */
	@ApiListField("item_list")
	@ApiField("item_model")
	private List<ItemModel> itemList;

	public void setItemList(List<ItemModel> itemList) {
		this.itemList = itemList;
	}
	public List<ItemModel> getItemList( ) {
		return this.itemList;
	}

}
