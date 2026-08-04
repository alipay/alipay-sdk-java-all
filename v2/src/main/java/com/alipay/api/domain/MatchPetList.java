package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 匹配的宠物列表
 *
 * @author auto create
 * @since 1.0, 2026-07-31 15:12:54
 */
public class MatchPetList extends AlipayObject {

	private static final long serialVersionUID = 8268771242391287377L;

	/**
	 * 建档接口返回的宠物档案唯一标识
	 */
	@ApiField("pet_id")
	private String petId;

	/**
	 * 同宠匹配置信度得分 0-100 范围内的数字，分数越大可信度越高
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
