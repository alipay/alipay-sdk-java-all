package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 垃圾分类关键字
 *
 * @author auto create
 * @since 1.0, 2019-07-06 17:26:35
 */
public class KeyWordDTO extends AlipayObject {

	private static final long serialVersionUID = 7849375423713738866L;

	/**
	 * 垃圾类别
	 */
	@ApiField("category")
	private String category;

	/**
	 * 垃圾名称
	 */
	@ApiField("key_word")
	private String keyWord;

	/**
	 * 置信度打分
	 */
	@ApiField("score")
	private String score;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getKeyWord() {
		return this.keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
