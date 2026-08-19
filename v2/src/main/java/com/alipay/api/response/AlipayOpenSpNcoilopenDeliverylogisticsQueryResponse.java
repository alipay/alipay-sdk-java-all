package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryLogistics;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.ncoilopen.deliverylogistics.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-18 10:17:47
 */
public class AlipayOpenSpNcoilopenDeliverylogisticsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7278422911954893218L;

	/** 
	 * null
	 */
	@ApiListField("delivery_infos")
	@ApiField("delivery_logistics")
	private List<DeliveryLogistics> deliveryInfos;

	/** 
	 * 订单编号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setDeliveryInfos(List<DeliveryLogistics> deliveryInfos) {
		this.deliveryInfos = deliveryInfos;
	}
	public List<DeliveryLogistics> getDeliveryInfos( ) {
		return this.deliveryInfos;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
