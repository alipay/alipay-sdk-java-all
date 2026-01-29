package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 线下租赁实物购买
 *
 * @author auto create
 * @since 1.0, 2025-09-30 10:47:48
 */
public class RentOfflineShoppingDTO extends AlipayObject {

	private static final long serialVersionUID = 6759832563268945181L;

	/**
	 * 支付信息
	 */
	@ApiListField("purchase_infos")
	@ApiField("purchase_info")
	private List<PurchaseInfo> purchaseInfos;

	/**
	 * 关联租赁订单
	 */
	@ApiField("relate_order_id")
	private String relateOrderId;

	public List<PurchaseInfo> getPurchaseInfos() {
		return this.purchaseInfos;
	}
	public void setPurchaseInfos(List<PurchaseInfo> purchaseInfos) {
		this.purchaseInfos = purchaseInfos;
	}

	public String getRelateOrderId() {
		return this.relateOrderId;
	}
	public void setRelateOrderId(String relateOrderId) {
		this.relateOrderId = relateOrderId;
	}

}
