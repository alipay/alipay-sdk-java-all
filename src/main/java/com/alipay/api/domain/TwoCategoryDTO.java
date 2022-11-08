package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 二级标签类目信息
 *
 * @author auto create
 * @since 1.0, 2022-05-18 15:35:11
 */
public class TwoCategoryDTO extends AlipayObject {

	private static final long serialVersionUID = 4451423279135172264L;

	/**
	 * 类目ID+唯一
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 类目名称+不唯一
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 父类目ID+唯一
	 */
	@ApiField("parent_category_id")
	private String parentCategoryId;

	/**
	 * 标签列表+不唯一
	 */
	@ApiListField("tag_dto_list")
	@ApiField("tag_d_t_o")
	private List<TagDTO> tagDtoList;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getParentCategoryId() {
		return this.parentCategoryId;
	}
	public void setParentCategoryId(String parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	public List<TagDTO> getTagDtoList() {
		return this.tagDtoList;
	}
	public void setTagDtoList(List<TagDTO> tagDtoList) {
		this.tagDtoList = tagDtoList;
	}

}
