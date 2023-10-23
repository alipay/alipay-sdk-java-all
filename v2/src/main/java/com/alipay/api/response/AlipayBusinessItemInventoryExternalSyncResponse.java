package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.item.inventory.external.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 23:00:07
 */
public class AlipayBusinessItemInventoryExternalSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1824147346411572142L;

	/** 
	 * 支付宝商品id列表
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/** 
	 * 入参中的request_id
	 */
	@ApiField("request_id")
	private String requestId;

	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}
	public List<String> getItemIds( ) {
		return this.itemIds;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
