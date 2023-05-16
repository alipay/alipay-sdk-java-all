package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.purchase response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 17:37:34
 */
public class AlipayInsSceneEcommercePurchaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5562361474316512966L;

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
