package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖进订单退单
 *
 * @author auto create
 * @since 1.0, 2025-01-27 22:46:40
 */
public class AlipayOfflineProviderNsalesOrderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4453181596417399548L;

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
