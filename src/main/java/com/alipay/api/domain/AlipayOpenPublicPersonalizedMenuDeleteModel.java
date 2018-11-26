package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个性化菜单删除
 *
 * @author auto create
 * @since 1.0, 2018-07-25 13:53:26
 */
public class AlipayOpenPublicPersonalizedMenuDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5713658968714489434L;

	/**
	 * 要删除的个性化菜单key
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
