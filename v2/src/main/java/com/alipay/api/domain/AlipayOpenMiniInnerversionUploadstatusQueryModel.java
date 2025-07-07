package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询构建状态
 *
 * @author auto create
 * @since 1.0, 2023-01-16 17:38:32
 */
public class AlipayOpenMiniInnerversionUploadstatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5527717141862619863L;

	/**
	 * 包管理ID，用于查询打包状态
	 */
	@ApiField("build_package_id")
	private String buildPackageId;

	/**
	 * 小程序版本
	 */
	@ApiField("build_version")
	private String buildVersion;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 租户id
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getBuildPackageId() {
		return this.buildPackageId;
	}
	public void setBuildPackageId(String buildPackageId) {
		this.buildPackageId = buildPackageId;
	}

	public String getBuildVersion() {
		return this.buildVersion;
	}
	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
