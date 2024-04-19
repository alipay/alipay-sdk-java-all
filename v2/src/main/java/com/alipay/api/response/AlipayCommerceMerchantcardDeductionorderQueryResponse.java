package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DeductionOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.deductionorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-18 18:07:01
 */
public class AlipayCommerceMerchantcardDeductionorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5842826495394832381L;

	/** 
	 * 扣款单信息
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
