package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自建盒子查询菜谱下菜品的返回对象
 *
 * @author auto create
 * @since 1.0, 2018-12-20 11:36:48
 */
public class PosCookDishQryModel extends AlipayObject {

	private static final long serialVersionUID = 3723768747168946544L;

	/**
	 * 菜类的list，返回的是售卖类别的ID
	 */
	@ApiListField("cate_list")
	@ApiField("pos_cook_dish_cate_model")
	private List<PosCookDishCateModel> cateList;

	/**
	 * 菜品详情列表
	 */
	@ApiListField("dish_list")
	@ApiField("pos_cook_dish_qry_detail_model")
	private List<PosCookDishQryDetailModel> dishList;

	public List<PosCookDishCateModel> getCateList() {
		return this.cateList;
	}
	public void setCateList(List<PosCookDishCateModel> cateList) {
		this.cateList = cateList;
	}

	public List<PosCookDishQryDetailModel> getDishList() {
		return this.dishList;
	}
	public void setDishList(List<PosCookDishQryDetailModel> dishList) {
		this.dishList = dishList;
	}

}
