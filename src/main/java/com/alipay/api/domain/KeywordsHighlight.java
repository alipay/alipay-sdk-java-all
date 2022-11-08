package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 关键字高亮
 *
 * @author auto create
 * @since 1.0, 2022-03-02 17:13:04
 */
public class KeywordsHighlight extends AlipayObject {

	private static final long serialVersionUID = 7586714788176492758L;

	/**
	 * 将搜索关键字用<em>进行高亮显示
	 */
	@ApiListField("searchable_text")
	@ApiField("string")
	private List<String> searchableText;

	/**
	 * 摘要的高亮字段
	 */
	@ApiListField("summary")
	@ApiField("string")
	private List<String> summary;

	/**
	 * 将标题关键字高亮显示
	 */
	@ApiListField("title")
	@ApiField("string")
	private List<String> title;

	public List<String> getSearchableText() {
		return this.searchableText;
	}
	public void setSearchableText(List<String> searchableText) {
		this.searchableText = searchableText;
	}

	public List<String> getSummary() {
		return this.summary;
	}
	public void setSummary(List<String> summary) {
		this.summary = summary;
	}

	public List<String> getTitle() {
		return this.title;
	}
	public void setTitle(List<String> title) {
		this.title = title;
	}

}
