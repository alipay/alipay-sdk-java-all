package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 时间规则
 *
 * @author auto create
 * @since 1.0, 2021-03-23 11:46:14
 */
public class TimePeriodRule extends AlipayObject {

	private static final long serialVersionUID = 8238155426144655874L;

	/**
	 * 结束时间， 格式HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * (1)如果rule_type=day，则格式为表示具体日期yyyy-MM-dd且逗号分隔的字符串. 例：2019-09-09,2019-10-10 表示具体这两天; 
(2)如果rule_type=week，则格式为表示星期几的1-7的数字且逗号分隔的字符串. 例：1,2,4 表示周一周二周四
	 */
	@ApiListField("rule_info")
	@ApiField("string")
	private List<String> ruleInfo;

	/**
	 * 时间类型; 天：day,  周：week
	 */
	@ApiField("rule_type")
	private String ruleType;

	/**
	 * 开始时间, 格式HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<String> getRuleInfo() {
		return this.ruleInfo;
	}
	public void setRuleInfo(List<String> ruleInfo) {
		this.ruleInfo = ruleInfo;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
