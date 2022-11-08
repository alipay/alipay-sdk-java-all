package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐item
 *
 * @author auto create
 * @since 1.0, 2022-11-01 20:40:06
 */
public class ApeRecItem extends AlipayObject {

	private static final long serialVersionUID = 3515513548913351646L;

	/**
	 * 物品id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 关键字段
	 */
	@ApiField("key_words")
	private String keyWords;

	/**
	 * item的打分
	 */
	@ApiField("score")
	private String score;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getKeyWords() {
		return this.keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
