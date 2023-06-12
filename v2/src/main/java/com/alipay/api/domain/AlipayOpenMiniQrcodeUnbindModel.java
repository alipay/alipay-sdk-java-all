package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除已联普遍二维码
 *
 * @author auto create
 * @since 1.0, 2023-04-06 19:25:36
 */
public class AlipayOpenMiniQrcodeUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 1776358923757598829L;

	/**
	 * 路由规则组，用于唯一标记一条路由规则。调用 https://opendocs.alipay.com/apis/00rkye 接口关联普通二维码后的返回值。
	 */
	@ApiField("route_group")
	private String routeGroup;

	public String getRouteGroup() {
		return this.routeGroup;
	}
	public void setRouteGroup(String routeGroup) {
		this.routeGroup = routeGroup;
	}

}
