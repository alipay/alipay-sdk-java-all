package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderGoodDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.energy.receive.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-10 16:27:36
 */
public class AlipayCommerceEnergyReceiveSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4264568627583192399L;

	/** 
	 * 交易订单中，对应的商品列表中有对应的环保类型，能量发放结果;
	 */
	@ApiListField("order_good_list")
	@ApiField("order_good_d_t_o")
	private List<OrderGoodDTO> orderGoodList;

	/** 
	 * 能量发放总克数
	 */
	@ApiField("total_energy_amount")
	private String totalEnergyAmount;

	public void setOrderGoodList(List<OrderGoodDTO> orderGoodList) {
		this.orderGoodList = orderGoodList;
	}
	public List<OrderGoodDTO> getOrderGoodList( ) {
		return this.orderGoodList;
	}

	public void setTotalEnergyAmount(String totalEnergyAmount) {
		this.totalEnergyAmount = totalEnergyAmount;
	}
	public String getTotalEnergyAmount( ) {
		return this.totalEnergyAmount;
	}

}
