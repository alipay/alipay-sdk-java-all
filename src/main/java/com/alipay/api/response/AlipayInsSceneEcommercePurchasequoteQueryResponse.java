package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PurchaseQueryResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.purchasequote.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-23 16:31:44
 */
public class AlipayInsSceneEcommercePurchasequoteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5516637839743194321L;

	/** 
	 * 订购查询结果
	 */
	@ApiField("purchase_query_results")
	private PurchaseQueryResultDTO purchaseQueryResults;

	public void setPurchaseQueryResults(PurchaseQueryResultDTO purchaseQueryResults) {
		this.purchaseQueryResults = purchaseQueryResults;
	}
	public PurchaseQueryResultDTO getPurchaseQueryResults( ) {
		return this.purchaseQueryResults;
	}

}
