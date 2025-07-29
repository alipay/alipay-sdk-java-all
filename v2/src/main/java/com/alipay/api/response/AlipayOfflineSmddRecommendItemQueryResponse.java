package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemBean;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.recommend.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-11 15:42:27
 */
public class AlipayOfflineSmddRecommendItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1681622454766635969L;

	/** 
	 * 商品对象
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
