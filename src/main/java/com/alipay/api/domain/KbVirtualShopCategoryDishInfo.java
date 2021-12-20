package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑门店关联的虚拟类目下的菜品信息
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:15:36
 */
public class KbVirtualShopCategoryDishInfo extends AlipayObject {

	private static final long serialVersionUID = 1428481916418236179L;

	/**
	 * 口碑菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 拓展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 菜品在虚拟类目中的排序值
	 */
	@ApiField("sort")
	private String sort;

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

}
