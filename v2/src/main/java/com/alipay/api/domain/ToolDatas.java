package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 诊断详情
 *
 * @author auto create
 * @since 1.0, 2026-05-14 16:16:28
 */
public class ToolDatas extends AlipayObject {

	private static final long serialVersionUID = 3224137699839575275L;

	/**
	 * 诊断关键词
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 问题原因
	 */
	@ApiField("problem")
	private String problem;

	/**
	 * 解决方案
	 */
	@ApiField("solution")
	private String solution;

	/**
	 * 返回的内容格式
	 */
	@ApiField("solution_type")
	private String solutionType;

	/**
	 * 任务id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getProblem() {
		return this.problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getSolution() {
		return this.solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getSolutionType() {
		return this.solutionType;
	}
	public void setSolutionType(String solutionType) {
		this.solutionType = solutionType;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
