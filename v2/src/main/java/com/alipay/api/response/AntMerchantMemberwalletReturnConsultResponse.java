package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.memberwallet.return.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:30:09
 */
public class AntMerchantMemberwalletReturnConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 2792573597797792545L;

	/** 
	 * 实际可退卡余额（单位：元）
	 */
	@ApiField("actual_return_amount")
	private String actualReturnAmount;

	/** 
	 * 可退卡余额（单位：元）
	 */
	@ApiField("return_amount")
	private String returnAmount;

	public void setActualReturnAmount(String actualReturnAmount) {
		this.actualReturnAmount = actualReturnAmount;
	}
	public String getActualReturnAmount( ) {
		return this.actualReturnAmount;
	}

	public void setReturnAmount(String returnAmount) {
		this.returnAmount = returnAmount;
	}
	public String getReturnAmount( ) {
		return this.returnAmount;
	}

}
