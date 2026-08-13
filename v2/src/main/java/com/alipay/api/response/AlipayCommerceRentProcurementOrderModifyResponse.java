package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.procurement.order.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-05 14:07:52
 */
public class AlipayCommerceRentProcurementOrderModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6521993289174635565L;

	/** 
	 * 修改状态
	 */
	@ApiField("modify_status")
	private String modifyStatus;

	/** 
	 * 平台采购订单ID
	 */
	@ApiField("procurement_order_id")
	private String procurementOrderId;

	public void setModifyStatus(String modifyStatus) {
		this.modifyStatus = modifyStatus;
	}
	public String getModifyStatus( ) {
		return this.modifyStatus;
	}

	public void setProcurementOrderId(String procurementOrderId) {
		this.procurementOrderId = procurementOrderId;
	}
	public String getProcurementOrderId( ) {
		return this.procurementOrderId;
	}

}
