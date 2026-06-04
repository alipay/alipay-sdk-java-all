package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * nfc展会碰一下打卡配置查询接口
 *
 * @author auto create
 * @since 1.0, 2026-05-25 17:58:19
 */
public class AlipayOfflineProviderExpoCheckconfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1688864681832946921L;

	/**
	 * 活动code
	 */
	@ApiField("activity_code")
	private String activityCode;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

}
