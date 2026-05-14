package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字活动删除接口
 *
 * @author auto create
 * @since 1.0, 2026-05-08 13:12:45
 */
public class AlipayOfflineProviderExpoActivityDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5898293327891881433L;

	/**
	 * 活动唯一编码（参考修改接口定义）
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
