package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 连接服务器响应
 *
 * @author auto create
 * @since 1.0, 2021-08-27 09:56:23
 */
public class ConnectServerAdaptResult extends AlipayObject {

	private static final long serialVersionUID = 2598134658222942332L;

	/**
	 * 排队次序
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 是否是人工客服时间
	 */
	@ApiField("is_service_time")
	private Boolean isServiceTime;

	/**
	 * 统一portal用排队文案
	 */
	@ApiField("portal_msg")
	private String portalMsg;

	/**
	 * 访客uid
	 */
	@ApiField("visitor_id")
	private String visitorId;

	/**
	 * 访客token
	 */
	@ApiField("visitor_token")
	private String visitorToken;

	/**
	 * 访客类型，COMMON_VISITOR(普通登录访客)/ANONYMITY_VISITOR(匿名访客)
	 */
	@ApiField("visitor_type")
	private String visitorType;

	/**
	 * 欢迎语
	 */
	@ApiField("welcome")
	private String welcome;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public Boolean getIsServiceTime() {
		return this.isServiceTime;
	}
	public void setIsServiceTime(Boolean isServiceTime) {
		this.isServiceTime = isServiceTime;
	}

	public String getPortalMsg() {
		return this.portalMsg;
	}
	public void setPortalMsg(String portalMsg) {
		this.portalMsg = portalMsg;
	}

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

	public String getVisitorType() {
		return this.visitorType;
	}
	public void setVisitorType(String visitorType) {
		this.visitorType = visitorType;
	}

	public String getWelcome() {
		return this.welcome;
	}
	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}

}
