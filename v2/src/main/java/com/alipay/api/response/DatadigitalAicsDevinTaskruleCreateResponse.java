package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.aics.devin.taskrule.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:05
 */
public class DatadigitalAicsDevinTaskruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3855574856617295985L;

	/** 
	 * 任务code
	 */
	@ApiField("task_code")
	private String taskCode;

	/** 
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/** 
	 * 任务规则code
	 */
	@ApiField("task_rules_code")
	private String taskRulesCode;

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}
	public String getTaskCode( ) {
		return this.taskCode;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskName( ) {
		return this.taskName;
	}

	public void setTaskRulesCode(String taskRulesCode) {
		this.taskRulesCode = taskRulesCode;
	}
	public String getTaskRulesCode( ) {
		return this.taskRulesCode;
	}

}
