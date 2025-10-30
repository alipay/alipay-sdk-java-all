package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生身份单次核验接口
 *
 * @author auto create
 * @since 1.0, 2024-04-19 17:39:54
 */
public class AlipayCommerceEducateStudentIdentityVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 5567515961932927679L;

	/**
	 * 单次核验业务token
	 */
	@ApiField("biz_token")
	private String bizToken;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

}
