package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.purchase.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-28 00:02:53
 */
public class AlipayInsSceneEcommercePurchaseModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5738317759154777255L;

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
