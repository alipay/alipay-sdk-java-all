package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.procurement.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-18 10:16:45
 */
public class AlipayCommerceRentProcurementOrderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 3362629691226967558L;

	/** 
	 * 取消状态：APPROVING（审核中）、SUCCESS（成功）、FAIL（失败）
	 */
	@ApiField("cancel_status")
	private String cancelStatus;

	/** 
	 * 供应链采购单号
	 */
	@ApiField("procurement_order_id")
	private String procurementOrderId;

	public void setCancelStatus(String cancelStatus) {
		this.cancelStatus = cancelStatus;
	}
	public String getCancelStatus( ) {
		return this.cancelStatus;
	}

	public void setProcurementOrderId(String procurementOrderId) {
		this.procurementOrderId = procurementOrderId;
	}
	public String getProcurementOrderId( ) {
		return this.procurementOrderId;
	}

}
