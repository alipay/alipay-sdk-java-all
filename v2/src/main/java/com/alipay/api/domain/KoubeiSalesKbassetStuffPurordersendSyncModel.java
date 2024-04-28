package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 采购单发货通知接口
 *
 * @author auto create
 * @since 1.0, 2022-12-26 18:16:19
 */
public class KoubeiSalesKbassetStuffPurordersendSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4497423435881231732L;

	/**
	 * 供应商同步的发货信息及物流信息记录（最多100条）
	 */
	@ApiListField("purchase_order_sends")
	@ApiField("access_purchase_order_send")
	private List<AccessPurchaseOrderSend> purchaseOrderSends;

	public List<AccessPurchaseOrderSend> getPurchaseOrderSends() {
		return this.purchaseOrderSends;
	}
	public void setPurchaseOrderSends(List<AccessPurchaseOrderSend> purchaseOrderSends) {
		this.purchaseOrderSends = purchaseOrderSends;
	}

}
