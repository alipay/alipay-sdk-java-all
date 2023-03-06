package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.menu.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-01 18:43:03
 */
public class AlipayOpenPublicMenuCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8521144446251788711L;

	/** 
	 * 默认菜单菜单key，文本菜单为“default”，icon菜单为“iconDefault”
	 */
	@ApiField("menu_key")
	private String menuKey;

	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	public String getMenuKey( ) {
		return this.menuKey;
	}

}
