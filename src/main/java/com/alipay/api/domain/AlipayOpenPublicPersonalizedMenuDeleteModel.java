package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个性化菜单删除
 *
 * @author auto create
 * @since 1.0, 2021-05-27 16:34:12
 */
public class AlipayOpenPublicPersonalizedMenuDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2325979756567268634L;

	/**
	 * 要删除的个性化菜单key。通过 <a href="https://opendocs.alipay.com/apis/api_6/alipay.open.public.personalized.menu.create">alipay.open.public.personalized.menu.create</a>(个性化菜单创建)接口创建个性化菜单后获取。
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
