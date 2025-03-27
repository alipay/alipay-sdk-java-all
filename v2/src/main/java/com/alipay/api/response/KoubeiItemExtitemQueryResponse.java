package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExtItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.item.extitem.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:27
 */
public class KoubeiItemExtitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5873429562114232344L;

	/** 
	 * 商品信息
	 */
	@ApiField("extitem")
	private ExtItem extitem;

	public void setExtitem(ExtItem extitem) {
		this.extitem = extitem;
	}
	public ExtItem getExtitem( ) {
		return this.extitem;
	}

}
