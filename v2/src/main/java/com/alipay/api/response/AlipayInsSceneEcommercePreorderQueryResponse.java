package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsPreOrderDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.preorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:48:19
 */
public class AlipayInsSceneEcommercePreorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2867441272283992282L;

	/** 
	 * 预下单列表
	 */
	@ApiListField("pre_orders")
	@ApiField("ins_pre_order_d_t_o")
	private List<InsPreOrderDTO> preOrders;

	public void setPreOrders(List<InsPreOrderDTO> preOrders) {
		this.preOrders = preOrders;
	}
	public List<InsPreOrderDTO> getPreOrders( ) {
		return this.preOrders;
	}

}
