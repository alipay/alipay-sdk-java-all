package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccessPurchaseOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.purchaseorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:16
 */
public class KoubeiSalesKbassetStuffPurchaseorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8677661682283689844L;

	/** 
	 * 采购单记录集合
	 */
	@ApiListField("asset_purchase_orders")
	@ApiField("access_purchase_order")
	private List<AccessPurchaseOrder> assetPurchaseOrders;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	public void setAssetPurchaseOrders(List<AccessPurchaseOrder> assetPurchaseOrders) {
		this.assetPurchaseOrders = assetPurchaseOrders;
	}
	public List<AccessPurchaseOrder> getAssetPurchaseOrders( ) {
		return this.assetPurchaseOrders;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

}
