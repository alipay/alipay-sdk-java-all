package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权主体信息
 *
 * @author auto create
 * @since 1.0, 2022-03-31 17:03:32
 */
public class PrincipalPartyInfo extends AlipayObject {

	private static final long serialVersionUID = 4695478992758499334L;

	/**
	 * 授权主体的支付宝登录号，如传递，则授权用户的登录号必须和指定的登录号匹配，否则授权流程会被阻塞
	 */
	@ApiField("principal_account_no")
	private String principalAccountNo;

	/**
	 * 授权主体证件号，默认为身份证号码
	 */
	@ApiField("principal_cert_no")
	private String principalCertNo;

	/**
	 * 授权主体名称
	 */
	@ApiField("principal_name")
	private String principalName;

	public String getPrincipalAccountNo() {
		return this.principalAccountNo;
	}
	public void setPrincipalAccountNo(String principalAccountNo) {
		this.principalAccountNo = principalAccountNo;
	}

	public String getPrincipalCertNo() {
		return this.principalCertNo;
	}
	public void setPrincipalCertNo(String principalCertNo) {
		this.principalCertNo = principalCertNo;
	}

	public String getPrincipalName() {
		return this.principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

}
