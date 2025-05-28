package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.roomrent.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-01 13:42:04
 */
public class AlipayOpenAppRoomrentDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4325652579912617964L;

	/** 
	 * 支付宝平台侧商品ID列表，最多20个。
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	/** 
	 * 支付宝商家侧商品ID列表，最多20个。
	 */
	@ApiListField("out_item_id_list")
	@ApiField("string")
	private List<String> outItemIdList;

	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
	}
	public List<String> getItemIdList( ) {
		return this.itemIdList;
	}

	public void setOutItemIdList(List<String> outItemIdList) {
		this.outItemIdList = outItemIdList;
	}
	public List<String> getOutItemIdList( ) {
		return this.outItemIdList;
	}

}
