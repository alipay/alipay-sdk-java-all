package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻分
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AliTrustScore extends AlipayObject {

	private static final long serialVersionUID = 8191444336357895871L;

	/**
	 * 芝麻分
	 */
	@ApiField("score")
	private Long score;

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

}
