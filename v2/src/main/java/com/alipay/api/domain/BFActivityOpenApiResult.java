package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 花呗营销活动信息返回数据结构
 *
 * @author auto create
 * @since 1.0, 2020-03-27 17:22:57
 */
public class BFActivityOpenApiResult extends AlipayObject {

	private static final long serialVersionUID = 2515677446135384141L;

	/**
	 * 活动信息
	 */
	@ApiListField("activity_infos")
	@ApiField("b_f_activity_open_api_info")
	private List<BFActivityOpenApiInfo> activityInfos;

	public List<BFActivityOpenApiInfo> getActivityInfos() {
		return this.activityInfos;
	}
	public void setActivityInfos(List<BFActivityOpenApiInfo> activityInfos) {
		this.activityInfos = activityInfos;
	}

}
