package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出资约束信息
 *
 * @author auto create
 * @since 1.0, 2026-04-01 11:13:37
 */
public class FundConstraints extends AlipayObject {

	private static final long serialVersionUID = 6413989116185187732L;

	/**
	 * 企业在企业码平台开通的出资账户标识
	 */
	@ApiField("deduct_account_id")
	private String deductAccountId;

	/**
	 * 服务商在企业码平台发布的服务标识
	 */
	@ApiField("fund_service_id")
	private String fundServiceId;

	/**
	 * 限定出资的银行卡号
	 */
	@ApiField("specified_bank_card_no")
	private String specifiedBankCardNo;

	public String getDeductAccountId() {
		return this.deductAccountId;
	}
	public void setDeductAccountId(String deductAccountId) {
		this.deductAccountId = deductAccountId;
	}

	public String getFundServiceId() {
		return this.fundServiceId;
	}
	public void setFundServiceId(String fundServiceId) {
		this.fundServiceId = fundServiceId;
	}

	public String getSpecifiedBankCardNo() {
		return this.specifiedBankCardNo;
	}
	public void setSpecifiedBankCardNo(String specifiedBankCardNo) {
		this.specifiedBankCardNo = specifiedBankCardNo;
	}

}
