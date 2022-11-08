package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apeshopid.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-12 17:56:49
 */
public class AlipayDigitalopUcdpApeshopidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5219275127556675756L;

	/** 
	 * 支付宝侧门店ID，如果没有查询到会返回-1
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
