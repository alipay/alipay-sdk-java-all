package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取活动首页信息
 *
 * @author auto create
 * @since 1.0, 2023-03-03 15:56:49
 */
public class AlipayUserAntstarshipHomeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4467723294776136936L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 请求来源
	 */
	@ApiField("source")
	private String source;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
