package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.purchase response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 22:57:41
 */
public class AlipayInsSceneEcommercePurchaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7558884714242338341L;

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
