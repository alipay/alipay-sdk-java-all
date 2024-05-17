package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作人信息
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:34:53
 */
public class PortfolioOperatorInfo extends AlipayObject {

	private static final long serialVersionUID = 3526711438449862691L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为
 koubei.member.data.oauth.query 中的auth_code，默认有效期24小时；ISV自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 如果是 ISV 代操作，请传入 ISV；
如果是其他角色（商户MER、商户操作员MER_OPERATOR、服务商PROVIDER、服务商员工PROVIDER_STAFF、系统SYSTEM）操作，不用填写。
	 */
	@ApiField("op_role")
	private String opRole;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getOpRole() {
		return this.opRole;
	}
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

}
