package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.item.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:27
 */
public class KoubeiCateringItemModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4513446119874277592L;

	/** 
	 * 口碑体系内部商品的唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 支持英文字母和数字，由开发者自行定义（不允许重复）
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
