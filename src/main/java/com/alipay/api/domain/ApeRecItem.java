package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐item
 *
 * @author auto create
 * @since 1.0, 2022-10-14 10:21:19
 */
public class ApeRecItem extends AlipayObject {

	private static final long serialVersionUID = 8435427213777189724L;

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
