package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryOrderProcessVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.wms.deliveryorderprocess.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:37
 */
public class KoubeiRetailWmsDeliveryorderprocessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5451818738311261386L;

	/** 
	 * 物流单据状态列表
	 */
	@ApiListField("delivery_order_process_vo_list")
	@ApiField("delivery_order_process_v_o")
	private List<DeliveryOrderProcessVO> deliveryOrderProcessVoList;

	public void setDeliveryOrderProcessVoList(List<DeliveryOrderProcessVO> deliveryOrderProcessVoList) {
		this.deliveryOrderProcessVoList = deliveryOrderProcessVoList;
	}
	public List<DeliveryOrderProcessVO> getDeliveryOrderProcessVoList( ) {
		return this.deliveryOrderProcessVoList;
	}

}
