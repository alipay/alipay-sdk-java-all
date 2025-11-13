package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.purchase.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 10:49:45
 */
public class AlipayCloudCloudpromoMallPurchaseCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1546932848335732182L;

	/** 
	 * 采购单id
	 */
	@ApiField("purchase_order_id")
	private String purchaseOrderId;

	public void setPurchaseOrderId(String purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}
	public String getPurchaseOrderId( ) {
		return this.purchaseOrderId;
	}

}
