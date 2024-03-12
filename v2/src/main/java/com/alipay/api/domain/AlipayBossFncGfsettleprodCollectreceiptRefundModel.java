package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收款单退款
 *
 * @author auto create
 * @since 1.0, 2023-04-07 17:53:42
 */
public class AlipayBossFncGfsettleprodCollectreceiptRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7724176968725297661L;

	/**
	 * 收款单退款申请请求
	 */
	@ApiField("collect_receipt_refund_apply_order")
	private CollectReceiptRefundApplyOrder collectReceiptRefundApplyOrder;

	public CollectReceiptRefundApplyOrder getCollectReceiptRefundApplyOrder() {
		return this.collectReceiptRefundApplyOrder;
	}
	public void setCollectReceiptRefundApplyOrder(CollectReceiptRefundApplyOrder collectReceiptRefundApplyOrder) {
		this.collectReceiptRefundApplyOrder = collectReceiptRefundApplyOrder;
	}

}
