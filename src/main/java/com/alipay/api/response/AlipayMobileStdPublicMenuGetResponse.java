package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.menu.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobileStdPublicMenuGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2899387155195374126L;

	/** 
	 * 菜单内容
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
