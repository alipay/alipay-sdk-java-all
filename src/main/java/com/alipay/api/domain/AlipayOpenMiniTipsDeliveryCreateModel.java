package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序收藏tips引导投放创建
 *
 * @author auto create
 * @since 1.0, 2022-05-25 21:23:23
 */
public class AlipayOpenMiniTipsDeliveryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2815852444371568662L;

	/**
	 * 收藏引导文案内容，不得超过14个字
	 */
	@ApiField("delivery_content")
	private String deliveryContent;

	/**
	 * 收藏引导活动名称
	 */
	@ApiField("delivery_name")
	private String deliveryName;

	/**
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 匹配类型：GLOBAL为全局生效，TARGETURL为目标页面生效，需配置相应页面地址match_url。
	 */
	@ApiField("match_type")
	private String matchType;

	/**
	 * 目标页面地址
	 */
	@ApiField("match_url")
	private String matchUrl;

	/**
	 * 活动开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getDeliveryContent() {
		return this.deliveryContent;
	}
	public void setDeliveryContent(String deliveryContent) {
		this.deliveryContent = deliveryContent;
	}

	public String getDeliveryName() {
		return this.deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getMatchType() {
		return this.matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getMatchUrl() {
		return this.matchUrl;
	}
	public void setMatchUrl(String matchUrl) {
		this.matchUrl = matchUrl;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
