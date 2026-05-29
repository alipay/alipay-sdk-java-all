package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁采购信息
 *
 * @author auto create
 * @since 1.0, 2026-05-18 14:11:17
 */
public class RentProcurementInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2624977123628162466L;

	/**
	 * 关联租赁采购单id
	 */
	@ApiField("procurement_order_id")
	private String procurementOrderId;

	public String getProcurementOrderId() {
		return this.procurementOrderId;
	}
	public void setProcurementOrderId(String procurementOrderId) {
		this.procurementOrderId = procurementOrderId;
	}

}
