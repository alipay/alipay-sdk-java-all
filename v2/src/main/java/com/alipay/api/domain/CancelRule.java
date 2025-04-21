package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 取消规则
 *
 * @author auto create
 * @since 1.0, 2024-12-18 11:21:16
 */
public class CancelRule extends AlipayObject {

	private static final long serialVersionUID = 7581416211417313143L;

	/**
	 * 当罚金类型penalty_type为固定罚金类型FIXED时，该字段必填。限制同一币种只能传1条固定罚金，当前仅支持CNY。
	 */
	@ApiListField("penalty_amounts")
	@ApiField("penalty_amount")
	private List<PenaltyAmount> penaltyAmounts;

	/**
	 * 当罚金类型penalty_type为百分比罚金类型PERCENTAGE时，该字段必填。
	 */
	@ApiField("penalty_percent")
	private PenaltyPercent penaltyPercent;

	/**
	 * 罚金类型
	 */
	@ApiField("penalty_type")
	private String penaltyType;

	/**
	 * yyyy-MM-dd HH:mm:ss格式，rule_end_time需晚于rule_start_time，最晚一段规则的rule_end_time需要晚于2099-12-31 00:00:00。

规则生效时间区间遵循[rule_start_time，rule_end_time)，对于同一rateplan节点下的多条规则：
1、规则之间的开始时间和结束时间不允许出现重叠。
例如[1970-01-01 00:00:00，2024-12-10 00:00:00)与[2024-12-09 00:00:00，2099-12-31 00:00:00)这类数据是不被允许的。
2、规则的开始结束时间需要保证连续，例如[1970-01-01 00:00:00，2024-12-10 00:00:00)与[2024-12-10 00:00:00，2099-12-31 00:00:00)为连续的时间区间。
	 */
	@ApiField("rule_end_time")
	private String ruleEndTime;

	/**
	 * yyyy-MM-dd HH:mm:ss格式，rule_end_time需晚于rule_start_time。

规则生效时间区间遵循[rule_start_time，rule_end_time)，对于同一rateplan节点下的多条规则：
1、规则之间的开始时间和结束时间不允许出现重叠。
例如[1970-01-01 00:00:00，2024-12-10 00:00:00)与[2024-12-09 00:00:00，2099-12-31 00:00:00)这类数据是不被允许的。
2、规则的开始结束时间需要保证连续，例如[1970-01-01 00:00:00，2024-12-10 00:00:00)与[2024-12-10 00:00:00，2099-12-31 00:00:00)为连续的时间区间。
	 */
	@ApiField("rule_start_time")
	private String ruleStartTime;

	public List<PenaltyAmount> getPenaltyAmounts() {
		return this.penaltyAmounts;
	}
	public void setPenaltyAmounts(List<PenaltyAmount> penaltyAmounts) {
		this.penaltyAmounts = penaltyAmounts;
	}

	public PenaltyPercent getPenaltyPercent() {
		return this.penaltyPercent;
	}
	public void setPenaltyPercent(PenaltyPercent penaltyPercent) {
		this.penaltyPercent = penaltyPercent;
	}

	public String getPenaltyType() {
		return this.penaltyType;
	}
	public void setPenaltyType(String penaltyType) {
		this.penaltyType = penaltyType;
	}

	public String getRuleEndTime() {
		return this.ruleEndTime;
	}
	public void setRuleEndTime(String ruleEndTime) {
		this.ruleEndTime = ruleEndTime;
	}

	public String getRuleStartTime() {
		return this.ruleStartTime;
	}
	public void setRuleStartTime(String ruleStartTime) {
		this.ruleStartTime = ruleStartTime;
	}

}
