package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LiveStoreItemInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.commercial.storeitem.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-17 14:41:55
 */
public class AlipayContentCommercialStoreitemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3677818412857666627L;

	/** 
	 * 带货车商品相关信息结果
	 */
	@ApiListField("item_info_list")
	@ApiField("live_store_item_info_d_t_o")
	private List<LiveStoreItemInfoDTO> itemInfoList;

	public void setItemInfoList(List<LiveStoreItemInfoDTO> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}
	public List<LiveStoreItemInfoDTO> getItemInfoList( ) {
		return this.itemInfoList;
	}

}
