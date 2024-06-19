package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccessPurchaseOrderSendResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.purordersend.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:35:24
 */
public class KoubeiSalesKbassetStuffPurordersendSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4128576347446772912L;

	/** 
	 * 供应商同步发货信息及物流信息处理结果列表
	 */
	@ApiListField("purchase_order_send_results")
	@ApiField("access_purchase_order_send_result")
	private List<AccessPurchaseOrderSendResult> purchaseOrderSendResults;

	public void setPurchaseOrderSendResults(List<AccessPurchaseOrderSendResult> purchaseOrderSendResults) {
		this.purchaseOrderSendResults = purchaseOrderSendResults;
	}
	public List<AccessPurchaseOrderSendResult> getPurchaseOrderSendResults( ) {
		return this.purchaseOrderSendResults;
	}

}
