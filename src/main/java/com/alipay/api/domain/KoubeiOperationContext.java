package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * context 保存操作者信息
 *
 * @author auto create
 * @since 1.0, 2016-12-22 09:37:28
 */
public class KoubeiOperationContext extends AlipayObject {

	private static final long serialVersionUID = 7471882446639734198L;

	/**
	 * 如果是isv代操作，请传入ISV；如果是其他角色（商户MERCHANT、服务商PROVIDER、服务商员工S_STAFF、商户员工M_STAFF）操作，不用填写。
	 */
	@ApiField("op_role")
	private String opRole;

	public String getOpRole() {
		return this.opRole;
	}
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

}
