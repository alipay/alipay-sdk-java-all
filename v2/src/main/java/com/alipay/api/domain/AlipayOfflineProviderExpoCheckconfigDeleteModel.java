package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * nfc展会碰一下打卡配置删除
 *
 * @author auto create
 * @since 1.0, 2026-05-25 18:02:50
 */
public class AlipayOfflineProviderExpoCheckconfigDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4635358151756971877L;

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
