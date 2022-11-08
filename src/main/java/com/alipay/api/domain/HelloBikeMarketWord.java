package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关键字
 *
 * @author auto create
 * @since 1.0, 2022-03-22 13:19:14
 */
public class HelloBikeMarketWord extends AlipayObject {

	private static final long serialVersionUID = 6891739489134787227L;

	/**
	 * 关键字
	 */
	@ApiField("words")
	private String words;

	/**
	 * 关键字类型
	 */
	@ApiField("words_type")
	private String wordsType;

	public String getWords() {
		return this.words;
	}
	public void setWords(String words) {
		this.words = words;
	}

	public String getWordsType() {
		return this.wordsType;
	}
	public void setWordsType(String wordsType) {
		this.wordsType = wordsType;
	}

}
