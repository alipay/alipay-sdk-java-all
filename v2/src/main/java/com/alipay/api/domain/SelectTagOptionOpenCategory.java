package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签选项范围
 *
 * @author auto create
 * @since 1.0, 2022-12-21 13:58:09
 */
public class SelectTagOptionOpenCategory extends AlipayObject {

	private static final long serialVersionUID = 7334739346838153312L;

	/**
	 * 可选标签值列表
	 */
	@ApiField("options")
	private TagOptionCategoryOpenDetail options;

	/**
	 * 标签可选项范围分类ID
	 */
	@ApiField("tag_option_category_id")
	private Long tagOptionCategoryId;

	/**
	 * 标签可选项范围分类名称
	 */
	@ApiField("tag_option_category_name")
	private String tagOptionCategoryName;

	/**
	 * 标签可选项范围类型
	 */
	@ApiField("type")
	private String type;

	public TagOptionCategoryOpenDetail getOptions() {
		return this.options;
	}
	public void setOptions(TagOptionCategoryOpenDetail options) {
		this.options = options;
	}

	public Long getTagOptionCategoryId() {
		return this.tagOptionCategoryId;
	}
	public void setTagOptionCategoryId(Long tagOptionCategoryId) {
		this.tagOptionCategoryId = tagOptionCategoryId;
	}

	public String getTagOptionCategoryName() {
		return this.tagOptionCategoryName;
	}
	public void setTagOptionCategoryName(String tagOptionCategoryName) {
		this.tagOptionCategoryName = tagOptionCategoryName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
