package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道红包活动配置查询接口
 *
 * @author auto create
 * @since 1.0, 2021-07-05 16:29:17
 */
public class AlipayUserDtbankcustChannelvoucherconfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5669712586839659228L;

	/**
	 * 在开放活动平台配置活动的唯一id，唯一标志一个活动
	 */
	@ApiField("activity_id")
	private String activityId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

}
