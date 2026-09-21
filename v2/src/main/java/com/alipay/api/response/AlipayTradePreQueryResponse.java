package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.pre.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-21 10:32:55
 */
public class AlipayTradePreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7773912441287157143L;

	/** 
	 * 卖家账号类型，1:单位、2:个人。
	 */
	@ApiField("seller_type")
	private String sellerType;

	public void setSellerType(String sellerType) {
		this.sellerType = sellerType;
	}
	public String getSellerType( ) {
		return this.sellerType;
	}

}
