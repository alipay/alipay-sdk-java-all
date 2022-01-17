package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoDeliveryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.delivery.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-11 17:49:10
 */
public class AlipayMarketingActivityDeliveryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5886685391653952389L;

	/** 
	 * 投放信息列表
	 */
	@ApiListField("delivery_info_list")
	@ApiField("promo_delivery_info")
	private List<PromoDeliveryInfo> deliveryInfoList;

	public void setDeliveryInfoList(List<PromoDeliveryInfo> deliveryInfoList) {
		this.deliveryInfoList = deliveryInfoList;
	}
	public List<PromoDeliveryInfo> getDeliveryInfoList( ) {
		return this.deliveryInfoList;
	}

}
