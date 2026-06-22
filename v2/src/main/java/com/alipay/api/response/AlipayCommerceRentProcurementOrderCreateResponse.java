package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.procurement.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-26 11:12:45
 */
public class AlipayCommerceRentProcurementOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8183431484562776738L;

	/** 
	 * 商户外部采购单号
	 */
	@ApiField("out_procurement_order_id")
	private String outProcurementOrderId;

	/** 
	 * 平台供应链采购单号
	 */
	@ApiField("procurement_order_id")
	private String procurementOrderId;

	public void setOutProcurementOrderId(String outProcurementOrderId) {
		this.outProcurementOrderId = outProcurementOrderId;
	}
	public String getOutProcurementOrderId( ) {
		return this.outProcurementOrderId;
	}

	public void setProcurementOrderId(String procurementOrderId) {
		this.procurementOrderId = procurementOrderId;
	}
	public String getProcurementOrderId( ) {
		return this.procurementOrderId;
	}

}
