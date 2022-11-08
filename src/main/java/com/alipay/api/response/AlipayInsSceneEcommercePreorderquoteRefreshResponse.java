package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsPreOrderDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.preorderquote.refresh response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-30 22:26:44
 */
public class AlipayInsSceneEcommercePreorderquoteRefreshResponse extends AlipayResponse {

	private static final long serialVersionUID = 8145998693156471461L;

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
