package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaxiOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.orderlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 16:29:13
 */
public class AlipayCommerceTransportTaxiOrderlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2554464946597316687L;

	/** 
	 * 出租车订单列表
	 */
	@ApiListField("taxi_order")
	@ApiField("taxi_order")
	private List<TaxiOrder> taxiOrder;

	public void setTaxiOrder(List<TaxiOrder> taxiOrder) {
		this.taxiOrder = taxiOrder;
	}
	public List<TaxiOrder> getTaxiOrder( ) {
		return this.taxiOrder;
	}

}
