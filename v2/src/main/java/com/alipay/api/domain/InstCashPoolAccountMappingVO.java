package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金池账户关联VO
 *
 * @author auto create
 * @since 1.0, 2022-11-03 11:24:32
 */
public class InstCashPoolAccountMappingVO extends AlipayObject {

	private static final long serialVersionUID = 1554622522158524289L;

	/**
	 * 资金池唯一标识
	 */
	@ApiField("cash_pool_id")
	private String cashPoolId;

	/**
	 * 当前机构账户
	 */
	@ApiField("inst_account")
	private InstAccountDTO instAccount;

	/**
	 * 当前账号是否为资金池主账号，Y是，N不是
	 */
	@ApiField("main_account")
	private String mainAccount;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 父账号
	 */
	@ApiField("parent_inst_account")
	private InstAccountDTO parentInstAccount;

	public String getCashPoolId() {
		return this.cashPoolId;
	}
	public void setCashPoolId(String cashPoolId) {
		this.cashPoolId = cashPoolId;
	}

	public InstAccountDTO getInstAccount() {
		return this.instAccount;
	}
	public void setInstAccount(InstAccountDTO instAccount) {
		this.instAccount = instAccount;
	}

	public String getMainAccount() {
		return this.mainAccount;
	}
	public void setMainAccount(String mainAccount) {
		this.mainAccount = mainAccount;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public InstAccountDTO getParentInstAccount() {
		return this.parentInstAccount;
	}
	public void setParentInstAccount(InstAccountDTO parentInstAccount) {
		this.parentInstAccount = parentInstAccount;
	}

}
