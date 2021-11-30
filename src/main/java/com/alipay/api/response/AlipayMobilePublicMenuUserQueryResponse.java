package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.menu.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicMenuUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7651754486693793842L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 菜单唯一标识
	 */
	@ApiField("menu_key")
	private String menuKey;

	/** 
	 * 结果码描述
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	public String getMenuKey( ) {
		return this.menuKey;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
