package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Voyager基础用户信息
 *
 * @author auto create
 * @since 1.0, 2026-04-10 10:47:44
 */
public class VoyagerUserInfo extends AlipayObject {

	private static final long serialVersionUID = 6315289195159389847L;

	/**
	 * Voyager对流量端分配的ID
	 */
	@ApiField("traffic_side_id")
	private String trafficSideId;

	/**
	 * Voyager业务在流量端的用户openId
	 */
	@ApiField("traffic_side_open_id")
	private String trafficSideOpenId;

	/**
	 * Voyager对外提供的用户openId
	 */
	@ApiField("voyager_user_id")
	private String voyagerUserId;

	public String getTrafficSideId() {
		return this.trafficSideId;
	}
	public void setTrafficSideId(String trafficSideId) {
		this.trafficSideId = trafficSideId;
	}

	public String getTrafficSideOpenId() {
		return this.trafficSideOpenId;
	}
	public void setTrafficSideOpenId(String trafficSideOpenId) {
		this.trafficSideOpenId = trafficSideOpenId;
	}

	public String getVoyagerUserId() {
		return this.voyagerUserId;
	}
	public void setVoyagerUserId(String voyagerUserId) {
		this.voyagerUserId = voyagerUserId;
	}

}
