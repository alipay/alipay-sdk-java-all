package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 额度防控规则历史列表
 *
 * @author auto create
 * @since 1.0, 2023-09-19 14:22:47
 */
public class QuotaControlHistoryRecord extends AlipayObject {

	private static final long serialVersionUID = 2852215265476526375L;

	/**
	 * 额度指标
 - Function_Counts
 - Function_Resource_Usage
 - Function_Data
 - Database_Storage
 - Read_Counts
 - Write_Counts
 - Oss_Capacity
 - Oss_Data
 - Oss_Download
 - Oss_Upload
 - Oss_Reverse_Data
 - Staticsite_Capacity
 - Staticsite_Data
	 */
	@ApiField("fee_item_code")
	private String feeItemCode;

	/**
	 * 操作时间
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 规则ID
	 */
	@ApiField("rule_id")
	private String ruleId;

	/**
	 * 阈值（比例）
	 */
	@ApiField("threshold")
	private Long threshold;

	/**
	 * 触发值
	 */
	@ApiField("trigger_value")
	private String triggerValue;

	public String getFeeItemCode() {
		return this.feeItemCode;
	}
	public void setFeeItemCode(String feeItemCode) {
		this.feeItemCode = feeItemCode;
	}

	public String getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getRuleId() {
		return this.ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public Long getThreshold() {
		return this.threshold;
	}
	public void setThreshold(Long threshold) {
		this.threshold = threshold;
	}

	public String getTriggerValue() {
		return this.triggerValue;
	}
	public void setTriggerValue(String triggerValue) {
		this.triggerValue = triggerValue;
	}

}
