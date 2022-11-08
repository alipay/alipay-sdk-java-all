package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放展位的投放内容
 *
 * @author auto create
 * @since 1.0, 2022-06-15 17:29:55
 */
public class IotDeliveryContentInfo extends AlipayObject {

	private static final long serialVersionUID = 5429389595396792388L;

	/**
	 * 活动id 列表，最大数量 2 
说明：
通过alipay.marketing.activity.ordervoucher.create 创建的导码模式的商家券活动
	 */
	@ApiField("activity_ids")
	private String activityIds;

	/**
	 * 当有承接券信息的小程序时返回
	 */
	@ApiField("display_app_id")
	private String displayAppId;

	public String getActivityIds() {
		return this.activityIds;
	}
	public void setActivityIds(String activityIds) {
		this.activityIds = activityIds;
	}

	public String getDisplayAppId() {
		return this.displayAppId;
	}
	public void setDisplayAppId(String displayAppId) {
		this.displayAppId = displayAppId;
	}

}
