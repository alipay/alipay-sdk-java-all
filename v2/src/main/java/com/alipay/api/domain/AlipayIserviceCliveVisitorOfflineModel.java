package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消排队
 *
 * @author auto create
 * @since 1.0, 2021-08-27 09:57:15
 */
public class AlipayIserviceCliveVisitorOfflineModel extends AlipayObject {

	private static final long serialVersionUID = 6525469687425921617L;

	/**
	 * 访客id
	 */
	@ApiField("visitor_id")
	private String visitorId;

	/**
	 * DT端定义的访客token
	 */
	@ApiField("visitor_token")
	private String visitorToken;

	public String getVisitorId() {
		return this.visitorId;
	}
	public void setVisitorId(String visitorId) {
		this.visitorId = visitorId;
	}

	public String getVisitorToken() {
		return this.visitorToken;
	}
	public void setVisitorToken(String visitorToken) {
		this.visitorToken = visitorToken;
	}

}
