package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RentInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.order.invest.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-05 10:58:36
 */
public class AlipayCommerceRentOrderInvestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8367596814721698217L;

	/** 
	 * 租赁订单详情，包括业务订单详情、分期计划、分账计划、租赁订单信息
	 */
	@ApiField("rent_info")
	private RentInfo rentInfo;

	public void setRentInfo(RentInfo rentInfo) {
		this.rentInfo = rentInfo;
	}
	public RentInfo getRentInfo( ) {
		return this.rentInfo;
	}

}
