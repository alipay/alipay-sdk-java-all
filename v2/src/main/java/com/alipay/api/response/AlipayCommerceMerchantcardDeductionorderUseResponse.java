package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.deductionorder.use response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-23 17:30:13
 */
public class AlipayCommerceMerchantcardDeductionorderUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8525787573238137448L;

	/** 
	 * 核销订单id
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}
	public String getDeductionOrderId( ) {
		return this.deductionOrderId;
	}

}
