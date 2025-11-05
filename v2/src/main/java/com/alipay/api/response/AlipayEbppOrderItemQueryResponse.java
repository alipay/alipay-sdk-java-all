package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EbppOrderItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.order.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayEbppOrderItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2116226743719594199L;

	/** 
	 * 订单项
	 */
	@ApiField("item")
	private EbppOrderItem item;

	public void setItem(EbppOrderItem item) {
		this.item = item;
	}
	public EbppOrderItem getItem( ) {
		return this.item;
	}

}
