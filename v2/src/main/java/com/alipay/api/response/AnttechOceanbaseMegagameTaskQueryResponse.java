package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.megagame.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:37:57
 */
public class AnttechOceanbaseMegagameTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1221882788962757628L;

	/** 
	 * 参赛选手的提测代码分支，推荐用master。支持自定义
	 */
	@ApiField("branch")
	private String branch;

	/** 
	 * git 中commit id
	 */
	@ApiField("commit_id")
	private String commitId;

	/** 
	 * 参赛选手的git 代码仓库地址
	 */
	@ApiField("git_repo")
	private String gitRepo;

	/** 
	 * 提测任务id
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 团队表中的自增主键id
	 */
	@ApiField("team_id")
	private Long teamId;

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

	public void setGitRepo(String gitRepo) {
		this.gitRepo = gitRepo;
	}
	public String getGitRepo( ) {
		return this.gitRepo;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public Long getTeamId( ) {
		return this.teamId;
	}

}
