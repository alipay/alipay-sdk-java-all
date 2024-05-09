package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品牌box触发词
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:29
 */
public class BoxExclusiveKeyword extends AlipayObject {

	private static final long serialVersionUID = 8512179618375552133L;

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
