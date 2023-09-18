package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑虚拟类目菜品同步，门店关联的类目对象
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:15:36
 */
public class KbdishVirtualCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 1326713119283531426L;

	/**
	 * 虚拟类目id
	 */
	@ApiField("catetory_id")
	private String catetoryId;

	/**
	 * 口碑菜品列表
	 */
	@ApiListField("dish_list")
	@ApiField("kb_virtual_shop_category_dish_info")
	private List<KbVirtualShopCategoryDishInfo> dishList;

	public String getCatetoryId() {
		return this.catetoryId;
	}
	public void setCatetoryId(String catetoryId) {
		this.catetoryId = catetoryId;
	}

	public List<KbVirtualShopCategoryDishInfo> getDishList() {
		return this.dishList;
	}
	public void setDishList(List<KbVirtualShopCategoryDishInfo> dishList) {
		this.dishList = dishList;
	}

}
