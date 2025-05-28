package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * alipay.open.mini.miniapp.collectingstatus.modify
 *
 * @author auto create
 * @since 1.0, 2022-12-20 13:23:48
 */
public class AlipayOpenMiniMiniappFavoritegiftQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5782212226924297677L;

	/**
	 * 收藏有礼查询每个小程序相关信息的列表
	 */
	@ApiListField("activity_list")
	@ApiField("activity_query_info")
	private List<ActivityQueryInfo> activityList;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
