package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部链路撤销审核
 *
 * @author auto create
 * @since 1.0, 2020-02-14 09:49:05
 */
public class AlipayOpenMiniInnerversionAuditCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8727533269325492912L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 小程序版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序ID，仅特殊场景使用，普通业务方无需关注该参数
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 小程序所属PID
	 */
	@ApiField("pid")
	private String pid;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
