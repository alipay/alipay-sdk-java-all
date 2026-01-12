package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联商户检查
 *
 * @author auto create
 * @since 1.0, 2025-08-22 11:06:41
 */
public class AlipayCommerceEducateSchooldeviceSmCheckModel extends AlipayObject {

	private static final long serialVersionUID = 4896284618457731567L;

	/**
	 * 活动码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 业务码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 间联商户ID
	 */
	@ApiField("sm_id")
	private String smId;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getSmId() {
		return this.smId;
	}
	public void setSmId(String smId) {
		this.smId = smId;
	}

}
