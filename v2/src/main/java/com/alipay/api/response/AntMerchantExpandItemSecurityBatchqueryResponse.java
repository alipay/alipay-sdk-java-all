package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CmItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.security.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-28 20:27:46
 */
public class AntMerchantExpandItemSecurityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5599654919567153823L;

	/** 
	 * 商品列表
	 */
	@ApiListField("item_list")
	@ApiField("cm_item_info")
	private List<CmItemInfo> itemList;

	public void setItemList(List<CmItemInfo> itemList) {
		this.itemList = itemList;
	}
	public List<CmItemInfo> getItemList( ) {
		return this.itemList;
	}

}
