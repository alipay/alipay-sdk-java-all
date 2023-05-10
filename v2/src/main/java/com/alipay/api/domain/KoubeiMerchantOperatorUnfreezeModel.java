package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 解锁操作员接口
 *
 * @author auto create
 * @since 1.0, 2022-06-17 16:44:48
 */
public class KoubeiMerchantOperatorUnfreezeModel extends AlipayObject {

	private static final long serialVersionUID = 6342497933229476966L;

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
