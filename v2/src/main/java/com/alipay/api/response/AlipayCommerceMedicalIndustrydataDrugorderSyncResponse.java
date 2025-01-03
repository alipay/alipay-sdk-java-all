package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.drugorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 19:33:12
 */
public class AlipayCommerceMedicalIndustrydataDrugorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8263219462788434425L;

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
