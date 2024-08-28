package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务项
 *
 * @author auto create
 * @since 1.0, 2021-11-19 16:18:56
 */
public class VehServiceItem extends AlipayObject {

	private static final long serialVersionUID = 4249498333461944371L;

	/**
	 * 活动信息列表
	 */
	@ApiField("activity_items")
	private VehActivityItem activityItems;

	/**
	 * key属性的描述信息
支付宝支付(ALI_PAY)、
在线缴费(ONLINE_PAY)、
活动(ACTIVITY)
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 支持的服务KEY
ALI_PAY(支付宝支付)、
ONLINE_PAY(在线缴费)、
ACTIVITY(活动)
	 */
	@ApiField("key")
	private String key;

	public VehActivityItem getActivityItems() {
		return this.activityItems;
	}
	public void setActivityItems(VehActivityItem activityItems) {
		this.activityItems = activityItems;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
