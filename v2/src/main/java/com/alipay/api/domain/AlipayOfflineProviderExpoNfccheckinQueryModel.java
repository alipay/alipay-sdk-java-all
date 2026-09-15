package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打卡进度查询
 *
 * @author auto create
 * @since 1.0, 2026-08-20 21:22:47
 */
public class AlipayOfflineProviderExpoNfccheckinQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5422374542417365924L;

	/**
	 * 活动code
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 用户标识
	 */
	@ApiField("user_mark")
	private String userMark;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getUserMark() {
		return this.userMark;
	}
	public void setUserMark(String userMark) {
		this.userMark = userMark;
	}

}
