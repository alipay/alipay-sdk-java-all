package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作员详情查询
 *
 * @author auto create
 * @since 1.0, 2018-07-13 20:44:03
 */
public class KoubeiMerchantOperatorDetailsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3182872272474214381L;

	/**
	 * 授权码
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
