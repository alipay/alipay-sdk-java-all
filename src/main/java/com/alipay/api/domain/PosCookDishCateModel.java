package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询菜谱下菜品时候的菜类模型
 *
 * @author auto create
 * @since 1.0, 2018-12-20 11:36:48
 */
public class PosCookDishCateModel extends AlipayObject {

	private static final long serialVersionUID = 6862645385367489952L;

	/**
	 * 菜类下的菜品数量
	 */
	@ApiField("cate_dish_num")
	private Long cateDishNum;

	/**
	 * 菜类ID
	 */
	@ApiField("cate_id")
	private String cateId;

	/**
	 * 菜类的名字
	 */
	@ApiField("cate_name")
	private String cateName;

	/**
	 * 菜类的排序号
	 */
	@ApiField("cate_sort")
	private Long cateSort;

	public Long getCateDishNum() {
		return this.cateDishNum;
	}
	public void setCateDishNum(Long cateDishNum) {
		this.cateDishNum = cateDishNum;
	}

	public String getCateId() {
		return this.cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}

	public String getCateName() {
		return this.cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public Long getCateSort() {
		return this.cateSort;
	}
	public void setCateSort(Long cateSort) {
		this.cateSort = cateSort;
	}

}
