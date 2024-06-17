package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DeductionOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.deductionorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-30 09:42:02
 */
public class AlipayCommerceMerchantcardDeductionorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6744368923519819192L;

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
