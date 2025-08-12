package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁订单支付产品、信用产品签约信息
 *
 * @author auto create
 * @since 1.0, 2025-06-06 17:52:47
 */
public class RentSignInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6629585529442915396L;

	/**
	 * 信用产品信息。选了“预授权、租赁代扣”之一时必传，当前暂不支持单独使用
	 */
	@ApiField("credit_info")
	private RentCreditInfoDTO creditInfo;

	/**
	 * 预授权信息。不传表示当前订单不使用预授权及芝麻免押
	 */
	@ApiField("fund_auth_freeze_info")
	private RentFundAuthFreezeInfoDTO fundAuthFreezeInfo;

	/**
	 * 租赁代扣信息。不传表示当前订单不使用代扣
	 */
	@ApiField("rent_deduct_info")
	private RentDeductInfoDTO rentDeductInfo;

	public RentCreditInfoDTO getCreditInfo() {
		return this.creditInfo;
	}
	public void setCreditInfo(RentCreditInfoDTO creditInfo) {
		this.creditInfo = creditInfo;
	}

	public RentFundAuthFreezeInfoDTO getFundAuthFreezeInfo() {
		return this.fundAuthFreezeInfo;
	}
	public void setFundAuthFreezeInfo(RentFundAuthFreezeInfoDTO fundAuthFreezeInfo) {
		this.fundAuthFreezeInfo = fundAuthFreezeInfo;
	}

	public RentDeductInfoDTO getRentDeductInfo() {
		return this.rentDeductInfo;
	}
	public void setRentDeductInfo(RentDeductInfoDTO rentDeductInfo) {
		this.rentDeductInfo = rentDeductInfo;
	}

}
