package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.upload response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-03 11:55:18
 */
public class AlipayOpenMiniInnerversionUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1137347774421675977L;

	/** 
	 * 构建信息
	 */
	@ApiField("build_info")
	private String buildInfo;

	/** 
	 * 包地址
	 */
	@ApiField("build_package_url")
	private String buildPackageUrl;

	/** 
	 * 构建状态
	 */
	@ApiField("build_status")
	private String buildStatus;

	/** 
	 * 构建版本
	 */
	@ApiField("build_version")
	private String buildVersion;

	/** 
	 * 是否需要轮询
	 */
	@ApiField("need_rotation")
	private String needRotation;

	/** 
	 * 包管理包ID
	 */
	@ApiField("package_id")
	private String packageId;

	/** 
	 * 版本创建结果
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

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}
	public String getBuildVersion( ) {
		return this.buildVersion;
	}

	public void setNeedRotation(String needRotation) {
		this.needRotation = needRotation;
	}
	public String getNeedRotation( ) {
		return this.needRotation;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getPackageId( ) {
		return this.packageId;
	}

	public void setVersionCreated(String versionCreated) {
		this.versionCreated = versionCreated;
	}
	public String getVersionCreated( ) {
		return this.versionCreated;
	}

}
