package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动期次信息查询
 *
 * @author auto create
 * @since 1.0, 2026-06-29 15:02:56
 */
public class AlipayCommerceOperationPromoActivityperiodQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8216324878639142471L;

	/**
	 * 活动唯一编码，固定值
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
