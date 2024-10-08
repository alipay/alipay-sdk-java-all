package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作员登录密码校验
 *
 * @author auto create
 * @since 1.0, 2023-02-08 19:34:49
 */
public class AlipayUserAccountOperatorLogonpasswordVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 4265867455145972795L;

	/**
	 * 场景码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 操作员登录号
	 */
	@ApiField("operator_logon_id")
	private String operatorLogonId;

	/**
	 * 操作员登录密码
	 */
	@ApiField("operator_logon_pwd")
	private String operatorLogonPwd;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getOperatorLogonId() {
		return this.operatorLogonId;
	}
	public void setOperatorLogonId(String operatorLogonId) {
		this.operatorLogonId = operatorLogonId;
	}

	public String getOperatorLogonPwd() {
		return this.operatorLogonPwd;
	}
	public void setOperatorLogonPwd(String operatorLogonPwd) {
		this.operatorLogonPwd = operatorLogonPwd;
	}

}
