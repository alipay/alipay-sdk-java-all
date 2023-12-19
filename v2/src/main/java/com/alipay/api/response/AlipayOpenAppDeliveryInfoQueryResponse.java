package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemDeliveryInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.delivery.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-24 14:56:53
 */
public class AlipayOpenAppDeliveryInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6438274912375876974L;

	/** 
	 * 履约信息列表
	 */
	@ApiListField("delivery_infos")
	@ApiField("item_delivery_info_v_o")
	private List<ItemDeliveryInfoVO> deliveryInfos;

	public void setDeliveryInfos(List<ItemDeliveryInfoVO> deliveryInfos) {
		this.deliveryInfos = deliveryInfos;
	}
	public List<ItemDeliveryInfoVO> getDeliveryInfos( ) {
		return this.deliveryInfos;
	}

}
