package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 接入运营平台提报申请单数据详情
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:34
 */
public class SearchBaseItems extends AlipayObject {

	private static final long serialVersionUID = 2323249499419572869L;

	/**
	 * 搜索可见性
	 */
	@ApiField("can_search")
	private Boolean canSearch;

	/**
	 * 提报关键词列表
	 */
	@ApiListField("key_words")
	@ApiField("string")
	private List<String> keyWords;

	public Boolean getCanSearch() {
		return this.canSearch;
	}
	public void setCanSearch(Boolean canSearch) {
		this.canSearch = canSearch;
	}

	public List<String> getKeyWords() {
		return this.keyWords;
	}
	public void setKeyWords(List<String> keyWords) {
		this.keyWords = keyWords;
	}

}
