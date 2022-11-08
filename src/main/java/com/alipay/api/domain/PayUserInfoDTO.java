package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付用户信息
 *
 * @author auto create
 * @since 1.0, 2022-01-05 10:55:15
 */
public class PayUserInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8492971937684952245L;

	/**
	 * 主体类型
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 主体id
	 */
	@ApiField("user_id")
	private String userId;

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
