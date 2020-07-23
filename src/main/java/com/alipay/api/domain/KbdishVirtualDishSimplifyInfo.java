package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 简化版虚拟类目同步菜品的信息
 *
 * @author auto create
 * @since 1.0, 2020-07-07 20:20:43
 */
public class KbdishVirtualDishSimplifyInfo extends AlipayObject {

	private static final long serialVersionUID = 2557341326976974497L;

	/**
	 * 外部菜品id
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * 菜品在虚拟类目中的排序值，只支持数字类型，如果不填默认1
	 */
	@ApiField("sort")
	private String sort;

	public String getOutDishId() {
		return this.outDishId;
	}
	public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

}
