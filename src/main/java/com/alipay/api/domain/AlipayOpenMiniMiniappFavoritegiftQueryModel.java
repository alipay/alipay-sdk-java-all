package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * alipay.open.mini.miniapp.collectingstatus.modify
 *
 * @author auto create
 * @since 1.0, 2018-12-26 15:47:30
 */
public class AlipayOpenMiniMiniappFavoritegiftQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2736271963461635382L;

	/**
	 * 收藏有礼查询每个小程序相关信息的列表
	 */
	@ApiListField("activity_list")
	@ApiField("activity_query_info")
	private List<ActivityQueryInfo> activityList;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<ActivityQueryInfo> getActivityList() {
		return this.activityList;
	}
	public void setActivityList(List<ActivityQueryInfo> activityList) {
		this.activityList = activityList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
