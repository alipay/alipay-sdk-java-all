package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.premium.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-18 14:47:42
 */
public class AlipayOpenAppItemPremiumCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8791335236122489274L;

	/** 
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 结果描述
	 */
	@ApiField("reason")
	private String reason;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

}
