package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 锁定操作员
 *
 * @author auto create
 * @since 1.0, 2021-05-06 14:57:40
 */
public class KoubeiMerchantOperatorFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 4477654724997344766L;

	/**
	 * 操作码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

}
