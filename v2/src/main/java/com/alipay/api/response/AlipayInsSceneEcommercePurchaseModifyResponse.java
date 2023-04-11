package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.purchase.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 10:53:51
 */
public class AlipayInsSceneEcommercePurchaseModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6182464677721177123L;

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
