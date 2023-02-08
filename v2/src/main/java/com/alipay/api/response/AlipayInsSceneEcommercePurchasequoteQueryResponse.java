package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PurchaseQueryResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.purchasequote.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:07:14
 */
public class AlipayInsSceneEcommercePurchasequoteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4655975667531899181L;

	/** 
	 * 订购查询结果
	 */
	@ApiListField("purchase_query_results")
	@ApiField("purchase_query_result_d_t_o")
	private List<PurchaseQueryResultDTO> purchaseQueryResults;

	public void setPurchaseQueryResults(List<PurchaseQueryResultDTO> purchaseQueryResults) {
		this.purchaseQueryResults = purchaseQueryResults;
	}
	public List<PurchaseQueryResultDTO> getPurchaseQueryResults( ) {
		return this.purchaseQueryResults;
	}

}
