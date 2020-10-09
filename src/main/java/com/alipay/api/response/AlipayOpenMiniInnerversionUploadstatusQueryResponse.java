package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.uploadstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-14 10:40:09
 */
public class AlipayOpenMiniInnerversionUploadstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3893486787472252548L;

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
