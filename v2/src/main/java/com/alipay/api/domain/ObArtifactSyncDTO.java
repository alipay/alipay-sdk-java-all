package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ob制品同步入参
 *
 * @author auto create
 * @since 1.0, 2024-01-10 16:55:51
 */
public class ObArtifactSyncDTO extends AlipayObject {

	private static final long serialVersionUID = 1519489129298557453L;

	/**
	 * 制品全称
	 */
	@ApiField("artifact_fullname")
	private String artifactFullname;

	/**
	 * 制品版本
	 */
	@ApiField("artifact_version")
	private String artifactVersion;

	/**
	 * 打包的tag或者branch
	 */
	@ApiField("branch_or_tag")
	private String branchOrTag;

	/**
	 * 制品打包的构建id，某type具体项目下全局唯一。默认值为-1，代表制品暂时未在制品平台打包
	 */
	@ApiField("build_id")
	private Long buildId;

	/**
	 * commit_id
	 */
	@ApiField("commit_id")
	private String commitId;

	/**
	 * 制品生成时间
2022-11-27 19:38:40
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 下载地址
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/**
	 * 豁免申请流程
	 */
	@ApiListField("exempt_approval_process_details")
	@ApiField("exempt_approval_process_detail")
	private List<ExemptApprovalProcessDetail> exemptApprovalProcessDetails;

	/**
	 * 对外披露流程状态
	 */
	@ApiField("external_disclosure_process_state")
	private String externalDisclosureProcessState;

	/**
	 * 对外披露流程链接
	 */
	@ApiField("external_disclosure_process_url")
	private String externalDisclosureProcessUrl;

	/**
	 * md5
	 */
	@ApiField("md_5")
	private String md5;

	/**
	 * 固定为 "oceanbase"
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 点击发布obg的发布人
	 */
	@ApiField("publisher")
	private String publisher;

	/**
	 * 制品打包目的
	 */
	@ApiField("purpose")
	private String purpose;

	/**
	 * 制品打包的源码地址
	 */
	@ApiField("repo_url")
	private String repoUrl;

	/**
	 * ob制品扫描详情
	 */
	@ApiListField("scan_details")
	@ApiField("scan_detail")
	private List<ScanDetail> scanDetails;

	/**
	 * 制品大小
	 */
	@ApiField("size")
	private String size;

	/**
	 * 标签
	 */
	@ApiField("tag")
	private String tag;

	/**
	 * 制品触发打包人
	 */
	@ApiField("trigger")
	private String trigger;

	/**
	 * 制品类型 jar,rpm,docker,common.etc
	 */
	@ApiField("type")
	private String type;

	public String getArtifactFullname() {
		return this.artifactFullname;
	}
	public void setArtifactFullname(String artifactFullname) {
		this.artifactFullname = artifactFullname;
	}

	public String getArtifactVersion() {
		return this.artifactVersion;
	}
	public void setArtifactVersion(String artifactVersion) {
		this.artifactVersion = artifactVersion;
	}

	public String getBranchOrTag() {
		return this.branchOrTag;
	}
	public void setBranchOrTag(String branchOrTag) {
		this.branchOrTag = branchOrTag;
	}

	public Long getBuildId() {
		return this.buildId;
	}
	public void setBuildId(Long buildId) {
		this.buildId = buildId;
	}

	public String getCommitId() {
		return this.commitId;
	}
	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public List<ExemptApprovalProcessDetail> getExemptApprovalProcessDetails() {
		return this.exemptApprovalProcessDetails;
	}
	public void setExemptApprovalProcessDetails(List<ExemptApprovalProcessDetail> exemptApprovalProcessDetails) {
		this.exemptApprovalProcessDetails = exemptApprovalProcessDetails;
	}

	public String getExternalDisclosureProcessState() {
		return this.externalDisclosureProcessState;
	}
	public void setExternalDisclosureProcessState(String externalDisclosureProcessState) {
		this.externalDisclosureProcessState = externalDisclosureProcessState;
	}

	public String getExternalDisclosureProcessUrl() {
		return this.externalDisclosureProcessUrl;
	}
	public void setExternalDisclosureProcessUrl(String externalDisclosureProcessUrl) {
		this.externalDisclosureProcessUrl = externalDisclosureProcessUrl;
	}

	public String getMd5() {
		return this.md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPublisher() {
		return this.publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPurpose() {
		return this.purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getRepoUrl() {
		return this.repoUrl;
	}
	public void setRepoUrl(String repoUrl) {
		this.repoUrl = repoUrl;
	}

	public List<ScanDetail> getScanDetails() {
		return this.scanDetails;
	}
	public void setScanDetails(List<ScanDetail> scanDetails) {
		this.scanDetails = scanDetails;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTrigger() {
		return this.trigger;
	}
	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
