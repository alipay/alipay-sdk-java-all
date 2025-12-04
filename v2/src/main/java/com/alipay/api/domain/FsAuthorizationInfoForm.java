package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 授权信息
 *
 * @author auto create
 * @since 1.0, 2025-05-25 11:08:06
 */
public class FsAuthorizationInfoForm extends AlipayObject {

	private static final long serialVersionUID = 6745162698693423957L;

	/**
	 * 授权业务域：券
	 */
	@ApiListField("authorized_domains")
	@ApiField("string")
	private List<String> authorizedDomains;

	/**
	 * 授权用户集合
	 */
	@ApiListField("authorized_users")
	@ApiField("string")
	private List<String> authorizedUsers;

	public List<String> getAuthorizedDomains() {
		return this.authorizedDomains;
	}
	public void setAuthorizedDomains(List<String> authorizedDomains) {
		this.authorizedDomains = authorizedDomains;
	}

	public List<String> getAuthorizedUsers() {
		return this.authorizedUsers;
	}
	public void setAuthorizedUsers(List<String> authorizedUsers) {
		this.authorizedUsers = authorizedUsers;
	}

}
