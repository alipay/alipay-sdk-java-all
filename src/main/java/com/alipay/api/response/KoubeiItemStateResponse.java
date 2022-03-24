package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.state response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiItemStateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8419323958614785997L;

	/** 
	 * 口碑体系内部商品的唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 即入参中的request_id
	 */
	@ApiField("request_id")
	private String requestId;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

}
