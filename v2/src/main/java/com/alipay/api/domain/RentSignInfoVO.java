package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单支付产品、信用产品签约信息
 *
 * @author auto create
 * @since 1.0, 2025-07-02 15:11:59
 */
public class RentSignInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3264889752868316959L;

	/**
	 * 信用产品信息
	 */
	@ApiField("credit_info")
	private RentCreditInfoVO creditInfo;

	/**
	 * 预授权信息
	 */
	@ApiField("fund_auth_freeze_info")
	private RentFundAuthFreezeInfoVO fundAuthFreezeInfo;

	/**
	 * 租赁代扣信息
	 */
	@ApiField("rent_deduct_info")
	private RentDeductInfoVO rentDeductInfo;

	public RentCreditInfoVO getCreditInfo() {
		return this.creditInfo;
	}
	public void setCreditInfo(RentCreditInfoVO creditInfo) {
		this.creditInfo = creditInfo;
	}

	public RentFundAuthFreezeInfoVO getFundAuthFreezeInfo() {
		return this.fundAuthFreezeInfo;
	}
	public void setFundAuthFreezeInfo(RentFundAuthFreezeInfoVO fundAuthFreezeInfo) {
		this.fundAuthFreezeInfo = fundAuthFreezeInfo;
	}

	public RentDeductInfoVO getRentDeductInfo() {
		return this.rentDeductInfo;
	}
	public void setRentDeductInfo(RentDeductInfoVO rentDeductInfo) {
		this.rentDeductInfo = rentDeductInfo;
	}

}
