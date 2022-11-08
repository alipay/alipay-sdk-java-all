package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.testplatform.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-13 19:51:41
 */
public class AnttechOceanbaseTestplatformTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8466758955812967328L;

	/** 
	 * 提测代码的分支
	 */
	@ApiField("branch")
	private String branch;

	/** 
	 * 提测代码仓库的commit id
	 */
	@ApiField("commit_id")
	private String commitId;

	/** 
	 * 当前任务的运行（重试）次数
	 */
	@ApiField("current_retry")
	private String currentRetry;

	/** 
	 * 代码仓库的url
	 */
	@ApiField("git_repo")
	private String gitRepo;

	/** 
	 * 任务创建的时间戳
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 参赛选手的名字
	 */
	@ApiField("player")
	private String player;

	/** 
	 * 提测结果类型 默认1
	 */
	@ApiField("result_type")
	private Long resultType;

	/** 
	 * 测试任务的Id
	 */
	@ApiField("task_id")
	private Long taskId;

	/** 
	 * 二级提测题目
	 */
	@ApiField("test_cases")
	private String testCases;

	/** 
	 * 测试题目
	 */
	@ApiField("test_info")
	private String testInfo;

	/** 
	 * 一级提测题目
	 */
	@ApiField("test_suite")
	private String testSuite;

	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBranch( ) {
		return this.branch;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}
	public String getCommitId( ) {
		return this.commitId;
	}

	public void setCurrentRetry(String currentRetry) {
		this.currentRetry = currentRetry;
	}
	public String getCurrentRetry( ) {
		return this.currentRetry;
	}

	public void setGitRepo(String gitRepo) {
		this.gitRepo = gitRepo;
	}
	public String getGitRepo( ) {
		return this.gitRepo;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setPlayer(String player) {
		this.player = player;
	}
	public String getPlayer( ) {
		return this.player;
	}

	public void setResultType(Long resultType) {
		this.resultType = resultType;
	}
	public Long getResultType( ) {
		return this.resultType;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}
	public Long getTaskId( ) {
		return this.taskId;
	}

	public void setTestCases(String testCases) {
		this.testCases = testCases;
	}
	public String getTestCases( ) {
		return this.testCases;
	}

	public void setTestInfo(String testInfo) {
		this.testInfo = testInfo;
	}
	public String getTestInfo( ) {
		return this.testInfo;
	}

	public void setTestSuite(String testSuite) {
		this.testSuite = testSuite;
	}
	public String getTestSuite( ) {
		return this.testSuite;
	}

}
