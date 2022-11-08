package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.memberwallet.return.submit response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-31 15:26:28
 */
public class AntMerchantMemberwalletReturnSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 8559979995635497817L;

	/** 
	 * 退款成功的卡余额（单位：元）
	 */
	@ApiField("actual_return_amount")
	private String actualReturnAmount;

	/** 
	 * 退款成功的卡余额（单位：元）
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
