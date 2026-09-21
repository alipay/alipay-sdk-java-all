package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.equity.custbilldownloadtask.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-21 14:42:51
 */
public class AnttechMorseMarketingEquityCustbilldownloadtaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4586753451282342949L;

	/** 
	 * 根据创建接口获取到的账单任务id
	 */
	@ApiField("bill_application_id")
	private String billApplicationId;

	public void setBillApplicationId(String billApplicationId) {
		this.billApplicationId = billApplicationId;
	}
	public String getBillApplicationId( ) {
		return this.billApplicationId;
	}

}
