package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁采购单查询
 *
 * @author auto create
 * @since 1.0, 2026-05-26 11:17:45
 */
public class AlipayCommerceRentProcurementOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2635775518669381862L;

	/**
	 * 商户外部采购单号（与procurement_order_id二选一）
	 */
	@ApiField("out_procurement_order_id")
	private String outProcurementOrderId;

	/**
	 * 供应链采购单号（与out_procurement_order_id二选一）
	 */
	@ApiField("procurement_order_id")
	private String procurementOrderId;

	public String getOutProcurementOrderId() {
		return this.outProcurementOrderId;
	}
	public void setOutProcurementOrderId(String outProcurementOrderId) {
		this.outProcurementOrderId = outProcurementOrderId;
	}

	public String getProcurementOrderId() {
		return this.procurementOrderId;
	}
	public void setProcurementOrderId(String procurementOrderId) {
		this.procurementOrderId = procurementOrderId;
	}

}
