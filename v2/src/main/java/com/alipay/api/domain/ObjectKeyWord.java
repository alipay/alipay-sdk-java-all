package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * KeyWordDTO
 *
 * @author auto create
 * @since 1.0, 2020-10-12 16:13:43
 */
public class ObjectKeyWord extends AlipayObject {

	private static final long serialVersionUID = 2287817649593685528L;

	/**
	 * 大类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 物体标签
	 */
	@ApiField("key_word")
	private String keyWord;

	/**
	 * 置信度
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
