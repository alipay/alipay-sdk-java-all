package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物搜索匹配度分数
 *
 * @author auto create
 * @since 1.0, 2022-06-21 18:14:06
 */
public class PetMatchScores extends AlipayObject {

	private static final long serialVersionUID = 5646364892176841383L;

	/**
	 * 宠物ID
	 */
	@ApiField("pet_id")
	private String petId;

	/**
	 * 匹配值分数
	 */
	@ApiField("score")
	private String score;

	public String getPetId() {
		return this.petId;
	}
	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
