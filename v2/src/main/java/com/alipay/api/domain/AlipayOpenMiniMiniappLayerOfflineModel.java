package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快窗有礼活动下线
 *
 * @author auto create
 * @since 1.0, 2024-11-04 10:27:58
 */
public class AlipayOpenMiniMiniappLayerOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 4672399957629187233L;

	/**
	 * 快窗有礼活动id
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
