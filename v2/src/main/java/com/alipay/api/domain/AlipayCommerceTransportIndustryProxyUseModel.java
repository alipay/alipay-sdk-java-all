package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝出行行业-行业代理接口
 *
 * @author auto create
 * @since 1.0, 2023-12-06 12:03:49
 */
public class AlipayCommerceTransportIndustryProxyUseModel extends AlipayObject {

	private static final long serialVersionUID = 5141145598332691214L;

	/**
	 * 描述当前行业代理请求的请求事件
	 */
	@ApiField("industry_event")
	private String industryEvent;

	/**
	 * 行业代理请求的业务请求内容，根据行业场景、行业事件的变化而不同
	 */
	@ApiField("industry_request")
	private String industryRequest;

	/**
	 * 描述当前行业代理请求的请求场景
	 */
	@ApiField("industry_scene")
	private String industryScene;

	/**
	 * 网关open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支持商户接入此业务的系统服务商id
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	/**
	 * 商户特殊用户ID|蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getIndustryEvent() {
		return this.industryEvent;
	}
	public void setIndustryEvent(String industryEvent) {
		this.industryEvent = industryEvent;
	}

	public String getIndustryRequest() {
		return this.industryRequest;
	}
	public void setIndustryRequest(String industryRequest) {
		this.industryRequest = industryRequest;
	}

	public String getIndustryScene() {
		return this.industryScene;
	}
	public void setIndustryScene(String industryScene) {
		this.industryScene = industryScene;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
