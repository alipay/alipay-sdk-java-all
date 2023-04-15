package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.preview.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:31:46
 */
public class AlipayOpenMiniInnerversionPreviewUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1886821649926611493L;

	/** 
	 * 构建好的包地址
	 */
	@ApiField("build_package_url")
	private String buildPackageUrl;

	/** 
	 * 部署版本号，一个应用、租户、端在应用中心唯一的一条发布记录版本号、
	 */
	@ApiField("deploy_version")
	private String deployVersion;

	/** 
	 * appx2.0构建报地址
	 */
	@ApiField("new_build_package_url")
	private String newBuildPackageUrl;

	public void setBuildPackageUrl(String buildPackageUrl) {
		this.buildPackageUrl = buildPackageUrl;
	}
	public String getBuildPackageUrl( ) {
		return this.buildPackageUrl;
	}

	public void setDeployVersion(String deployVersion) {
		this.deployVersion = deployVersion;
	}
	public String getDeployVersion( ) {
		return this.deployVersion;
	}

	public void setNewBuildPackageUrl(String newBuildPackageUrl) {
		this.newBuildPackageUrl = newBuildPackageUrl;
	}
	public String getNewBuildPackageUrl( ) {
		return this.newBuildPackageUrl;
	}

}
