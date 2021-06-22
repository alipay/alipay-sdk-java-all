package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序版本信息
 *
 * @author auto create
 * @since 1.0, 2020-02-05 14:42:23
 */
public class AppVersionInfo extends AlipayObject {

	private static final long serialVersionUID = 8239841482191815847L;

	/**
	 * 版本号，一般为x.y.x格式，其中x、y、z都是数字
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 端信息，默认为支付宝端
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 版本创建时间，精确到秒
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 版本描述，介绍此版本的主要变更和功能
	 */
	@ApiField("version_description")
	private String versionDescription;

	/**
	 * 版本状态，可选值为：INIT: 开发中, AUDITING: 审核中, AUDIT_REJECT: 审核驳回, WAIT_RELEASE: 待上架, GRAY: 灰度中, RELEASE: 已上架, OFFLINE: 已下架, AUDIT_OFFLINE: 被强制下架;
	 */
	@ApiField("version_status")
	private String versionStatus;

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

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getVersionDescription() {
		return this.versionDescription;
	}
	public void setVersionDescription(String versionDescription) {
		this.versionDescription = versionDescription;
	}

	public String getVersionStatus() {
		return this.versionStatus;
	}
	public void setVersionStatus(String versionStatus) {
		this.versionStatus = versionStatus;
	}

}
