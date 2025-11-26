package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除已联普遍二维码
 *
 * @author auto create
 * @since 1.0, 2025-08-18 17:27:08
 */
public class AlipayOpenMiniQrcodeUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 7579159773472954364L;

	/**
	 * 路由规则组，用于唯一标记一条路由规则。调用 <a href="https://opendocs.alipay.com/apis/00rkye" target="_blank">关联普通二维码</a> 接口关联普通二维码后的返回值。
	 */
	@ApiField("route_group")
	private String routeGroup;

	/**
	 * 路由规则URL，调用<a href="https://opendocs.alipay.com/apis/00rkye" target="_blank">关联普通二维码</a>接口传入的参数：route_url。解除模式与二维码的绑定关系需传入
	 */
	@ApiField("route_url")
	private String routeUrl;

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
