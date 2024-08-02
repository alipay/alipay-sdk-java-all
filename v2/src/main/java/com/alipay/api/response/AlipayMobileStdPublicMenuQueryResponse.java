package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.menu.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:20
 */
public class AlipayMobileStdPublicMenuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6572449656656432651L;

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
