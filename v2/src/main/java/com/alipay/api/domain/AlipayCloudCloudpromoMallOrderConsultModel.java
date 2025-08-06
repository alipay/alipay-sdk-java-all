package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序云查询采购单状态与对应绑定订单
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:14:35
 */
public class AlipayCloudCloudpromoMallOrderConsultModel extends AlipayObject {

	private static final long serialVersionUID = 8299431474814665528L;

	/**
	 * 采购单id
	 */
	@ApiField("purchase_order_id")
	private String purchaseOrderId;

	public String getPurchaseOrderId() {
		return this.purchaseOrderId;
	}
	public void setPurchaseOrderId(String purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

}
