package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.menu.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 20:30:12
 */
public class AlipayMobileStdPublicMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7571946422296887246L;

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
