package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构资金管理账户同步
 *
 * @author auto create
 * @since 1.0, 2022-10-28 17:18:33
 */
public class AlipayAccountInstfundAccountSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2586887917181159134L;

	/**
	 * 账号信息
	 */
	@ApiField("inst_account")
	private InstAccountDTO instAccount;

	public InstAccountDTO getInstAccount() {
		return this.instAccount;
	}
	public void setInstAccount(InstAccountDTO instAccount) {
		this.instAccount = instAccount;
	}

}
