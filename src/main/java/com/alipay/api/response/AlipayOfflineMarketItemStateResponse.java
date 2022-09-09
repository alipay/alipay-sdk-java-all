package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.item.state response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-05 15:10:42
 */
public class AlipayOfflineMarketItemStateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2284215569616847174L;

	/** 
	 * 口碑体系内部商品的唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 支持英文字母和数字，由开发者自行定义（不允许重复），在商品notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应
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
