package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进订单退单
 *
 * @author auto create
 * @since 1.0, 2025-02-27 14:32:00
 */
public class AlipayOfflineProviderNsalesOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3445312837328761412L;

	/**
	 * 卖进订单id
	 */
	@ApiField("sales_entry_order_id")
	private String salesEntryOrderId;

	public String getSalesEntryOrderId() {
		return this.salesEntryOrderId;
	}
	public void setSalesEntryOrderId(String salesEntryOrderId) {
		this.salesEntryOrderId = salesEntryOrderId;
	}

}
