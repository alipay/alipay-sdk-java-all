package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地理信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:03:58
 */
public class GeographyInfo extends AlipayObject {

	private static final long serialVersionUID = 2212915397436579692L;

	/**
	 * 省份城市区编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 匹配得分，整数
	 */
	@ApiField("score")
	private String score;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
