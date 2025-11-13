package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据租户用户ID获取FansId
 *
 * @author auto create
 * @since 1.0, 2025-05-21 13:53:29
 */
public class AnttechNftTenantidFansidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8499362595136848144L;

	/**
	 * 租户用户账号
	 */
	@ApiField("tenant_user_account")
	private String tenantUserAccount;

	public String getTenantUserAccount() {
		return this.tenantUserAccount;
	}
	public void setTenantUserAccount(String tenantUserAccount) {
		this.tenantUserAccount = tenantUserAccount;
	}

}
