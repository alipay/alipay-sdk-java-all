package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 额度规则模型
 *
 * @author auto create
 * @since 1.0, 2024-11-01 15:09:18
 */
public class QuotaRuleModelDTO extends AlipayObject {

	private static final long serialVersionUID = 4873783573465848789L;

	/**
	 * 该额度规则下可用金额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 预期交易金额
	 */
	@ApiField("excepted_amount")
	private String exceptedAmount;

	/**
	 * 出资规则列表
	 */
	@ApiListField("fund_rule_list")
	@ApiField("fund_rule_model_d_t_o")
	private List<FundRuleModelDTO> fundRuleList;

	/**
	 * 额度限制列表,目前支持金额限制
	 */
	@ApiListField("quota_limit_list")
	@ApiField("quota_limit_model_d_t_o")
	private List<QuotaLimitModelDTO> quotaLimitList;

	/**
	 * 规则有效期
单位：年月日 时分秒
	 */
	@ApiField("validity_period")
	private Date validityPeriod;

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getExceptedAmount() {
		return this.exceptedAmount;
	}
	public void setExceptedAmount(String exceptedAmount) {
		this.exceptedAmount = exceptedAmount;
	}

	public List<FundRuleModelDTO> getFundRuleList() {
		return this.fundRuleList;
	}
	public void setFundRuleList(List<FundRuleModelDTO> fundRuleList) {
		this.fundRuleList = fundRuleList;
	}

	public List<QuotaLimitModelDTO> getQuotaLimitList() {
		return this.quotaLimitList;
	}
	public void setQuotaLimitList(List<QuotaLimitModelDTO> quotaLimitList) {
		this.quotaLimitList = quotaLimitList;
	}

	public Date getValidityPeriod() {
		return this.validityPeriod;
	}
	public void setValidityPeriod(Date validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

}
