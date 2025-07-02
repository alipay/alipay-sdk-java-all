package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益账户出资方信息
 *
 * @author auto create
 * @since 1.0, 2025-06-30 14:02:49
 */
public class FsFundInfoForm extends AlipayObject {

	private static final long serialVersionUID = 3418777312859649721L;

	/**
	 * 退款时为出资方退款金额，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 出资方类型：平台出资，商户出资，第三方机构出资
	 */
	@ApiField("fund_provider")
	private String fundProvider;

	/**
	 * 出资类型：余额出资
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 出资账号对应的uid
	 */
	@ApiField("fund_user_id")
	private String fundUserId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFundProvider() {
		return this.fundProvider;
	}
	public void setFundProvider(String fundProvider) {
		this.fundProvider = fundProvider;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getFundUserId() {
		return this.fundUserId;
	}
	public void setFundUserId(String fundUserId) {
		this.fundUserId = fundUserId;
	}

}
