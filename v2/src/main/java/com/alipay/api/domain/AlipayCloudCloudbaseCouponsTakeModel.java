package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 领券
 *
 * @author auto create
 * @since 1.0, 2024-05-20 10:28:13
 */
public class AlipayCloudCloudbaseCouponsTakeModel extends AlipayObject {

	private static final long serialVersionUID = 6729818618316576949L;

	/**
	 * 活动编码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 应用ID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

}
