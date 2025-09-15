package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医院相关信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:03:58
 */
public class HosInfoInfo extends AlipayObject {

	private static final long serialVersionUID = 6189273447649575514L;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 匹配得分，整数
	 */
	@ApiField("score")
	private String score;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
