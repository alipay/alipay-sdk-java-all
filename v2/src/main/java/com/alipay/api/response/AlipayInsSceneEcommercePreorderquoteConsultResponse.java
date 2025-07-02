package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsPreOrderDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.preorderquote.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-28 00:26:51
 */
public class AlipayInsSceneEcommercePreorderquoteConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4859387759478357735L;

	/** 
	 * 预下单数据及最新报价
	 */
	@ApiField("pre_order")
	private InsPreOrderDTO preOrder;

	public void setPreOrder(InsPreOrderDTO preOrder) {
		this.preOrder = preOrder;
	}
	public InsPreOrderDTO getPreOrder( ) {
		return this.preOrder;
	}

}
