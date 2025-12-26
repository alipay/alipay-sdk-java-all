package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灯火ADX通用事件接口
 *
 * @author auto create
 * @since 1.0, 2020-03-06 14:09:37
 */
public class AlipayMarketingCampaignCommoneventApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1296281264777763281L;

	/**
	 * 与event关联的数据
	 */
	@ApiField("content_json")
	private String contentJson;

	/**
	 * 事件类型
	 */
	@ApiField("event")
	private String event;

	public String getContentJson() {
		return this.contentJson;
	}
	public void setContentJson(String contentJson) {
		this.contentJson = contentJson;
	}

	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

}
