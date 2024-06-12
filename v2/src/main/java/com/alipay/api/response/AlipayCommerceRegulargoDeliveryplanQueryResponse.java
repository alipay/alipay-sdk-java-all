package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryFulfillmentVO;
import com.alipay.api.domain.DeliverySubOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.regulargo.deliveryplan.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-29 14:21:59
 */
public class AlipayCommerceRegulargoDeliveryplanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5466933141267264983L;

	/** 
	 * 配送计划中的履约信息
	 */
	@ApiField("fulfillment_info")
	private DeliveryFulfillmentVO fulfillmentInfo;

	/** 
	 * 配送计划中的子单列表
	 */
	@ApiListField("sub_order_list")
	@ApiField("delivery_sub_order_v_o")
	private List<DeliverySubOrderVO> subOrderList;

	public void setFulfillmentInfo(DeliveryFulfillmentVO fulfillmentInfo) {
		this.fulfillmentInfo = fulfillmentInfo;
	}
	public DeliveryFulfillmentVO getFulfillmentInfo( ) {
		return this.fulfillmentInfo;
	}

	public void setSubOrderList(List<DeliverySubOrderVO> subOrderList) {
		this.subOrderList = subOrderList;
	}
	public List<DeliverySubOrderVO> getSubOrderList( ) {
		return this.subOrderList;
	}

}
