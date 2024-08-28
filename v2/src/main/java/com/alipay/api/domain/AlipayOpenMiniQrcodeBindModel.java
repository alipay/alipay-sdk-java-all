package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联普通二维码
 *
 * @author auto create
 * @since 1.0, 2024-06-07 17:30:04
 */
public class AlipayOpenMiniQrcodeBindModel extends AlipayObject {

	private static final long serialVersionUID = 1717867951883948344L;

	/**
	 * 匹配规则，仅支持EXACT（精确匹配）、FUZZY（模糊匹配）两个值。

精确匹配：根据填写的二维码地址精确匹配，地址完全一致时才能唤起小程序（如：配置二维码地址为https://www.alipay.com/my?id=123，当用户扫这个地址的二维码可唤起小程序）。

模糊匹配：根据填写的二维码地址模糊匹配，只要地址前缀匹配即可唤起小程序（如：配置二维码地址为https://www.alipay.com/my/，当用户扫的二维码地址为https://www.alipay.com/my/id=123,可唤起小程序）。
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 小程序功能页，配置扫描二维码后打开的小程序功能页面路径
	 */
	@ApiField("page_redirection")
	private String pageRedirection;

	/**
	 * 模式，用于描述通用的路由url格式，适用于同一个host下面存在大量路由的场景，主要用于提升路由性能，其中{0}、{1} 代表路径中的变量
	 */
	@ApiField("route_pattern")
	private String routePattern;

	/**
	 * 二维码域名，须通过ICP备案验证，支持http、https、ftp开头的链接
	 */
	@ApiField("route_url")
	private String routeUrl;

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getPageRedirection() {
		return this.pageRedirection;
	}
	public void setPageRedirection(String pageRedirection) {
		this.pageRedirection = pageRedirection;
	}

	public String getRoutePattern() {
		return this.routePattern;
	}
	public void setRoutePattern(String routePattern) {
		this.routePattern = routePattern;
	}

	public String getRouteUrl() {
		return this.routeUrl;
	}
	public void setRouteUrl(String routeUrl) {
		this.routeUrl = routeUrl;
	}

}
