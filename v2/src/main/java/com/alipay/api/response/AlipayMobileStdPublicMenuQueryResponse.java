package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.menu.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 12:03:34
 */
public class AlipayMobileStdPublicMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4573317442653772388L;

	/** 
	 * 所有菜单列表json串
	 */
	@ApiField("all_menu_list")
	private String allMenuList;

	public void setAllMenuList(String allMenuList) {
		this.allMenuList = allMenuList;
	}
	public String getAllMenuList( ) {
		return this.allMenuList;
	}

}
