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
 * @since 1.0, 2022-06-17 16:40:54
 */
public class KoubeiSalesKbassetStuffPurordersendSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5763671496514162328L;

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
