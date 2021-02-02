package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 默认菜单删除
 *
 * @author auto create
 * @since 1.0, 2020-09-24 17:03:11
 */
public class AlipayOpenPublicMenuDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3681115553146778121L;

	/**
	 * 默认菜单菜单key，文本菜单为“default”，icon菜单为“iconDefault”
	 */
	@ApiField("menu_key")
	private String menuKey;

	public String getMenuKey() {
		return this.menuKey;
	}
	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}

}
