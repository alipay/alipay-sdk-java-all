package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.purchase.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-20 11:20:01
 */
public class AlipayInsSceneEcommercePurchaseCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7427956498334573192L;

	/** 
	 * 订购合约id
	 */
	@ApiField("purchase_contract_id")
	private String purchaseContractId;

	public void setPurchaseContractId(String purchaseContractId) {
		this.purchaseContractId = purchaseContractId;
	}
	public String getPurchaseContractId( ) {
		return this.purchaseContractId;
	}

}
