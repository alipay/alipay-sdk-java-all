package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收款单查询
 *
 * @author auto create
 * @since 1.0, 2021-10-12 16:01:05
 */
public class AlipayBossFncCollectreceiptReceiptQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8696136593482326941L;

	/**
	 * 收款单openapi查询Order
	 */
	@ApiField("collect_receipt_query_open_api_order")
	private CollectReceiptQueryOpenApiOrder collectReceiptQueryOpenApiOrder;

	public CollectReceiptQueryOpenApiOrder getCollectReceiptQueryOpenApiOrder() {
		return this.collectReceiptQueryOpenApiOrder;
	}
	public void setCollectReceiptQueryOpenApiOrder(CollectReceiptQueryOpenApiOrder collectReceiptQueryOpenApiOrder) {
		this.collectReceiptQueryOpenApiOrder = collectReceiptQueryOpenApiOrder;
	}

}
