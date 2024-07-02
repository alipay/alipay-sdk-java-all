package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 协议由普通通用代扣协议产品转移到周期扣协议产品
 *
 * @author auto create
 * @since 1.0, 2024-03-01 14:30:05
 */
public class AlipayUserAgreementTransferModel extends AlipayObject {

	private static final long serialVersionUID = 5769715913845145429L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ），如果传了该参数，其他参数会被忽略
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 周期管控规则参数period_rule_params，在签约周期扣款产品（如CYCLE_PAY_AUTH_P）时必传。 周期扣款产品，会按照这里传入的参数提示用户，并对发起扣款的时间、金额、次数等做相应限制。
	 */
	@ApiField("period_rule_params")
	private PeriodRuleParams periodRuleParams;

	/**
	 * 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码。这里指的是需要修改目标产品码的值
	 */
	@ApiField("target_product_code")
	private String targetProductCode;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public PeriodRuleParams getPeriodRuleParams() {
		return this.periodRuleParams;
	}
	public void setPeriodRuleParams(PeriodRuleParams periodRuleParams) {
		this.periodRuleParams = periodRuleParams;
	}

	public String getTargetProductCode() {
		return this.targetProductCode;
	}
	public void setTargetProductCode(String targetProductCode) {
		this.targetProductCode = targetProductCode;
	}

}
