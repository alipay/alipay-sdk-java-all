package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemBean;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.category.batchitem.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-11 15:42:27
 */
public class AlipayOfflineSmddCategoryBatchitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8574395452317517852L;

	/** 
	 * 商品列表
	 */
	@ApiListField("item_list")
	@ApiField("item_bean")
	private List<ItemBean> itemList;

	public void setItemList(List<ItemBean> itemList) {
		this.itemList = itemList;
	}
	public List<ItemBean> getItemList( ) {
		return this.itemList;
	}

}
