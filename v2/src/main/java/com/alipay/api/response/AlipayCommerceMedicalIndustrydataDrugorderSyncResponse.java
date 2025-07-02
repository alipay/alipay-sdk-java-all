package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.drugorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-06 16:07:22
 */
public class AlipayCommerceMedicalIndustrydataDrugorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7712861162184992523L;

	/** 
	 * 支付宝药品订单号
	 */
	@ApiField("drug_order_id")
	private String drugOrderId;

	public void setDrugOrderId(String drugOrderId) {
		this.drugOrderId = drugOrderId;
	}
	public String getDrugOrderId( ) {
		return this.drugOrderId;
	}

}
