package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.cloudacpt.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiQualityTestCloudacptActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2458779894545438854L;

	/** 
	 * 活动列表
	 */
	@ApiListField("activity_list")
	@ApiField("open_activity")
	private List<OpenActivity> activityList;

	public void setActivityList(List<OpenActivity> activityList) {
		this.activityList = activityList;
	}
	public List<OpenActivity> getActivityList( ) {
		return this.activityList;
	}

}
