package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 快窗有礼活动详情
 *
 * @author auto create
 * @since 1.0, 2024-11-04 10:28:02
 */
public class AlipayOpenMiniMiniappLayerdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8468781858541369437L;

	/**
	 * 有礼活动id
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
