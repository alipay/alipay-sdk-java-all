package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二维码路由规则绑定记录openapi查询模型
 *
 * @author auto create
 * @since 1.0, 2022-01-17 11:04:39
 */
public class QrCodeRouteGroup extends AlipayObject {

	private static final long serialVersionUID = 3227251754251367585L;

	/**
	 * 匹配规则，EXACT（精确匹配）、FUZZY（模糊匹配）、PATTERN（模式匹配）\\（如：配置二维码地址为https://www.alipay.com/my?id=123，当用户扫这个地址的二维码可唤起小程序）。 模糊匹配：根据填写的二维码地址模糊匹配，只要地址前缀匹配即可唤起小程序（如：配置二维码地址为https://www.alipay.com/my/，当用户扫的二维码地址为https://www.alipay.com/my/id=123,可唤起小程序）。
。 模式匹配：根据填写的二维码地址可变变量进行匹配，只要地址的变量位置自定义，变量之外的部分匹配即可唤起小程序(如：配置的二维码地址为https://www.alipay.com/{0}/my/{1},当用户扫的二维码地址为：https://www.alipay.com/user/my/scan，可唤起小程序)
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 路由组id（参数说明：该参数可用于alipay.open.mini.qrcode.unbind接口入参route_group，进行二维码解绑）
	 */
	@ApiField("route_group")
	private String routeGroup;

	/**
	 * 规则路由地址
	 */
	@ApiField("route_url")
	private String routeUrl;

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getRouteGroup() {
		return this.routeGroup;
	}
	public void setRouteGroup(String routeGroup) {
		this.routeGroup = routeGroup;
	}

	public String getRouteUrl() {
		return this.routeUrl;
	}
	public void setRouteUrl(String routeUrl) {
		this.routeUrl = routeUrl;
	}

}
