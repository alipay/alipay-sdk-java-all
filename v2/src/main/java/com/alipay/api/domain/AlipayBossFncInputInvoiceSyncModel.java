package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 增量同步欢行蚂蚁发票
 *
 * @author auto create
 * @since 1.0, 2024-12-02 11:04:53
 */
public class AlipayBossFncInputInvoiceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5625285444996298958L;

	/**
	 * 入参
	 */
	@ApiField("sync_invoice_open_api_order")
	private SyncInvoiceOpenApiOrder syncInvoiceOpenApiOrder;

	public SyncInvoiceOpenApiOrder getSyncInvoiceOpenApiOrder() {
		return this.syncInvoiceOpenApiOrder;
	}
	public void setSyncInvoiceOpenApiOrder(SyncInvoiceOpenApiOrder syncInvoiceOpenApiOrder) {
		this.syncInvoiceOpenApiOrder = syncInvoiceOpenApiOrder;
	}

}
