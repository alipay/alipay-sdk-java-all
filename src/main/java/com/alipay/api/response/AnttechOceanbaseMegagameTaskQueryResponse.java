package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.megagame.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-29 14:30:35
 */
public class AnttechOceanbaseMegagameTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8418556452222645359L;

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
