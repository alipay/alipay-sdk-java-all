package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序多种模型查询
 *
 * @author auto create
 * @since 1.0, 2020-01-01 10:34:17
 */
public class AlipayOpenMiniModelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2868295399161196542L;

	/**
	 * 内容：app_info表最新更新时间，格式：时间戳
	 */
	@ApiField("app_info_modified")
	private String appInfoModified;

	/**
	 * 内容：app_version表最新更新时间，格式：时间戳
	 */
	@ApiField("app_version_modified")
	private String appVersionModified;

	/**
	 * 内容：deploy_package表最新更新时间，格式：时间戳
	 */
	@ApiField("deploy_package_modified")
	private String deployPackageModified;

	/**
	 * 内容：deploy_window表最新更新时间，格式：时间戳
	 */
	@ApiField("deploy_window_modified")
	private String deployWindowModified;

	/**
	 * 是否为压测流量，true为是，默认false
	 */
	@ApiField("load_test")
	private String loadTest;

	/**
	 * APPID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 内容：mini_app_version表最新更新时间，格式：时间戳
	 */
	@ApiField("mini_app_version_modified")
	private String miniAppVersionModified;

	public String getAppInfoModified() {
		return this.appInfoModified;
	}
	public void setAppInfoModified(String appInfoModified) {
		this.appInfoModified = appInfoModified;
	}

	public String getAppVersionModified() {
		return this.appVersionModified;
	}
	public void setAppVersionModified(String appVersionModified) {
		this.appVersionModified = appVersionModified;
	}

	public String getDeployPackageModified() {
		return this.deployPackageModified;
	}
	public void setDeployPackageModified(String deployPackageModified) {
		this.deployPackageModified = deployPackageModified;
	}

	public String getDeployWindowModified() {
		return this.deployWindowModified;
	}
	public void setDeployWindowModified(String deployWindowModified) {
		this.deployWindowModified = deployWindowModified;
	}

	public String getLoadTest() {
		return this.loadTest;
	}
	public void setLoadTest(String loadTest) {
		this.loadTest = loadTest;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getMiniAppVersionModified() {
		return this.miniAppVersionModified;
	}
	public void setMiniAppVersionModified(String miniAppVersionModified) {
		this.miniAppVersionModified = miniAppVersionModified;
	}

}
