package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步提测平台任务成绩
 *
 * @author auto create
 * @since 1.0, 2022-06-13 19:51:19
 */
public class AnttechOceanbaseTestplatformTaskSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1376784256153126928L;

	/**
	 * 提测时使用的代码分支
	 */
	@ApiField("branch")
	private String branch;

	/**
	 * 提测时使用的commit id
	 */
	@ApiField("commit_id")
	private String commitId;

	/**
	 * 错误信息  1branch不存在 2commit_id不存在  3 编译错误 ...
	 */
	@ApiField("fail_msg")
	private Long failMsg;

	/**
	 * 提测结果类型(1:task, 2:perf)
	 */
	@ApiField("result_type")
	private Long resultType;

	/**
	 * 任务id，由数据库自增生成。在获取任务时给出。同步任务时作为唯一id
	 */
	@ApiField("task_id")
	private Long taskId;

	/**
	 * 任务状态码 2执行成功（默认） 3执行失败 非2 3 报错
	 */
	@ApiField("task_status")
	private Long taskStatus;

	/**
	 * 用于接收所有测试结果集,当提测结果类型为1:task时用status 后台计算分数; 提测结果类型为2:pref  直接用返回的score
	 */
	@ApiField("test_case_result")
	private String testCaseResult;

	/**
	 * 题目测试时的详情、评语
	 */
	@ApiField("test_info")
	private String testInfo;

	public String getBranch() {
		return this.branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCommitId() {
		return this.commitId;
	}
	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	public Long getFailMsg() {
		return this.failMsg;
	}
	public void setFailMsg(Long failMsg) {
		this.failMsg = failMsg;
	}

	public Long getResultType() {
		return this.resultType;
	}
	public void setResultType(Long resultType) {
		this.resultType = resultType;
	}

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getTaskStatus() {
		return this.taskStatus;
	}
	public void setTaskStatus(Long taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTestCaseResult() {
		return this.testCaseResult;
	}
	public void setTestCaseResult(String testCaseResult) {
		this.testCaseResult = testCaseResult;
	}

	public String getTestInfo() {
		return this.testInfo;
	}
	public void setTestInfo(String testInfo) {
		this.testInfo = testInfo;
	}

}
