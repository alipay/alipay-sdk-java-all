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
 * @since 1.0, 2022-08-29 20:41:48
 */
public class AlipayInsSceneEcommercePreorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4612722695796256548L;

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
