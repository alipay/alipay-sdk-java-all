package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemDetailInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.item.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-14 11:17:23
 */
public class AlipayCommerceMedicalItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3412782258526221991L;

	/** 
	 * 门店商品详情信息列表，包含单规格/多规格售卖信息
	 */
	@ApiListField("item_list")
	@ApiField("item_detail_info_d_t_o")
	private List<ItemDetailInfoDTO> itemList;

	public void setItemList(List<ItemDetailInfoDTO> itemList) {
		this.itemList = itemList;
	}
	public List<ItemDetailInfoDTO> getItemList( ) {
		return this.itemList;
	}

}
