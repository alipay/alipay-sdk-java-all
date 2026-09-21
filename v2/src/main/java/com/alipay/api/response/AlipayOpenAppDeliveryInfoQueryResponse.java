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
 * @since 1.0, 2026-09-11 18:11:22
 */
public class AlipayOpenAppDeliveryInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7517198458924453255L;

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
