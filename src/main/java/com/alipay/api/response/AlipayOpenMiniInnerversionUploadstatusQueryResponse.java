package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.uploadstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenMiniInnerversionUploadstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8618171937788468249L;

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
	 * 是否需要轮询
	 */
	@ApiField("need_rotation")
	private String needRotation;

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

	public void setNeedRotation(String needRotation) {
		this.needRotation = needRotation;
	}
	public String getNeedRotation( ) {
		return this.needRotation;
	}

	public void setVersionCreated(String versionCreated) {
		this.versionCreated = versionCreated;
	}
	public String getVersionCreated( ) {
		return this.versionCreated;
	}

}
