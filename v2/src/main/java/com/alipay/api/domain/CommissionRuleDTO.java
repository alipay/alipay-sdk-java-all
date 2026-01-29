package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 待生效的抽佣规则
 *
 * @author auto create
 * @since 1.0, 2026-01-05 14:37:41
 */
public class CommissionRuleDTO extends AlipayObject {

	private static final long serialVersionUID = 6267798132129295737L;

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
	 * null
	 */
	@ApiListField("commission_relation_info_list")
	@ApiField("commission_relation_d_t_o")
	private List<CommissionRelationDTO> commissionRelationInfoList;

	/**
	 * 抽佣关系列表 当前字段已废弃(数据结构定义需要调整为数组)
	 */
	@ApiField("commission_relation_list")
	@Deprecated
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

	public List<CommissionRelationDTO> getCommissionRelationInfoList() {
		return this.commissionRelationInfoList;
	}
	public void setCommissionRelationInfoList(List<CommissionRelationDTO> commissionRelationInfoList) {
		this.commissionRelationInfoList = commissionRelationInfoList;
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
