package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MenuBean;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.shop.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:28
 */
public class AlipayOfflineSmddShopCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7847266561851174887L;

	/** 
	 * 类目列表
	 */
	@ApiListField("menu_list")
	@ApiField("menu_bean")
	private List<MenuBean> menuList;

	public void setMenuList(List<MenuBean> menuList) {
		this.menuList = menuList;
	}
	public List<MenuBean> getMenuList( ) {
		return this.menuList;
	}

}
