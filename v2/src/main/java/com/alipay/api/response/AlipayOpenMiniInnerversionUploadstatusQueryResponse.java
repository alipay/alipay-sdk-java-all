package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.uploadstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 16:57:41
 */
public class AlipayOpenMiniInnerversionUploadstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8349891587874898864L;

	/** 
	 * 构建信息
	 */
	@ApiField("build_info")
	private String buildInfo;

	/** 
	 * 构建好的包地址
	 */
	@ApiField("build_package_url")
	private String buildPackageUrl;

	/** 
	 * 构建状态
	 */
	@ApiField("build_status")
	private String buildStatus;

	/** 
	 * 构建日志地址
	 */
	@ApiField("log_url")
	private String logUrl;

	/** 
	 * 是否需要轮询
	 */
	@ApiField("need_rotation")
	private String needRotation;

	/** 
	 * 构建好的appx2.0包地址
	 */
	@ApiField("new_build_package_url")
	private String newBuildPackageUrl;

	/** 
	 * 构建的结果地址
	 */
	@ApiField("new_result_url")
	private String newResultUrl;

	/** 
	 * 构建的结果地址
	 */
	@ApiField("result_url")
	private String resultUrl;

	/** 
	 * 创建版本结果
	 */
	@ApiField("version_created")
	private String versionCreated;

	public void setBuildInfo(String buildInfo) {
		this.buildInfo = buildInfo;
	}
	public String getBuildInfo( ) {
		return this.buildInfo;
	}

	public void setBuildPackageUrl(String buildPackageUrl) {
		this.buildPackageUrl = buildPackageUrl;
	}
	public String getBuildPackageUrl( ) {
		return this.buildPackageUrl;
	}

	public void setBuildStatus(String buildStatus) {
		this.buildStatus = buildStatus;
	}
	public String getBuildStatus( ) {
		return this.buildStatus;
	}

	public void setLogUrl(String logUrl) {
		this.logUrl = logUrl;
	}
	public String getLogUrl( ) {
		return this.logUrl;
	}

	public void setNeedRotation(String needRotation) {
		this.needRotation = needRotation;
	}
	public String getNeedRotation( ) {
		return this.needRotation;
	}

	public void setNewBuildPackageUrl(String newBuildPackageUrl) {
		this.newBuildPackageUrl = newBuildPackageUrl;
	}
	public String getNewBuildPackageUrl( ) {
		return this.newBuildPackageUrl;
	}

	public void setNewResultUrl(String newResultUrl) {
		this.newResultUrl = newResultUrl;
	}
	public String getNewResultUrl( ) {
		return this.newResultUrl;
	}

	public void setResultUrl(String resultUrl) {
		this.resultUrl = resultUrl;
	}
	public String getResultUrl( ) {
		return this.resultUrl;
	}

	public void setVersionCreated(String versionCreated) {
		this.versionCreated = versionCreated;
	}
	public String getVersionCreated( ) {
		return this.versionCreated;
	}

}
