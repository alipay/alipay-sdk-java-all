package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分类的标签值列表
 *
 * @author auto create
 * @since 1.0, 2023-01-03 20:07:59
 */
public class CrowdSelectTagCategoryOpen extends AlipayObject {

	private static final long serialVersionUID = 4539959365293997571L;

	/**
	 * 标签可选项范围分类ID，通过标签创建人群时使用
	 */
	@ApiField("tag_option_category_id")
	private Long tagOptionCategoryId;

	/**
	 * 标签可选项范围分类名称
	 */
	@ApiField("tag_option_category_name")
	private String tagOptionCategoryName;

	/**
	 * 可选标签值列表
	 */
	@ApiListField("tag_option_list")
	@ApiField("crowd_select_tag_option_open")
	private List<CrowdSelectTagOptionOpen> tagOptionList;

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

	public List<CrowdSelectTagOptionOpen> getTagOptionList() {
		return this.tagOptionList;
	}
	public void setTagOptionList(List<CrowdSelectTagOptionOpen> tagOptionList) {
		this.tagOptionList = tagOptionList;
	}

}
