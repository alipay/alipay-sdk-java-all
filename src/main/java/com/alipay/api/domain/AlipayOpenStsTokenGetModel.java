package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * STS临时token获取
 *
 * @author auto create
 * @since 1.0, 2020-05-26 17:41:11
 */
public class AlipayOpenStsTokenGetModel extends AlipayObject {

	private static final long serialVersionUID = 1827964487217373551L;

	/**
	 * 当前安全令牌
	 */
	@ApiField("security_token")
	private String securityToken;

	/**
	 * 终端运行环境信息
	 */
	@ApiField("terminal")
	private Terminal terminal;

	public String getSecurityToken() {
		return this.securityToken;
	}
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
	}

	public Terminal getTerminal() {
		return this.terminal;
	}
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

}
