package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 待生效的抽佣规则
 *
 * @author auto create
 * @since 1.0, 2025-12-01 20:27:25
 */
public class CommissionRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 5172797386546392367L;

	/**
	 * 被抽佣支付宝登录号
	 */
	@ApiField("charged_account_login_id")
	private String chargedAccountLoginId;

	/**
	 * 被抽佣支付宝账号名称
	 */
	@ApiField("charged_account_name")
	private String chargedAccountName;

	/**
	 * 抽佣比例，格式如0.01
	 */
	@ApiField("commission_ratio")
	private String commissionRatio;

	/**
	 * 抽佣关系列表
	 */
	@ApiField("commission_relation_list")
	private CommissionRelationDTO commissionRelationList;

	/**
	 * 规则创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 抽佣结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 抽佣规则
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 抽佣开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	public String getChargedAccountLoginId() {
		return this.chargedAccountLoginId;
	}
	public void setChargedAccountLoginId(String chargedAccountLoginId) {
		this.chargedAccountLoginId = chargedAccountLoginId;
	}

	public String getChargedAccountName() {
		return this.chargedAccountName;
	}
	public void setChargedAccountName(String chargedAccountName) {
		this.chargedAccountName = chargedAccountName;
	}

	public String getCommissionRatio() {
		return this.commissionRatio;
	}
	public void setCommissionRatio(String commissionRatio) {
		this.commissionRatio = commissionRatio;
	}

	public CommissionRelationDTO getCommissionRelationList() {
		return this.commissionRelationList;
	}
	public void setCommissionRelationList(CommissionRelationDTO commissionRelationList) {
		this.commissionRelationList = commissionRelationList;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
