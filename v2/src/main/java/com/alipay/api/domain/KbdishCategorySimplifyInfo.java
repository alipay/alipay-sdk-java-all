package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜谱类目简化模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:13:33
 */
public class KbdishCategorySimplifyInfo extends AlipayObject {

	private static final long serialVersionUID = 1219153382878317567L;

	/**
	 * 菜谱类目名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 类目下菜品列表
	 */
	@ApiListField("dish_list")
	@ApiField("kbdish_cook_detail_simplify_info")
	private List<KbdishCookDetailSimplifyInfo> dishList;

	/**
	 * 类目是否隐藏，默认不隐藏
	 */
	@ApiField("hidden")
	private Boolean hidden;

	/**
	 * 类目标签图片id
	 */
	@ApiField("label_image")
	private String labelImage;

	/**
	 * 类目排序
	 */
	@ApiField("sort")
	private String sort;

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<KbdishCookDetailSimplifyInfo> getDishList() {
		return this.dishList;
	}
	public void setDishList(List<KbdishCookDetailSimplifyInfo> dishList) {
		this.dishList = dishList;
	}

	public Boolean getHidden() {
		return this.hidden;
	}
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public String getLabelImage() {
		return this.labelImage;
	}
	public void setLabelImage(String labelImage) {
		this.labelImage = labelImage;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

}
