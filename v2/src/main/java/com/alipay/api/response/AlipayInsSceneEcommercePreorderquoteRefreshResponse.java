package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsPreOrderDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.preorderquote.refresh response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:37:28
 */
public class AlipayInsSceneEcommercePreorderquoteRefreshResponse extends AlipayResponse {

	private static final long serialVersionUID = 3144925788635242218L;

	/** 
	 * 更新后的预下单数据
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
