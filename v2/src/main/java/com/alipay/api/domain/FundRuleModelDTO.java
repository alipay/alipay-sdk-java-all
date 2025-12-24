package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出资规则模型
 *
 * @author auto create
 * @since 1.0, 2024-04-19 13:55:51
 */
public class FundRuleModelDTO extends AlipayObject {

	private static final long serialVersionUID = 5389389113524364725L;

	/**
	 * 出资协议号，由出资协议创建时获取
	 */
	@ApiField("fund_agreement_no")
	private String fundAgreementNo;

	/**
	 * 出资金额
	 */
	@ApiField("fund_amount")
	private String fundAmount;

	/**
	 * 商户减收类型，后续商户发起支付时，会优先校验支付发起的商户是否存在对应的有效协议，如果不存在，则支付中无法使用对应的商链通优惠；该字段与fund_agreement_no二选一即可，如果传入了fund_agreement_no，则优先使用fund_agreement_no。
	 */
	@ApiField("fund_type")
	private String fundType;

	public String getFundAgreementNo() {
		return this.fundAgreementNo;
	}
	public void setFundAgreementNo(String fundAgreementNo) {
		this.fundAgreementNo = fundAgreementNo;
	}

	public String getFundAmount() {
		return this.fundAmount;
	}
	public void setFundAmount(String fundAmount) {
		this.fundAmount = fundAmount;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

}
