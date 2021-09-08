package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品牌box触发词
 *
 * @author auto create
 * @since 1.0, 2021-07-12 16:44:42
 */
public class BoxExclusiveKeyword extends AlipayObject {

	private static final long serialVersionUID = 4443331335719992833L;

	/**
	 * 默认品牌触发词
	 */
	@ApiListField("default_keywords")
	@ApiField("string")
	private List<String> defaultKeywords;

	/**
	 * 自定义品牌触发词
	 */
	@ApiListField("keywords")
	@ApiField("string")
	private List<String> keywords;

	public List<String> getDefaultKeywords() {
		return this.defaultKeywords;
	}
	public void setDefaultKeywords(List<String> defaultKeywords) {
		this.defaultKeywords = defaultKeywords;
	}

	public List<String> getKeywords() {
		return this.keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

}
