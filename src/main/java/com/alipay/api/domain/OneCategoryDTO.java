package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 一级标签类目信息
 *
 * @author auto create
 * @since 1.0, 2022-05-19 15:11:14
 */
public class OneCategoryDTO extends AlipayObject {

	private static final long serialVersionUID = 5785257563154219176L;

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
	 * 标签列表+唯一
	 */
	@ApiListField("tag_dto_list")
	@ApiField("tag_d_t_o")
	private List<TagDTO> tagDtoList;

	/**
	 * 二级标签类目列表+不唯一
	 */
	@ApiListField("two_category_dto_list")
	@ApiField("two_category_d_t_o")
	private List<TwoCategoryDTO> twoCategoryDtoList;

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

	public List<TagDTO> getTagDtoList() {
		return this.tagDtoList;
	}
	public void setTagDtoList(List<TagDTO> tagDtoList) {
		this.tagDtoList = tagDtoList;
	}

	public List<TwoCategoryDTO> getTwoCategoryDtoList() {
		return this.twoCategoryDtoList;
	}
	public void setTwoCategoryDtoList(List<TwoCategoryDTO> twoCategoryDtoList) {
		this.twoCategoryDtoList = twoCategoryDtoList;
	}

}
