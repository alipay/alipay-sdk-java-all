package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.menu.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 12:03:39
 */
public class AlipayMobilePublicMenuGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1352717247691227986L;

	/** 
	 * success
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 菜单内容
	 */
	@ApiField("menu_content")
	private String menuContent;

	/** 
	 * 成功
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMenuContent(String menuContent) {
		this.menuContent = menuContent;
	}
	public String getMenuContent( ) {
		return this.menuContent;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
