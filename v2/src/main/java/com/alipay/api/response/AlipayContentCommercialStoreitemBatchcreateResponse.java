package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LiveStoreItemInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.commercial.storeitem.batchcreate response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-31 16:52:02
 */
public class AlipayContentCommercialStoreitemBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5318165378275774286L;

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
