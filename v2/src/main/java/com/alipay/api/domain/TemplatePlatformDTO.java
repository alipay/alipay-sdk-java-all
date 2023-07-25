package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版来源渠道
 *
 * @author auto create
 * @since 1.0, 2023-06-25 15:16:52
 */
public class TemplatePlatformDTO extends AlipayObject {

	private static final long serialVersionUID = 4637285147288976988L;

	/**
	 * 卡券所属业务线，如飞猪在其内部营销平台里，通过营销活动为新用户发放优惠券，那此处填写飞猪业务线：fliggy。支持自定义动态参数传值，但动态参数需定义为：$_r_biz_from_bu$。
	 */
	@ApiField("biz_from_bu")
	private String bizFromBu;

	/**
	 * 卡券所属业务平台，如飞猪在其内部营销平台里，通过营销活动为新用户发放优惠券，那此处填写营销平台名称：marketing。支持自定义动态参数传值，但动态参数需定义为：$_r_biz_from_platform$。
	 */
	@ApiField("biz_from_platform")
	private String bizFromPlatform;

	/**
	 * 卡券所属业务场景，如飞猪在其内部营销平台里，通过营销活动为新用户发放优惠券，那此处填写营销活动编码：newUserPromo。支持自定义动态参数传值，但动态参数需定义为：$_r_biz_from_scene$。
	 */
	@ApiField("biz_from_scene")
	private String bizFromScene;

	/**
	 * 卡券所属商户在支付宝的商户号(pid)，如代理商代替商户设置卡券时，此值为被代理的商户的商户号(pid)。支持以 $动态参数$ 形式的自定义动态参数传值，但动态参数需定义为$channelID$。
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道商服务地址，用于将支付宝相关的信息同步给第三方，需要带上http、https、alipays等协议头。支持以 $动态参数$ 形式的自定义动态参数传值。
	 */
	@ApiField("web_service_url")
	private String webServiceUrl;

	public String getBizFromBu() {
		return this.bizFromBu;
	}
	public void setBizFromBu(String bizFromBu) {
		this.bizFromBu = bizFromBu;
	}

	public String getBizFromPlatform() {
		return this.bizFromPlatform;
	}
	public void setBizFromPlatform(String bizFromPlatform) {
		this.bizFromPlatform = bizFromPlatform;
	}

	public String getBizFromScene() {
		return this.bizFromScene;
	}
	public void setBizFromScene(String bizFromScene) {
		this.bizFromScene = bizFromScene;
	}

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getWebServiceUrl() {
		return this.webServiceUrl;
	}
	public void setWebServiceUrl(String webServiceUrl) {
		this.webServiceUrl = webServiceUrl;
	}

}
