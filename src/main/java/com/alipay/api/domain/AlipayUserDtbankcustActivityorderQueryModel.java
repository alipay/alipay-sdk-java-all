package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查活动流水发放接口
 *
 * @author auto create
 * @since 1.0, 2021-02-26 21:23:21
 */
public class AlipayUserDtbankcustActivityorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4491748312966325869L;

	/**
	 * 活动流水唯一id，由系统自动生成的，在调用活动触发接口会返回该id。
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	public String getActivityOrderId() {
		return this.activityOrderId;
	}
	public void setActivityOrderId(String activityOrderId) {
		this.activityOrderId = activityOrderId;
	}

}
