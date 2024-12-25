package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序版本信息
 *
 * @author auto create
 * @since 1.0, 2021-12-06 21:51:47
 */
public class AppVersionInfo extends AlipayObject {

	private static final long serialVersionUID = 5574285184735795337L;

	/**
	 * 版本号，一般为x.y.x格式，其中x、y、z都是数字
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 准入审核结果
（提审时 audit_rule 传 BASE_PROMOTE 时有该字段）
	 */
	@ApiField("base_audit")
	private String baseAudit;

	/**
	 * 小程序客户端类型，默认为支付宝端。常见支持如下客户端：
com.alipay.alipaywallet：支付宝端；
com.alibaba.android.rimet：DINGDING端；
com.amap.app：高德端；
com.alibaba.ailabs.genie.webapps：天猫精灵端；
com.alipay.iot.xpaas：支付宝IoT端。
如需更多端投放，请联系业务BD。
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 是否可上架
true：可上架
false：不可上架
（version_status 为PROMOTE_AUDIT_REJECT有值）
（提审时 audit_rule 传 BASE_PROMOTE 时有该字段）
	 */
	@ApiField("can_release")
	private String canRelease;

	/**
	 * 版本创建时间，精确到秒
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 营销审核结果：
PASS：通过
REJECT：驳回
（提审时 audit_rule 传 BASE_PROMOTE 时有该字段）
	 */
	@ApiField("promote_audit")
	private String promoteAudit;

	/**
	 * 小程序版本描述，介绍此版本的主要变更和功能，5-500个字符。
	 */
	@ApiField("version_description")
	private String versionDescription;

	/**
	 * 版本状态
	 */
	@ApiField("version_status")
	private String versionStatus;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBaseAudit() {
		return this.baseAudit;
	}
	public void setBaseAudit(String baseAudit) {
		this.baseAudit = baseAudit;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getCanRelease() {
		return this.canRelease;
	}
	public void setCanRelease(String canRelease) {
		this.canRelease = canRelease;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPromoteAudit() {
		return this.promoteAudit;
	}
	public void setPromoteAudit(String promoteAudit) {
		this.promoteAudit = promoteAudit;
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
