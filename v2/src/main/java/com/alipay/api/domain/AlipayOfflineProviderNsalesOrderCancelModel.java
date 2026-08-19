package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进订单退单
 *
 * @author auto create
 * @since 1.0, 2026-08-18 14:13:34
 */
public class AlipayOfflineProviderNsalesOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2144622482794573834L;

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
