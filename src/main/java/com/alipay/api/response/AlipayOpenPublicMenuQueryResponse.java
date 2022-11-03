package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.menu.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-09 00:30:02
 */
public class AlipayOpenPublicMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3744344876612171358L;

	/** 
	 * 一级菜单数组，个数应为1~4个
	 */
	@ApiField("menu_content")
	private String menuContent;

	public void setMenuContent(String menuContent) {
		this.menuContent = menuContent;
	}
	public String getMenuContent( ) {
		return this.menuContent;
	}

}
