package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DeductionOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.deductionorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-16 11:12:07
 */
public class AlipayCommerceMerchantcardDeductionorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6422184749785899599L;

	/** 
	 * 核销订单信息
	 */
	@ApiField("deduction_order_info")
	private DeductionOrderInfo deductionOrderInfo;

	public void setDeductionOrderInfo(DeductionOrderInfo deductionOrderInfo) {
		this.deductionOrderInfo = deductionOrderInfo;
	}
	public DeductionOrderInfo getDeductionOrderInfo( ) {
		return this.deductionOrderInfo;
	}

}
