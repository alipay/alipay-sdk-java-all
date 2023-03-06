package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标签信息
 *
 * @author auto create
 * @since 1.0, 2023-01-03 20:44:32
 */
public class CrowdSelectTagOpen extends AlipayObject {

	private static final long serialVersionUID = 6128656989133664584L;

	/**
	 * 分类的标签值列表
	 */
	@ApiListField("category_tag_option_list")
	@ApiField("crowd_select_tag_category_open")
	private List<CrowdSelectTagCategoryOpen> categoryTagOptionList;

	/**
	 * 标签id，通过标签创建人群时使用
	 */
	@ApiField("tag_id")
	private Long tagId;

	/**
	 * 地域、人生阶段、职业等
	 */
	@ApiField("tag_name")
	private String tagName;

	public List<CrowdSelectTagCategoryOpen> getCategoryTagOptionList() {
		return this.categoryTagOptionList;
	}
	public void setCategoryTagOptionList(List<CrowdSelectTagCategoryOpen> categoryTagOptionList) {
		this.categoryTagOptionList = categoryTagOptionList;
	}

	public Long getTagId() {
		return this.tagId;
	}
	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
