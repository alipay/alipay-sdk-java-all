package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字分行活动配置查询接口
 *
 * @author auto create
 * @since 1.0, 2024-03-28 10:19:50
 */
public class AlipayUserDtbankcustActivityconfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7779474282292829948L;

	/**
	 * 数字分行活动唯一id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 数字分行活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

}
