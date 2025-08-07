package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单支付产品、信用产品签约信息（租赁单独发起签约使用）
 *
 * @author auto create
 * @since 1.0, 2025-07-30 10:44:04
 */
public class RentDoSignInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8736679556813771749L;

	/**
	 * 预授权信息。不传表示当前订单不使用预授权及芝麻免押
	 */
	@ApiField("fund_auth_freeze_info")
	private RentSignFundAuthFreezeInfoDTO fundAuthFreezeInfo;

	/**
	 * 租赁代扣信息。不传表示当前订单不使用代扣。
	 */
	@ApiField("rent_deduct_info")
	private RentSignDeductInfoDTO rentDeductInfo;

	public RentSignFundAuthFreezeInfoDTO getFundAuthFreezeInfo() {
		return this.fundAuthFreezeInfo;
	}
	public void setFundAuthFreezeInfo(RentSignFundAuthFreezeInfoDTO fundAuthFreezeInfo) {
		this.fundAuthFreezeInfo = fundAuthFreezeInfo;
	}

	public RentSignDeductInfoDTO getRentDeductInfo() {
		return this.rentDeductInfo;
	}
	public void setRentDeductInfo(RentSignDeductInfoDTO rentDeductInfo) {
		this.rentDeductInfo = rentDeductInfo;
	}

}
