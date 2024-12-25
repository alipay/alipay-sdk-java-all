package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认收货
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:12:47
 */
public class AlipayCloudCloudpromoMallOrderConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 5258395337793937349L;

	/**
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 采购单号
	 */
	@ApiField("purchase_order_id")
	private String purchaseOrderId;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPurchaseOrderId() {
		return this.purchaseOrderId;
	}
	public void setPurchaseOrderId(String purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

}
