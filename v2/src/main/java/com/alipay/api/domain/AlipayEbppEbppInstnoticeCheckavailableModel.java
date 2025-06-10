package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公告状态查询
 *
 * @author auto create
 * @since 1.0, 2024-06-11 14:43:41
 */
public class AlipayEbppEbppInstnoticeCheckavailableModel extends AlipayObject {

	private static final long serialVersionUID = 7158783985728464812L;

	/**
	 * 流程的唯一标识，用来查询公告的执行状态，是否生效。
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
