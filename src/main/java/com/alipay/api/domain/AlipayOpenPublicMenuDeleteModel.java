package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 默认菜单删除
 *
 * @author auto create
 * @since 1.0, 2018-04-27 10:59:29
 */
public class AlipayOpenPublicMenuDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2673194142471137114L;

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
