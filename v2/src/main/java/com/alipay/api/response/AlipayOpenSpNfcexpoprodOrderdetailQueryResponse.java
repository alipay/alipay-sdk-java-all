package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderDetailOpenApiResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nfcexpoprod.orderdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-25 10:08:48
 */
public class AlipayOpenSpNfcexpoprodOrderdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1288417125194349369L;

	/** 
	 * null
	 */
	@ApiListField("order_detail_list")
	@ApiField("order_detail_open_api_response")
	private List<OrderDetailOpenApiResponse> orderDetailList;

	/** 
	 * NORMAL-普通订单，GROUP-组合单
	 */
	@ApiField("order_type")
	private String orderType;

	public void setOrderDetailList(List<OrderDetailOpenApiResponse> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	public List<OrderDetailOpenApiResponse> getOrderDetailList( ) {
		return this.orderDetailList;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

}
