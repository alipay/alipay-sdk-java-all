package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动推广信息
 *
 * @author auto create
 * @since 1.0, 2026-06-16 15:33:14
 */
public class ActivityDeliveryExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3134243481679665267L;

	/**
	 * 是否自动推广
	 */
	@ApiField("auto_delivery")
	private Boolean autoDelivery;

	/**
	 * 推广渠道列表
	 */
	@ApiListField("channel_list")
	@ApiField("string")
	private List<String> channelList;

	public Boolean getAutoDelivery() {
		return this.autoDelivery;
	}
	public void setAutoDelivery(Boolean autoDelivery) {
		this.autoDelivery = autoDelivery;
	}

	public List<String> getChannelList() {
		return this.channelList;
	}
	public void setChannelList(List<String> channelList) {
		this.channelList = channelList;
	}

}
