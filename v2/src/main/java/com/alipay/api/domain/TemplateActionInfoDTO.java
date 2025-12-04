package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡行动点配置
 *
 * @author auto create
 * @since 1.0, 2024-07-03 15:04:59
 */
public class TemplateActionInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2818493284329517372L;

	/**
	 * 行动点业务CODE，商户自定义
	 */
	@ApiField("code")
	private String code;

	/**
	 * 小程序页面跳转链接，当url_type取"miniAppUrl"时必填
	 */
	@ApiField("mini_app_url")
	private TemplateActionMiniAppUrlDTO miniAppUrl;

	/**
	 * 行动点展示文案
	 */
	@ApiField("text")
	private String text;

	/**
	 * 行动点跳转链接，当url_type填"url"或不填时必填，支持http(s)和支付宝schema地址等
	 */
	@ApiField("url")
	private String url;

	/**
	 * 跳转链接类型，不填则默认为url类型：

url：对应填写url参数

miniAppUrl: 对应填写mini_app_url参数，跳转至指定的支付宝小程序页面
	 */
	@ApiField("url_type")
	private String urlType;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public TemplateActionMiniAppUrlDTO getMiniAppUrl() {
		return this.miniAppUrl;
	}
	public void setMiniAppUrl(TemplateActionMiniAppUrlDTO miniAppUrl) {
		this.miniAppUrl = miniAppUrl;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlType() {
		return this.urlType;
	}
	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}

}
