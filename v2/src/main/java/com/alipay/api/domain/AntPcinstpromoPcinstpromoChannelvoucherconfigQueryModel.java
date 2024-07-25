package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构营销红包活动配置查询接口
 *
 * @author auto create
 * @since 1.0, 2023-09-07 16:05:14
 */
public class AntPcinstpromoPcinstpromoChannelvoucherconfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1631361416778874347L;

	/**
	 * P站配置的活动id
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
