package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班调度--轮班任务查询
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:37:03
 */
public class AlipayDataAiserviceCloudbusScheduletaskshiftQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6832135429421559276L;

	/**
	 * 接口版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 任务id
	 */
	@ApiField("plan_id")
	private String planId;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
